import pandas as pd
import neurokit2 as nk

# ---------- 1. Rohdaten laden (scpinfo --csv 6 Output) ----------
raw = pd.read_csv("rohdaten.csv", skiprows=1)   # Header-Zeile ggf. anpassen
sig = raw.select_dtypes("number").iloc[:, 0]     # erste numerische Spalte = Lead CC3

# ---------- 2. Skalierung ----------
AVM_V = 806e-9        # 806 nV pro ADC-Einheit (aus deiner Section 6)
FS    = 150           # 1/6666 µs ≈ 150 Hz (aus deiner Section 6)

df = pd.DataFrame({
    "t_s": sig.index / FS,
    "lead_cc3_mV": sig * AVM_V * 1000,   # ADC -> mV
})

# ---------- 3. Auswertung mit NeuroKit2 ----------
signals, info = nk.ecg_process(df["lead_cc3_mV"].values, sampling_rate=FS)

# Herzfrequenz und R-Zacken-Zeitpunkte
print("R-Zacken bei (s):", info["ECG_R_Peaks"] / FS)
print("Mittlere HF:", signals["ECG_Rate"].mean().round(1), "bpm")

# HRV-Metriken
hrv = nk.hrv(signals, sampling_rate=FS)
print(hrv.T.head(10))

# Visualisierung
#nk.ecg_plot(signals, sampling_rate=FS)
#import matplotlib.pyplot as plt
#plt.show()

import matplotlib.pyplot as plt

fig, ax = plt.subplots(figsize=(14, 5))
ax.plot(df["t_s"], df["lead_cc3_mV"], lw=0.8)
ax.plot(info["ECG_R_Peaks"] / FS,
        df["lead_cc3_mV"].values[info["ECG_R_Peaks"]], "ro", ms=5)
ax.set_xlabel("Zeit (s)"); ax.set_ylabel("Amplitude (mV)")
plt.show()

# Optional: skalierte Signale als CSV speichern
df.to_csv("aufnahme_skaliert.csv", index=False)
