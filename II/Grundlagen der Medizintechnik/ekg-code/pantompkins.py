"""
Pan-Tompkins QRS detector for ECG data stored in a CSV file.

Pipeline (classic Pan-Tompkins, 1985):
  1. Bandpass filter (~5-15 Hz)  -> emphasises the QRS complex
  2. Derivative                  -> highlights the slope of the R wave
  3. Squaring                    -> makes everything positive, sharpens peaks
  4. Moving-window integration   -> combines QRS energy into one blob per beat
  5. Adaptive thresholding + search-back -> detects R peaks, also handles noisy/missed beats

Usage:
    python pan_tompkins.py ecg.csv --fs 360 --column ecg
    # if your CSV has a time column, fs can be estimated automatically

Dependencies:
    pip install numpy pandas scipy matplotlib
"""

import argparse
import numpy as np
import pandas as pd
from scipy import signal as sg
import matplotlib.pyplot as plt


# ----------------------------------------------------------------------
# 1. Loading
# ----------------------------------------------------------------------
def load_ecg(path: str, column: str | None = None):
    """Load ECG signal from CSV. Returns (signal, fs)."""
    df = pd.read_csv(path)
    if column is None:
        # assume the first numeric column that isn't a time/index column
        num_cols = df.select_dtypes(include=[np.number]).columns.tolist()
        if not num_cols:
            raise ValueError("No numeric column found in the CSV.")
        column = num_cols[0]
    ecg = df[column].to_numpy(dtype=float)

    # Sampling frequency: given explicitly, or estimated from a time column
    fs = None
    for cand in ("time", "t", "Time", "timestamp", "seconds"):
        if cand in df.columns:
            t = df[cand].to_numpy(dtype=float)
            fs = 1.0 / np.median(np.diff(t))
            break
    return ecg, fs, column


# ----------------------------------------------------------------------
# 2. Preprocessing stages
# ----------------------------------------------------------------------
def bandpass_filter(x: np.ndarray, fs: float) -> np.ndarray:
    """5-15 Hz bandpass, the standard Pan-Tompkins passband."""
    nyq = 0.5 * fs
    b, a = sg.butter(1, [5.0 / nyq, 15.0 / nyq], btype="band")
    return sg.filtfilt(b, a, x)


def derivative(x: np.ndarray, fs: float) -> np.ndarray:
    """Pan-Tompkins 5-point derivative."""
    b = np.array([1, 2, 0, -2, -1]) * (fs / 8.0)  # scaled by Ts = 1/fs
    return sg.lfilter(b, [1.0], x)


def moving_average(x: np.ndarray, fs: float) -> np.ndarray:
    """Moving-window integration over ~150 ms (one QRS width)."""
    win = int(round(0.15 * fs))
    return np.convolve(x, np.ones(win) / win, mode="same")


# ----------------------------------------------------------------------
# 3. Detection with adaptive thresholds + search-back
# ----------------------------------------------------------------------
def pan_tompkins(ecg: np.ndarray, fs: float, verbose: bool = True):
    # Preprocessing
    band = bandpass_filter(ecg, fs)
    der = derivative(band, fs)
    squared = der ** 2
    integrated = moving_average(squared, fs)

    # Signal peak candidates on the integrated signal
    min_dist = int(0.25 * fs)          # refractory: no two beats < 250 ms apart
    peaks, _ = sg.find_peaks(integrated, distance=min_dist)

    # --- Adaptive thresholding ---
    SPKI = 0.0   # running estimate of signal peak
    NPKI = 0.0   # running estimate of noise peak
    THRESH_I1 = 0.0  # first threshold (for a new candidate)
    THRESH_I2 = 0.0  # second threshold (for search-back)

    r_peaks = []
    search_back = False
    last_qrs_end = 0

    win = int(0.15 * fs)
    for i, p in enumerate(peaks):
        peak_val = integrated[p]
        if THRESH_I1 == 0.0:
            # initialise with the strongest early peak
            SPKI = peak_val
            THRESH_I1 = 0.25 * SPKI
            THRESH_I2 = 0.5 * SPKI
            r_peaks.append(p)
            last_qrs_end = p + win
            continue

        # Search-back: RR interval too long? look for a missed low-amplitude beat
        if r_peaks and (p - r_peaks[-1]) > 1.66 * fs:
            search_back = True

        if peak_val >= THRESH_I1 or search_back:
            if peak_val >= THRESH_I2:
                # Accept as a QRS
                r_peaks.append(p)
                SPKI = 0.125 * peak_val + 0.875 * SPKI
                last_qrs_end = p + win
                search_back = False
                if verbose and peak_val < THRESH_I1:
                    print(f"Search-back rescue at sample {p}")
        else:
            # Classify as noise
            NPKI = 0.125 * peak_val + 0.875 * NPKI

        # Adaptive update of thresholds
        THRESH_I1 = NPKI + 0.25 * (SPKI - NPKI)
        THRESH_I2 = 0.5 * THRESH_I1

    r_peaks = np.array(sorted(set(r_peaks)))

    print(r_peaks)

    # Refine: snap each integrated-signal peak to the true R peak in the RAW ecg
    half = int(0.06 * fs)   # search +-60 ms around the detection point
    refined = []
    for p in r_peaks:
        lo, hi = max(0, p - half), min(len(ecg), p + half)
        seg = ecg[lo:hi]
        refined.append(lo + int(np.argmax(np.abs(seg))))
    refined = np.array(sorted(set(refined)))
    return refined, integrated


