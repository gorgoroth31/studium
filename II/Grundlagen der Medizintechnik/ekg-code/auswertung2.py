import argparse
from pathlib import Path

import numpy as np
import pandas as pd
import matplotlib.pyplot as plt

from scipy.signal import butter, filtfilt, find_peaks


# ============================================================
# Einstellungen
# ============================================================

DEFAULT_INPUT = "ekg.csv"

# Frequenzbereich für die Bandpassfilterung
LOWCUT_HZ = 0.5
HIGHCUT_HZ = 40.0

# Mindestabstand zwischen zwei R-Zacken
# 0.25 s entspricht maximal 240 Schlägen/min
MIN_RR_S = 0.25

# Prominenz der R-Zacken
# Wird automatisch aus dem Signal bestimmt.
PROMINENCE_FACTOR = 0.5


# ============================================================
# Hilfsfunktionen
# ============================================================

def load_ecg(filename):
    """CSV-Datei laden und Zeit- und EKG-Spalte zurückgeben."""

    df = pd.read_csv(filename)

    required_columns = ["t_s", "lead_cc3_mV"]

    for column in required_columns:
        if column not in df.columns:
            raise ValueError(
                f"Spalte '{column}' wurde nicht gefunden. "
                f"Vorhandene Spalten: {list(df.columns)}"
            )

    # Ungültige Werte entfernen
    df = df[["t_s", "lead_cc3_mV"]].dropna()

    t = df["t_s"].to_numpy(dtype=float)
    ecg = df["lead_cc3_mV"].to_numpy(dtype=float)

    if len(t) < 10:
        raise ValueError("Zu wenige Messwerte in der CSV-Datei.")

    return t, ecg


def estimate_sampling_rate(t):
    """Abtastrate aus den Zeitstempeln bestimmen."""

    dt = np.diff(t)

    # Median ist robuster gegen einzelne fehlerhafte Zeitstempel
    median_dt = np.median(dt)

    if median_dt <= 0:
        raise ValueError("Die Zeitstempel sind nicht monoton steigend.")

    fs = 1.0 / median_dt

    return fs


def bandpass_filter(signal, fs, lowcut=LOWCUT_HZ, highcut=HIGHCUT_HZ):
    """EKG mit einem Butterworth-Bandpass filtern."""

    nyquist = fs / 2.0

    # Grenzfrequenzen an Nyquist-Frequenz anpassen
    highcut = min(highcut, nyquist * 0.9)

    if lowcut >= highcut:
        raise ValueError(
            f"Ungültige Filtergrenzen: lowcut={lowcut}, "
            f"highcut={highcut}, fs={fs}"
        )

    b, a = butter(
        N=3,
        Wn=[lowcut / nyquist, highcut / nyquist],
        btype="band"
    )

    filtered = filtfilt(b, a, signal)

    return filtered


def detect_r_peaks(ecg_filtered, t, fs):
    """
    R-Zacken erkennen.

    Die Erkennung basiert zunächst auf scipy.find_peaks.
    Die Parameter sind bewusst relativ konservativ gewählt.
    """

    # Robust gegen unterschiedliche Signalverstärkungen:
    # Median entfernen und typische Signalgröße bestimmen.
    signal = ecg_filtered - np.median(ecg_filtered)

    mad = np.median(np.abs(signal - np.median(signal)))

    if mad <= 0:
        mad = np.std(signal)

    if mad <= 0:
        raise ValueError("Das EKG-Signal scheint konstant zu sein.")

    # Mindesthöhe / Prominenz
    prominence = PROMINENCE_FACTOR * mad

    # Mindestabstand zwischen R-Zacken
    min_distance = int(MIN_RR_S * fs)

    peaks, properties = find_peaks(
        signal,
        distance=min_distance,
        prominence=prominence
    )

    return peaks, properties


def calculate_heart_rate(t, peaks):
    """Herzfrequenz aus den RR-Intervallen berechnen."""

    if len(peaks) < 2:
        return np.array([]), np.nan, np.nan

    r_times = t[peaks]

    rr_intervals = np.diff(r_times)

    # Herzfrequenz in bpm
    heart_rates = 60.0 / rr_intervals

    mean_hr = np.mean(heart_rates)
    median_hr = np.median(heart_rates)

    return rr_intervals, mean_hr, median_hr


