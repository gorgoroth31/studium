# Begriffe - MEDKL

## ICD10

International Classification of Deseases

## Klassifikation

Einteilung ähnlicher Objekte in eine gemeinsame Klasse
Klassifizierungen sind:

- nicht immer vollständig -> Sonstige Klasse
- praktikabel und anwendbar
- in sich eindeutig, jede Neu-Sortierung der Objekte ergibt das gleiche Ergebnis

Wenige grobe Klassen -> **Generalisierung**
Viele detaillierte Klassen -> **Spezialisierung**

### Praktische Beispiele

- Haftpflichtversicherung: Autos kosten in verschiedenen Landkreisen unterschiedlich viel, je nach Automodell und lokalen Eigenschaften
- Einteilung während Corona in verschiedene Risikogruppen

### Verschiedene Bedeutungen

- Prozess der Klassifikationserstellung, d.h. verschiedene Klassen zu bilden
- Produkt des Klassenbildungsprozesses, d.h. viele, verschiedene Klassen zu einem **Klassifikationssystem** zusammenzufassen
- Prozess des Klassifizierens, Elemente anhand der gegebenen Eigenschaften zu Klassen eines **Klassifikationssystems** zu ordnen

## Dokumentation

Gezieltes **Wiederfinden** und Nutzbarmachen von Informationen
Dokumentation wird im Englischen als **Information Retrieval** bezeichnet -> Zurückgewinnung von Informationen

### Aufgaben der Dokumentation

| Aufgabe | Bedeutung der Aufgabe | Werkzeuge |
| --------------- | --------------- | --------------- |
| Sammeln | Beschaffen und Erfassen von Dokumenten | Tastatur, Barcode, OCR |
| Erschließen | Kennzeichnung des Inhalts durch Deskriptoren, Klassifikation der Dokumente, Erzeugung von Metadaten | Klassifikationen, Thesauren |
| Speichern | Dauerhaft Machen von Dokumenten, Deskriptoren, Metadaten | Datenbanken, Dateisysteme |
| Wiedergewinnen | Recherchieren über Suchanfragen | Suchmaschinen, Data Mining, Datenbanken |
| Auswerten, Darstellen | statistiche Auswertung, Darstellung von Informationen | Excel, Python, R |

Verschiedene Werkzeuge übernehmen jeweils einzelne Aufgaben und können in komplettes System zusammengefasst werden um vollständiges Dokumentationsframework zu erhalten

### Zweck der Dokumentation

| Zweck | Beispiel | Anforderung |
| --------------- | --------------- | --------------- |
| Gedächtnisstütze | Befund dokumentieren, OP-Bericht, Behandlungprotokoll | Speicherbarkeit, Zugänglichkeit, Lesbarkeit |
| Rechtfertigung | Leistung (DRG, Abrechenziffer), Rezept | Konsistenz, Vollständigkeit |
| Kommunikation | Untersuchungsergebnis, Laborbefund, Überweisung an Facharzt anhand der Diagnose | Übertragbarkeit, Vertraulichkeit, Integrität, Zeitnähe |
| Nachweis | Jeder Bericht ist ein Dokument im rechtlichen Sinn, möglicherweise von Belang bei Rechtsstreit | Rechtssicherheit, Unveränderbarkeit, Unlöschbarkeit |

### Verschiedene Bedeutungen

1. Zusammenstellung und Nutzbarmachung von Informationen
2. Die **Auswahl, Sammlung, Ordnung, Speicherung und Verfügbarmachung** von Dokumenten für bestimmte Zielgruppen
3. Prozess der Erstellung von Dokumenten
4. Das Ergebnis des Dokumentierens

### Dokumentationsobjekte

Fast jedes Objekt der **wahrnehmbaren und vorstellbaren** Welt kann zum Gegenstand der Dokumentation werden:
- Materielles: Waren, Arzneimittel
- Immaterielles: Code, Supermarktangebote, Patente
- Ereignisse: Lebensläufe, Prüfungsleistungen, Kontobewegungen, besondere Ereignisse während OP
- Verhalten: Krankheitsverlauf
- Prozesse: SOPs (Standard operating procedure), Kochrezepte
- Individuen: Stammdaten
- Medien: Audio-/Videoaufnahmen, Bücher

Jeder Gegenstand kann mit **Merkmalen** in Form von Tupeln, bestehend aus **Merkmalsart** und **Merkmalsausprägung** beschrieben werden:
- Diagnose: Aortenstenose
- Datum der Diagnose: 13.3.07
- Hersteller: Pfizer

#### Abstraktionsebenen

