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

#### Faktoren der Relevanzbestimmung

TL; DR: Wo Schlüßelwörter in welcher Frequenz auf der Seite vorkommen; Wo sich der Nutzer befindet und wie sieine Search History aussieht

- **Position** der Suchwörter in:
  Titel, Überschriften, Hyperlinks, Fließtext (--> field weighting)
- **Häufigkeit** des Vorkommens der Suchwörter im **Dokument** (term frequency):
  => Je häufiger ein bestimmtes Wort, desto relevanter ist das Wort im Dokument
- Vorkommen der Suchwörter in **Meta-Daten** des Dokuments
- Vorkommen der Suchwörter in URL
- Anklick-Häufigkeit
- Standort und Surfverhalten
- **Vorkommen** der Suchwörter in speziellen **Wörterbüchern** / **Enzyklopädien**
- **Abstand der Suchwörter** voneinander im Text
- Rank-Verfahren:
  - Page-Rank: Seite ist wichtiger, wenn viele andere Seiten auf diese verweisen
  - Trust-Rank: Links von **vertrauenswürdigen** Anbietern (Uni, Regierung ...)

#### Meta-Suchmaschinen

- **Parallele Suche**: gleichzeitige Aktivierung verschiedener Suchmaschinen
- **Ergebnis-Mischung**: Zusammenführung und Vereinheitlichung der Ergebnisse
- **Dubletten-Eliminierung**: mehrfach gefundene Ergebnisse werden erkannt und eliminiert
- **Kapselung**: einzelne Suchmaschinen werden unter einheitlichem Frontend versteckt (Search Engine Hiding)
- **Vollständige Suche**: so lange in einzelnen Trefferlisten suchen, bis diese keine Treffer mehr liefern
- **Ergebnissortierung**: Gruppenbieldiung, um die Ergebnisse übersichtlicher zu machen

Beispiele:
- JustBooks: Suche nach Büchern
- Idealo: Suche nach den besten Angeboten für ein bestimmtes Produkt
- Portal für Zwangsversteigerungen

#### Was Suchmaschinen nicht finden

- neu erstellte Webseiten (keine Verweise, noch unentdeckte Verweise, nicht angemeldet ...)
- Frisch geänderte Webseiten (noch nicht im Aktualisierungszyklus erkannt)
- geschützte Webseiten (Intranet, durch Passwort geschützt)
- Webseiten mit dynamischem Inhalt/Routing (z.B. SPAs; Deutsche Bahn)

#### Erweiterte Suche

Möglichkeit des "Finetunings" der Suchparameter:
- Ausblenden bestimmter Begriffe
- Sprachen
- Land
- Dokumenttyp
- Erscheinungsdatum
- Erscheinungsposition der Begriffe

#### Semantische Suche

Semantische Suche bedeutet, dass Wöter anhand ihrer Bedeutung geordnet werden. Nutzer bekommt anhand seiner Suchanfrage Ergebnisse, die dem Themenfeld des Suchbegriffs entsprechen

Problem: wann ist die Semantische Suche **zu breit gefächert**? Irgendwann bekommt der Nutzer Vortschläge, die nur entfernt zu Suche passen und das ist nicht so dufte

### Generative Engine Optimization

Strategien, um Inhalt möglichst leicht für AI-Agents zugänglich zu machen, sodass diese den Inhalt oft zitieren und die Marke auch dazunennen

Nutzer sehen häufiger eine einzige KI-generierte Antwort, statt einer Liste von Links

#### Ziele

- Sichtbarkeit in KI-Antworten erhöhen (Quellennennung)
- Vertrauenswürdigkeit signalisieren (E-A-T: Expertise, Authority, Trustworthiness)
- Inhalte so strukturieren, dass sie leicht extrahier- und zitierbar sind
- Markenführung **trotz** Zero-Click Antworten sichern (Brand-Mentions)

#### Nutzen

