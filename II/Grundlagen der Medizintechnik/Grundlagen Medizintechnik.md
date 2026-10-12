#medtech #III 

<hr>

# EKG

Bestimmung zur Herzfrequenz, EKG im Praxiseinsatz
Verwendetes Gerät: Creative Medical PC-80B
Messung von Spannungswerten über die Zeit

## Fragestellungen: Was wollen wir messen?

- Signatur eines Menschen feststellen -> Zuordnung von EKG-Daten zu Testpersonen
- Wie schnell ist Kaffee-Konsum im EKG feststellbar?
- Ist Schmerz feststellbar? (Kneifen, IQ-Test in der Gruppe) 
- Ist ein Elektroschock in den Daten sichtbar?

## Störfaktoren beseitigen

- Vor Messung aufs Klo gehen
- 3 min Ruhe vor Messung

## Inbetriebnahme

Gerät installieren

## Messprotokoll

Dauer, Position, Bewegung/Leistung, Anzahl
Verwendung von Einthoven

## Datenaufnahme

Art der Daten, Abtastrate, Auflösung Schnittstelle

## Datenverarbeitungs Protokoll

`python3 scpinfo.py --csv 6 ~/Dokumente/ecg-viewer-daten/ECG_0/1.SCP > ../rohdaten.csv

`python3 script.py`

`python3 auswertung.py`

In aufnahmen_skaliert.csv liegen die Spannungswerte der Ableitung für die entsprechende Zeit

## Messkette

Herz ist eine Spannungsquelle und hat Aktionspotenziale (-30 bis + 100$\micro$v) 

Elektrode: 0,5 - 5mV

Kennzahlen ADC (Analog-Digital-Converter): Abtastrate soll ziemlich hoch sein (160 Hz nicht so viel, aber OK) => Sinus-Kurve wird anhand mehrerer Zeitsprünge abgetastet und je öfter die Abtastung passiert, desto genauer kann die Kurve modeliert werden
Shannon-Theorem/Nyquist: Grundregel um schönes Signal zu bekommen
=> Abtastrate muss min. doppelt so groß wie die Sinus-Kurve sein, sonst tritt ungewollte Schwingung auf (wie beim Video machen, wenn Kamera mit 25 fps aufzeichnet und das Objekt sich mit 25 Rpm dreht, steht das Objekt quasi still, bei >25 Rpm dreht sich das Objekt im Video korrekt, bei <25 Rpm sieht es so aus, als ob das Objekt sich nach hinten dreht)
=> Filter, der alles über 1/2 Abtastrate rausfiltert = Anti-Aliasing

Auflösung: in bit (gute Auflösung wäre 12 bit = 4096)
3V / 4096 => ~0,8 mV (wir können mit 0,8 mV auflösen)
=> 0,8 mV ist auf jeden Fall ausreichend, da ja Verstärker den kleinsten Wert (0,5 mV der Elektrode) verstärkt

ADC wandelt Spannung in 0,8 mV Schritten in Zahl um (<0,8mv = 1, >0,8mv und <0,16mv = 2 usw.....)

Filter: Hochpassfilter (für Störungen z.B. Muskelzittern)
Tiefpassfilter (für Schwankungen)

## Auswertung Herzfrequenz

Pan-Tompkins-Algorithmus:

Wir haben Sprünge in der Linie (gibt's da n Problem?)

- Ableitung wird gebildet
- Dann quadriert man noch alles

[https://physionet.org/](Physionet Arrythmie Datenbank)