Dokumentationsobjekte können in **Abstrakt** und **Konkret** unterteilt werden. Abstrakt sind all jene Objekte, die nicht einzeln definierbar sind. Konkrete Objekte existieren als einzelnes Objekt und können auf irgendeine Art und Weise identifiziert werden. Die ISBN-Nummer bei Büchern sind z.B. abstrakt, während die Bib-ID des Buches konkret ist, da über diese ID das Buch eindeutig identifiziert werden kann

#### Identifizierbarkeit

Die eindeutige **Identifizierbarkeit** anhand von **identifizierenden Merkmalen** von Gegenständen ist die **Grundvoraussetzung** für die Dokumentation:
- Ein Arzneimittel kann eindeutig identifiziert werden
- Eine Wolke kann nicht identifiziert werden
- Kieselsteine können nur mit hohem Aufwand identifiziert werden

Identifizierende Merkmal können:
- entweder am Gegenstand selbst wahrgenommen werden (z.B. Fingerabdruck, da er automatisch mit dem Mensch existiert, Fahrgestellnummer)
- oder von außen vergeben werden (z.B. Name, Steuer-ID, ISBN-Nummer) => funktionieren wie eine technische ID

### Unkontrollierte vs. kontrollierte Dokumentation

Unkontrollierte Dokumentation lässt Merkmalsausprägungen in Form von Freitext zu (z.B. Anamnese, OP-Bericht als Freitext)
=> Ausdrucksstark, detailliert, individuell, ABER nicht standardisiert, schlecht zu analysieren

Kontrollierte Dokumentation lässt nur vorgegebene Werte, Codes als Merkmalsausprägungen zu (z.B. Diagnose in Form von ICD10)
=> gut analysierbar, ABER möglicherweise nicht auf Individuum zugeschnitten

### Codierung von Informationen

Zur Standardisierung von Informationen werden Codes verwendet. Diese bieten die Vorteile der kontrollierten Dokumentation
- **zufälliger** Code: Transaktionsnummer
- **mnemonischer** Code: Abkürzung für Studiengang (MEDKL, LinA)
- **sequentieller** Code: Hausnummern, Matrikelnummern
- **hierarchischer** Code: Kapitelnummerierung (4.2.5)
- **zusammengesetzter** Code: Kennzeichen
- **Ikonischer** Code: Wegweiser, Symbole, Stopzeichen

### Schema

Merkmale vieler Gegenstände des gleichen Typs sind zu dokumentieren und bilden in der Gesamtheit das **Dokumentations-Schema**. Dieses Schema muss
- **für jeden Gegenstand**
- **einheitlich**
- so **vollständig** wie möglich
- **wahrheitsentsprechend**
angewandt werden

### Qualitätsmerkmale

Metriken, anhand derer die Qualität der Dok. objektiv gemessen werden kann

| Begriff | Definition | Negativ-Beispiel |
| --------------- | --------------- | --------------- |
| **Vollzähligkeit** | Anteil der dokumentierten **Gegenstände** bezogen auf alle dokumentierbaren Gegenstände | Es wurden nur 80/100 Autos dokumentiert |
| **Vollständigkeit** | Anteil der dokumentierten **Merkmale** bezogen auf alle dokumentierbaren Merkmale | Es wurden alle Autos dokumentiert, aber nur die vorderen Reifen |
| **Korrektheit** | Anteil der **korrekt dokumentierten Merkmale (Gegenstände)** bezogen auf alle Merkmale (Gegenstände) | Nach dem 80ten Auto wird Profiltiefe nach Augenmaß geschätzt |

### Plausibilitätsprüfung

Um zu überprüfen, ob Merkmale eines Gegenstandes korrekt erfasst wurden, können mehrere Validierungen durchgeführt werden:

| Begriff | Definition | Beispiel |
| --------------- | --------------- | --------------- |
| **Existenzprüfung** | Wurde ein Merkmal erfasst? | Pflichtfelder in Web-Form |
| **Formatprüfung** | Entspricht ein erfasstes Merkmal einem bestimmten Format? | Längenprüfung, z.B. PLZ; Syntaxprüfung, z.B. E-Mail, Datum |
| **Inhaltsprüfung** | Ist das erfasste Merkmal inhaltlich plausibel? | Bereichsprüfung: Blutdruck (800/600 nicht plausibel) |
| **Abhängigkeitsprüfung** | Ist das erfasste Merkmal im Kontext zu anderen erfassten Merkmalen plausibel? | Merkmal "Schwangerschaft" ist abhängig von Geschlecht |
| **Doppelte/ nicht einheitliche Datenerfassung** | Wurde ein Merkmal unterschiedlich erfasst? | |
| **Prüfziffern** | IBAN: 2 Stellen nach Ländercode, die aus Berechnung der BLZ und des Ländercodes berechnet werden | |

