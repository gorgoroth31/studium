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

### Diskret vs. stetige Merkmale

- **Diskrete Merkmale**: ein Merkmal heißt diskret, wenn es nur *abzählbar* viele Werte annehmen kann (< 30)
- **Stetige Merkmale**: ein stetiges Merkmal kann dagegen alle Werte innerhalb eines bestimmten Intervalls annehmen

## Univariate deskriptive Statistik

Im Folgenden werden wir statistische Kennzahlen und graphische Methoden zur Beschreibung eines Merkmals kennen lernen

### Charakterisierung der Merkmale

- **Lagemaße**: wo ist das Zentrum der Verteilung?
- **Streuungsmaße**: Wie sehr schwanken die Beobachtungen um dieses Zentrum?
- **Verteilung**: Streuen die Beobachtungen links und rechts vom Zentrum gleich?

#### Mittelwert

Der **Mittelwert** (das arithmetische Mittel) der Stichprobe ist definiert als:

$$
\bar{x} = \frac{1}{n}(x_{1}+x_{2}+...+x_{n}) = 
$$
$$
\frac{1}{n} \displaystyle\sum_{k=1}^{n} x_{k}
$$
####  Median

Der **Median** teilt eine *geordnete* Stichprobe in zwei Hälften

Gilt für den **Median**:

$$
\tilde{x} =
  \begin{cases}
    x_{\frac{n+1}{2}},       & \quad \text{für } n \text{ ungerade}\\
    \frac{1}{2}(x_{(\frac{n}{2})} + x_{(\frac{n}{2}+1)}),  & \quad \text{für } n \text{ gerade}
  \end{cases}
$$

#### Quantile

Das $\alpha$ - Quantil $\tilde{x}_{\alpha}$ teilt eine geordnete Stichprobe $x_{(...)}$ in zwei Teile, so dass
- ungefähr $\alpha$ x 100% der Daten links von $\tilde{x}_{\alpha}$ sind und
- ungefähr (1 - $\alpha$) x 100% der Daten sind rechts von $\tilde{x}_{\alpha}$

Der **Median** ist z.B. das 50%-Quartil

$$
\tilde{x} =
  \begin{cases}
    x_{k},       & \quad \text{falls } n * \alpha \text{ keine ganze Zahl ist, k ist dann die auf n * \\alpha folgende Zahl}\\
    \frac{1}{2}(x_{(k)} + x_{(k+1)}),  & \quad \text{falls } n * alpha \text{ eine ganze Zahl ist, k = } n * \alpha
  \end{cases}
$$

#### Modus

Der **Modus** bzw. **Modalwert** einer Stichprobe ist definiert als die Ausprägung mit der größten Häufigkeit

### Streuungsmaße

Das Wissen um die Lage des Zentrums einer Verteilung ist fast wertlos, wenn man nichts über die Streuung der Stichprobe weiß

- **Spannweite**: Differenz zwischen dem größten und dem kleinsten Wert der Stichprobe (*min. ordinalskaliert*)
$$
range = x_{max} - x_{min}
$$
- **Interquartilsabstand IQA**: Differenz zwischen dem 3. und 1. Quartil (*min. ordinalskaliert*)
$$
IQA = Q3 - Q1
$$
- **(Stichproben-) Varianz**: (*min. intervallskaliert*)
$$
s² = \frac{1}{n-1}\displaystyle\sum_{i=1}^{n} (x_{i} - \bar{x})² 
$$
$$
= \frac{1}{n - 1}(\displaystyle\sum_{i=1}^{n} (x_{i}²) - n * \bar{x}²)
$$
- **Standardabweichung**: (*min. intervallskaliert*)
$$
s = \sqrt{s²}
$$
> [!attention] Achtung
> Kein Lagemaß ohne Streuungsmaß!
> 
> Beim Berichten von Daten sollte man (wenn möglich) immer Maße für Lage und Streuung angeben:
> 
Sinnvolle Kombinationen sind:
> - Mittelwert +/- Standardabweichung
> - Median und 1. und 3. Quartil

