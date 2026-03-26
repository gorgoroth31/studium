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


