import pandas as pd
sig = pd.to_numeric(pd.read_csv("./rohdaten.csv", header=None).iloc[:, 0], errors="coerce")
print("Gesamt:", len(sig), "| gültig:", sig.notna().sum())