# ----------------------------------------------------------------------
# 4. Post-analysis: HR, RR intervals
# ----------------------------------------------------------------------
def heart_rate(r_peaks: np.ndarray, fs: float):
    rr = np.diff(r_peaks) / fs          # RR intervals in seconds
    hr = 60.0 / rr                      # instantaneous bpm
    return rr, hr


# ----------------------------------------------------------------------
# 5. Visualisation
# ----------------------------------------------------------------------
def plot_results(ecg, integrated, r_peaks, fs, column):
    t = np.arange(len(ecg)) / fs
    fig, axes = plt.subplots(2, 1, figsize=(14, 7), sharex=True)

    axes[0].plot(t, ecg, lw=0.6, color="tab:blue")
    axes[0].scatter(r_peaks / fs, ecg[r_peaks], color="red", zorder=3, s=18)
    axes[0].set_ylabel(f"ECG ({column})")
    axes[0].set_title("Pan-Tompkins R-peak detection")

    axes[1].plot(t, integrated / np.max(integrated), lw=0.6, color="tab:green")
    axes[1].scatter(r_peaks / fs, np.ones_like(r_peaks) * 0.02, color="red", s=18)
    axes[1].set_ylabel("Integrated signal (norm.)")
    axes[1].set_xlabel("Time [s]")
    plt.tight_layout()
    plt.show()


# ----------------------------------------------------------------------
# Main
# ----------------------------------------------------------------------
def main():
    ap = argparse.ArgumentParser(description="Pan-Tompkins ECG analysis from CSV")
    ap.add_argument("csv", help="Path to the CSV file")
    ap.add_argument("--column", default=None, help="Name of the ECG column (default: first numeric)")
    ap.add_argument("--fs", type=float, default=None, help="Sampling rate in Hz (default: from time column)")
    ap.add_argument("--plot", action="store_true", help="Show a plot of the result")
    args = ap.parse_args()

    ecg, fs_from_time, column = load_ecg(args.csv, args.column)
    fs = args.fs or fs_from_time
    if fs is None:
        raise SystemExit("Sampling rate unknown: pass --fs (e.g. --fs 360) or add a time column.")

    r_peaks, integrated = pan_tompkins(ecg, fs)
    rr, hr = heart_rate(r_peaks, fs)

    print(f"Column: {column} | fs = {fs:.1f} Hz | samples = {len(ecg)}")
    print(f"Detected beats: {len(r_peaks)}")
    print(f"Mean HR: {np.mean(hr):.1f} bpm | min {np.min(hr):.1f} | max {np.max(hr):.1f}")
    print(f"RR intervals (mean ± std): {np.mean(rr)*1000:.0f} ± {np.std(rr)*1000:.0f} ms")

    if args.plot:
        plot_results(ecg, integrated, r_peaks, fs, column)


if __name__ == "__main__":
    main()