def print_results(t, ecg, filtered, peaks, rr_intervals,
                  mean_hr, median_hr):

    duration = t[-1] - t[0]

    print()
    print("=" * 60)
    print("EKG-AUSWERTUNG")
    print("=" * 60)

    print(f"Messdauer:              {duration:.2f} s")
    print(f"Anzahl Messpunkte:      {len(t):,}")

    fs = estimate_sampling_rate(t)
    print(f"Abtastrate:             {fs:.2f} Hz")

    print(f"Minimum Rohsignal:      {np.min(ecg):.4f} mV")
    print(f"Maximum Rohsignal:      {np.max(ecg):.4f} mV")
    print(f"Median Rohsignal:       {np.median(ecg):.4f} mV")

    print()
    print(f"Erkannte R-Zacken:      {len(peaks)}")

    if len(rr_intervals) > 0:

        print(f"Mittlere Herzfrequenz:  {mean_hr:.1f} bpm")
        print(f"Mediane Herzfrequenz:   {median_hr:.1f} bpm")

        print()
        print("RR-Intervalle:")
        print(f"  Mittelwert:           {np.mean(rr_intervals):.3f} s")
        print(f"  Median:               {np.median(rr_intervals):.3f} s")
        print(f"  Minimum:              {np.min(rr_intervals):.3f} s")
        print(f"  Maximum:              {np.max(rr_intervals):.3f} s")
        print(f"  Std. Abweichung:      {np.std(rr_intervals):.3f} s")

    else:
        print("Nicht genügend R-Zacken für eine Herzfrequenzberechnung.")

    print("=" * 60)
    print()


def plot_ecg(t, ecg, filtered, peaks):
    """EKG und erkannte R-Zacken darstellen."""

    fig, axes = plt.subplots(
        2,
        1,
        figsize=(14, 8),
        sharex=True
    )

    # --------------------------------------------------------
    # Rohsignal
    # --------------------------------------------------------

    axes[0].plot(
        t,
        ecg,
        color="steelblue",
        linewidth=0.8
    )

    axes[0].set_title("EKG – Rohsignal")
    axes[0].set_ylabel("Spannung [mV]")
    axes[0].grid(True, alpha=0.3)

    # --------------------------------------------------------
    # Gefiltertes Signal + R-Zacken
    # --------------------------------------------------------

    axes[1].plot(
        t,
        filtered,
        color="black",
        linewidth=0.8,
        label="gefiltertes EKG"
    )

    if len(peaks) > 0:
        axes[1].scatter(
            t[peaks],
            filtered[peaks],
            color="red",
            s=35,
            zorder=5,
            label=f"R-Zacken ({len(peaks)})"
        )

    axes[1].set_title("Gefiltertes EKG mit erkannten R-Zacken")
    axes[1].set_xlabel("Zeit [s]")
    axes[1].set_ylabel("Spannung [mV]")
    axes[1].grid(True, alpha=0.3)
    axes[1].legend()

    plt.tight_layout()
    plt.show()


def save_results(output_file, t, ecg, filtered, peaks):
    """Auswertung als CSV speichern."""

    r_peak = np.zeros(len(t), dtype=int)
    r_peak[peaks] = 1

    result = pd.DataFrame({
        "t_s": t,
        "ecg_raw_mV": ecg,
        "ecg_filtered_mV": filtered,
        "r_peak": r_peak
    })

    result.to_csv(output_file, index=False)

    print(f"Ergebnis gespeichert: {output_file}")


# ============================================================
# Hauptprogramm
# ============================================================

def main():

    parser = argparse.ArgumentParser(
        description="Auswertung einer EKG-CSV-Datei"
    )

    parser.add_argument(
        "input",
        nargs="?",
        default=DEFAULT_INPUT,
        help="Pfad zur EKG-CSV-Datei"
    )

    parser.add_argument(
        "-o",
        "--output",
        default=None,
        help="Optionale Ausgabedatei"
    )

    args = parser.parse_args()

    input_file = Path(args.input)

    if not input_file.exists():
        raise FileNotFoundError(
            f"Datei nicht gefunden: {input_file}"
        )

    # --------------------------------------------------------
    # CSV laden
    # --------------------------------------------------------

    t, ecg = load_ecg(input_file)

    # --------------------------------------------------------
    # Abtastrate bestimmen
    # --------------------------------------------------------

    fs = estimate_sampling_rate(t)

    print(f"Ermittelte Abtastrate: {fs:.2f} Hz")

    # --------------------------------------------------------
    # Signal filtern
    # --------------------------------------------------------

    filtered = bandpass_filter(
        ecg,
        fs
    )

    # --------------------------------------------------------
    # R-Zacken erkennen
    # --------------------------------------------------------

    peaks, properties = detect_r_peaks(
        filtered,
        t,
        fs
    )

    # --------------------------------------------------------
    # Herzfrequenz / RR
    # --------------------------------------------------------

    rr_intervals, mean_hr, median_hr = calculate_heart_rate(
        t,
        peaks
    )

    # --------------------------------------------------------
    # Ergebnisse ausgeben
    # --------------------------------------------------------

    print_results(
        t,
        ecg,
        filtered,
        peaks,
        rr_intervals,
        mean_hr,
        median_hr
    )

    # --------------------------------------------------------
    # Ergebnisse speichern
    # --------------------------------------------------------

    if args.output is not None:
        save_results(
            args.output,
            t,
            ecg,
            filtered,
            peaks
        )

    # --------------------------------------------------------
    # Plot
    # --------------------------------------------------------

    plot_ecg(
        t,
        ecg,
        filtered,
        peaks
    )


if __name__ == "__main__":
    main()
