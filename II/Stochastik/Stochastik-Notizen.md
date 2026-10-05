#stoc

# Einführung

Stochastik beschreibt die Gesamtheit der Gebiete Wahrscheinlichkeitsrechnung und mathematische Statistik. Ziel der Stochastik ist es, **Entscheidungen unter Unsicherheit** zu treffen. Hierfür werden theoretische Grundlagen benötigt, die die **Wahrscheinlichkeitsrechnung** bereit stellt. Hierbei handelt es sich um Theorie ohne Daten und es werden **diskrete** und **stetige Zufallsvariablen** definiert.

In der **deskriptiven Statistik** befassen wir uns mit den **Daten, ohne dass wir Schlüsse** aus den Daten ziehen. Wir **beschreiben** also nur die Daten, die wir beobachtet haben.

In der **konfirmatorischen (schließenden) Statistik** bringen wir Daten und Theorie zusammen und **treffen Entscheidungen**, die auf den beobachteten Daten beruhen.

## Grundgesamtheit und Stichprobe

- **Grundgesamtheit**: Alle Personen/Untersuchungsgegenstände, über die eine Aussage getroffen werden soll
- **Stichprobe**: Auswahl von Personen/Untersuchungsgegenständen aus der Grundgesamtheit
- **Repräsentative Stichprobe**: Spiegelt die Grundgesamtheit im Kleinen wider, d.h. auch die Struktur vorhandener Untergruppen wird durch die Stichprobe abgebildet

## Datenanalyse

Zur Datenanalyse stehen die Verfahren der **deskriptiven Statistik** zur Verfügung, sowie **statistische Tests** welche (richtig angewandt) eine **konfirmatorische** Auswertung garantieren

**Deskriptive Statistik**:
- Zusammenfassung der Daten in wenigen, aussagekräftigen Größen (Maßzahlen, z.B. Mittelwerte, Median, Varianz)
- Beschreibung und Erläuterung ohne Bewertung oder Ableitung von Aussagen oder Handlungsempfehlungen

**Konfirmatorische Statistik**:
- Bestätigung und Beurteilung von Aussagen anhand einer Stichprobe und induktiver Schluss auf die Grundgesamtheit


*Zusammengefasst*: Auswahl einer **rep. Stichprobe** aus der **Grundgesamtheit**, mit den Daten aus dieser Stichprobe werden Operationen der **deskriptiven Statistik** ausgeführt, die Daten liefert, anhand derer man mittels Methoden der **konfirmatorischen Statistik** Rückschlüsse auf die Grundgesamtheit ziehen kann

# Deskriptive Statistik

## Grundbegriffe

Gegenstand von (statistischen) Experimenten sind
- **Merkmale**: die zu untersuchenden Eigenschaften, wie z.B. Blutdruck, Herzfrequenz, Unternehmensgewinn
- **Skalenniveau** und der **Datentyp** eines Merkmals hängt davon ab, wie das Merkmal erfasst (gemessen) wird
	-> **Merkmalsausprägung**

| Frage in Fragebogen                                                                                                         | Skala                  | mögl. Operatoren         | stetig/diskret                                                            |                                                                                              |
| --------------------------------------------------------------------------------------------------------------------------- | ---------------------- | ------------------------ | ------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------- |
| Raucherjahre / Pack years                                                                                                   | **verhältnisskaliert** | =, !=, <, >, +, -, \*, / | stetig, metrisch, quantitativ                                             | *most information we can get* <br>=> alles unterhalb kann aus diesen Daten abgeleitet werden |
| Anzahl Zigaretten pro Tag: ____                                                                                             | **intervallskaliert**  | =, !=, <, >, +, -        | stetig,<br>metrisch,<br>quantitativ                                       |                                                                                              |
| Nichtraucher: [ ]<br>Schwacher R. (1-5 Z./Tag): [ ]<br>mäßig starker R. (6-20 Z./Tag): [ ]<br>starker R. (> 20 Z./Tag): [ ] | **ordinalskaliert**    | =, !=, <, >              | diskret,<br>kategorial,<br>qualitativ<br>(Ordnung der Größe nach möglich) |                                                                                              |
| Raucher: ja / nein                                                                                                          | **nominalskaliert**    | =, !=                    | diskret,<br>kategorial,<br>qualitativ                                     | *least information we can get*<br>=> kaum mathematische Möglichkeiten                        |
Cave: Temperatur in Kelvin ist verhältnisskaliert, in Celsius jedoch intervallskaliert!
