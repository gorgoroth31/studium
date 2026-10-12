import pandas as pd

raw = pd.read_csv("rohdaten3.csv", skiprows=1)   # Header-Zeile ggf. anpassen
sig = raw.select_dtypes("number").iloc[:, 0]    # erste numerische Spalte = Lead CC3

AVM_V = 806e-9        # 806 nV pro ADC-Einheit
FS    = 1 / 6666e-6   # ≈ 150 Hz

df = pd.DataFrame({
    "t_s": sig.index / FS,
    "lead_cc3_mV": sig * AVM_V * 1000,
})
df.to_csv("aufnahme3.csv", index=False)