- Mehr Reichweite über verschiedene KI-Interfaces
- Reduktion von Halluzinationsrisiken durch klare, überprüfbare Fakten

#### Best Practices

- Struktur (Klare Hierarchie, FAQ-Bereich)
- kurze zitierfähige Absätze; Zusammenfassung (TL;DR am Anfang)
- Technische Auffindbarkeit (Cral- und Indexierbarkeit; Zugriff für KI-Crawler sicherstellen)

# Terminologielehre

## Semiotisches Dreieck 

### Bezeichnung, Benennung 

- Zentrale Frage: **Was man sagt**
- Bezeichnet: **Begriff**
- Bedeutet: **Gegenstand**
- Bezeichnung: Repräentation eines Begriffs mit **sprachlichen oder anderen Mitteln**
- Benennung: Aus einem oder mehreren Wörtern bestehende Bezeichnung

### Begriff 

- Zentrale Frage: **Was man meint**
- Bezieht sich auf: **Gegenstand**
- **Denkeinheit**, die aus einer Menge von Gegenständen unter Ermittlung der diesen Gegenständen gemeinsamen Eigenschaften mittels **Abstraktion** gebildet wird

### Gegenstand

- Zentrale Frage: **Was es ist**
- Beliebiger Ausschnitt aus der **wahrnehmbaren** oder **vorstellbaren** Welt 

## Merkmale 

Ich weiß was Merkmale sind. ich kann zw. essentiellen und inessentiellen Merkmalen unterscheiden 

- Merkmal: Eigenschaft eines Gegenstandes 
- Merkmalsausprägung: konkrete Eigenschaft dieses Objektes 

### Essentielle Merkmale 

- Ein Gegenstand **muss** dieses Merkmal haben, z.B.:
  - Fahrrad hat einen Rahmen
  - Fraktur betrifft eine Knochensubstanz und ist eine Verletzung
  - Feuerwehrauto ist rot 

- Die Definition eines Gegenstandes gründet sich auf essentiellen Merkmalen 
- Sind wichtig zur Ordnung von Gegenständen (Eingliederung in Hierarchie)

### Inessentielle Merkmale 

- Ein Gegenstand **kann** dieses Merkmal haben, z.B.:
  - Fraktur betrifft den li. Unterarm 
  - Vorhang ist anthrazit

- Ein inessentielles Merkmal dient dazu, Gegenstände desselben Typs zu unterscheiden 
- Wichtig für Dokumentation von Objekten

## Hierarchie 

Ich kann mono und polyhierarhie erkrären und in darstellungen erkennen. gleichgeordnete begriffe kann ich identifizieren

Generell können Hierarchien immer in einer Baumstruktur angegeben werden 

- **generische** Hierarchie: Kindelemente unterscheiden sich von Elter anhand eines zusätzlichen, differenzierendem Merkmal 
- **partitive** Hierarchie: Kindelemente sind Teil des Elters, ganz oben ist das Ganze und Kinder sind immer Teil des Ganzen 

### gleichgeordnete Begriffe (sibling)

- Begriffe, die **auf der gleichen hierarchischen Ebene** stehen und einen **gemeinsam übergeordneten Begriff** haben, sind **gleichgeordnet**

### Monohierarchie 

- Jedes Kindelement hat genau einen Elter 
- Beispiel: Dateisystem

### Polyhierarchie

- Min. ein Kindelement hat mehr als einen Elter 
- Beispiel: Einordnungen von Krankheiten (bakterielle Pneumonie ist Lungenkrankheit und gleichzeitig Infektionskrankheit)

## Facettenklassifikation

mir ist das konzept einer Facettenklassifikation klar und ich kann einfache beispiele konstruieren 

- **Begriffskomposition** nach frei kombinierbaren Merkmalarten