### Dokumentation als Prozess

Dokumentation ist ein Prozess, der
- zu einem bestimmten Zeitpunkt
- an einem bestimmten Ort
- durch eine bestimmte Person
- durch bestimmte Mittel
stattfindet

W-Fragen: Wer, wo, wann, womit

### Daten und Metadaten

Daten betreffen **Eigenschaften der zu dokumentierenden Gegenstände**

Metadaten geben Auskunft über die dokumentierten Daten:
- Zeitpunkt der Datenerfassung
- Autor der Daten
- Besitzer der Daten
- Zeitpunkt, Autor der Modifikation

Metadaten sind Informationen, die nicht primär für den Nutzer des Gegenstands von Interesse sind und repräsentieren "Hintergrundinformationen"

Sie ergeben sich aus dem Dokumenationskontext, also wann wurde die Dok. von wem erstellt und werden aus den Eigenschaften des Gegenstands abgeleitet

Unterscheidung zwischen **Eigenschaften eines Gegenstands** und **Metadaten** ist von der Art und Nutzung der Dokumentation abhängig:
=> Arzt interessiert sich für Inhalt der Patientenakte, Datenbankadmin interessiert sich für die Metadaten, wie die PA automatisch verarbeitet werden soll

### Rechte und Pflichten

Recht / Pflicht zu schreiben / editieren / lesen von:
- einzelnen Items
- Datengruppen (Arzt darf nur Abschnitt A editieren, Assistenz nur Abschnitt B)
- Dokument als Ganzes (OP-Aufsicht darf Dokument nur lesen, muss aber unterschreiben)

- Recht / Pflich zu sortieren / verlagern / vernichten / löschen

- Besitzer der Dokumentation

### Ordnungsprinzipien

| Art der Ordnung | Ordnungskriterium | Beispiel |
| --------------- | --------------- | --------------- |
| Materiell | Äußeres Erscheinigsbuld | Buch vs CD |
| Formal | Formale Elemente | Verfasser, ISBN-Nummer, Erscheinungsjahr |
| Inhaltlich | Inhaltliche Elemente | Schlagwörter, Genre |
| Funktional | Funktion | Ob Buch ausleihbar ist oder nicht |

#### Kaskadierung von Ordnungskriterien

Manchmal reicht ein einziges Kriterium zur Ordnung nicht aus, dann kann eine **Kaskade von Ordnungskriterien** angewendet werden. Nach der Reihenfolge der Kriterien wird der Gegenstand genau geordnet:
- Zuerst nach Materiell: Buch
- Dann Inhalt: Reiseführer
- Dann Land/Stadt: Meppen Süd
Umgekehrte Reihenfolge macht keinen Sinn!


## Suchmaschinen

Suchmaschinenoptimierung (**SEO**) vs Generative Engine Optimization (**GEO**)

Grundproblem, das durch Suchmaschinen gelöst wird:
- "Man kann nicht genau wissen, was man nicht weiß, bzw. was man sucht"

### Internet-Suchmaschinen

Komponenten:
- **Crawler**: identifiziert Web-Seiten
- **Datenbank**: speichert Web-Dokumente und Indexverweise
- **Indexierungsprogramm**: liefert Indexe über Keywords, Phrasen, Snippets
- **Retrieval Engine**: bildet Suchanfragen auf Web-Dokumente ab
- **Oberfläche**: zur Suche und Ergebnisdarstellung

Generelle Probleme:
- **zu viele Hits**
- **zu wenig Relevanz**
- **kaum Kontrolle über den Suchprozess** und das Suchergebnis
- **Black Box Verhalten** von proprietären Suchmaschinen

Komponenten eines Web-Crawlers:
- **Frontier**: speichert alle URLs, die noch untersucht werden sollen
- **Seed**: übergibt Start-URL an Frontier
- **Downloader**: erhält URL von Frontier und lädt Webseite herunter und übergibt diese an Repository und Parser
- **Parser**: scannt Webseiten auf verlinkte URLs und übergibt diese an Frontier
- **Repository**: speichert URLs zur Indexierung

Datenaufbereitung durch **Parser**:
- Umwandeln in einheitliches Format, Boilerplate entfernen (v.a. Code)
- Schlagwörter extrahieren, Satzzeichen raus
- Zusammenführung lexikalisch verwandter Terme (Grafik, Graphik; Singular-Plural)
- Wörter ohne inhaltliche Relevanz entfernen
- Links extrahieren und an Frontier übergeben

Suchergebnisse kommen zustande durch:
- Keywords (Club & Disco)