- Beispiel: Rohr 
  - Merkmalarten: Material (Stahl, Glas), Inhalt (Wasser, Gas), Funktionen (Abfluß, Überlauf)
  - Wasserabflußrohr aus Stahl
  - Gasrohr aus Stahl 

- Facetten müssen so allgemeingültig und eindeutig identifizierbar wie möglich gehalten werden 
- Jedem Gegenstand muss eine Facette eindeutig zugeordnet werden können (es kann kein Gaswasserrohr geben)


## Synonyme und Homonyme

Ich kann syn und hom definieren, Ursachen und beispiele aufzählen und die problematik bei der rechereche darstellen 

### Synonym 

- Mehrere Benennungen beziehen sich auf den gl. Gegenstand, z.B.:
  - Zuckerkrankheit und Diabetes mellitus beziehen sich beide auf eine Stoffwechselstörung

- Ursachen hierfür sind z.B.:
  - Umgangssprache vs. Fachsprache (Blinddarm - Appendix, Kochsalz - Natriumchlorid)
  - Regionale Sprachunterschiede (Brötchen - Semmel, Fasching - Fasnacht)
  - Fremdsprache (Gasthaus - Restaurant, Klebeband - Tape)
  - Kurzform vs. vollst. Benennung (Uni - Universität, Erys - Erythrozyten)
  - Abkürzung vs. vollst. Benennung (THU, LKW)

- Probleme bei der Recherche ergeben sich daraus, wenn beim Indexieren für den gleichen Begriff andere Deskriptoren als bei der Recherche verwendet werden 
  - z.B. Ich schreibe eine Doku und verwende überall Zuckerkrankheit, bei der Recherche möchte ich wissen, wo ich überall Diabetes mellitus verwendet habe 
    - -> Unterschiedliche Ergebnisse trotz gleichem Gegenstand/Sachverhalt
    - Recherche liefert zu wenig relevante Dokumentationseinheiten 

### Homonymie 

- Eine Benennung bezieht sich auf unterschiedliche Gegenstände, z.B.:
  - Bruch bedeutet zum einen ein Fraktur oder eine Hernie, je nachdem was wie wo 
  - Ton (Material) - Ton (in der Musik)
  - arm - Arm 
  - patient (engl. "geduldig") - Patient 

- Es besteht kein Sinnzusammenhang zw. den bezeichneten Begriffen

- Problem bei der Recherche ergibt sich daraus, wenn Benennungen ohne Textzusammenhang verwendet werden -> Gefahr von Missverständnissen
  - z.B. ich schreibe eine Doku und will erwähnen, dass ich eine Hernie habe und verwende nur das Wort "Bruch", aber nicht wo der war und was gemacht wurde 
  - wenn ich nach (Knochen-)Bruch suche, erhalte ich auch die Absätze über die Hernie 
  - Recherche liefert zu viele und nicht relevante Dokumentationeinheiten

## Thesaurus 

### Bedeutung 

**geordnete Zusammenstellung** von **Begriffen** und **Benennungen zum Indexieren, Speichern und Wiederuaffinden** in einem Dokumentationsgebiet 

### Merkmale 

- Begriffe und Benennungen werden eindeutig aufeinander bezogen 
  - Synonyme werden möglichst vollständig erfasst 
  - Homonyme werden korrekt gekennzeichnet
- Für jeden Begriff wird eine Bezeichnung (Vorzugsbezeichnung, Begriffsnr. oder Notation) festgelegt, die den Begriff eindeutig vertritt 
- Beziehungen zw. Begriffen werden dargestellt 

### Einschränkungen 

- Thesauren benötigen einen **klar umrissenen Kontext**, da sonst zu viele verschiedene Wörter -> je mehr Wörter, desto exponentiell aufwendiger
  - z.B. Medizin, Medikamente, Krankheiten 

### Wie sieht ein Thesaurus aus?

- Auflistung von Wörtern
- Wenn ein Wort angeklickt wird, werden Synonyme, Antonyme und Homonyme aufgezeigt

