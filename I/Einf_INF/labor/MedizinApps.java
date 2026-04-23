import java.util.Scanner;

void main() {
  Scanner scanner = new Scanner(System.in);
  System.out.print(
      "Welche App wollen Sie ausführen?\n[1] Dosierungsberechnung\n[2] Medikamentenplanung\n[3] Fieberkurve\n> ");

  int auswahl = scanner.nextInt();

  switch (auswahl) {
    case 1:
      dosierungsRechner();
      break;
    case 2:
      tablettenPlaner();
      break;
    case 3:
      fieberkurveMenü();
      break;
    default:
      System.out.println("Leider kein Programm gefunden");
  }

  scanner.close();
}

// Laborübung 4

void dosierungsRechner() {
  Scanner scanner = new Scanner(System.in);

  System.out.print("Alter: ");
  int alter = scanner.nextInt();

  System.out.print("Gewicht (kg): ");
  int gewicht = scanner.nextInt();

  float dosierung = (alter * gewicht) / 200;

  if (dosierung >= 5 && dosierung <= 20) {
    System.out.println("Die benötigte Dosierung beträgt " + dosierung + " mg");
  } else if (dosierung < 5) {
    System.out.println("Die Dosis (" + dosierung + " mg) ist zu gering!");
  } else {
    System.out.println("Die Dosis (" + dosierung + " mg) ist zu hoch!");
  }

  scanner.close();
}

void tablettenPlaner() {
  Scanner scanner = new Scanner(System.in);

  System.out.print("Anzahl der täglich einzunehmenden Tabletten: ");
  int anzahlTäglich = scanner.nextInt();

  System.out.print("Zeitraum der Medikamenteinnahme in Tagen: ");
  int zeitraum = scanner.nextInt();

  System.out.print("Anzahl der Tabletten in einer Packung: ");
  int anzahlPackung = scanner.nextInt();

  int übrigInPackung = 0;

  for (int i = 1; i <= zeitraum; i++) {
    übrigInPackung -= anzahlTäglich;

    String s = "";

    if (übrigInPackung < 0) {
      s = "Kaufe neue Packung; ";
      übrigInPackung += anzahlPackung;
    }

    System.out
        .println("Tag: " + i + "\t" + s + "Einnahme: " + anzahlTäglich + " Tabletten, übrig: " + übrigInPackung
            + " Tabletten");
  }

  scanner.close();
}

// Laborübung 5
void fieberkurveMenü() {
  fieberkurve(7);
}

/**
 * Ein Unterprogramm zum Führen einer Fieberkurve
 * Lässt den benutzer für jeden Tag eine Körpertemperatur eingeben und
 * ermittelt danach an welchen Tagen die Temperatur zu niedrig oder zu hoch ist
 * Berechnet zudem die mittlere Körpertemperatur und gibt diese zurück
 * 
 * @param tage Anzahl Tag der Fieberkurve
 * @return Die mittlere Körpertemperatur über alle Tage
 */
double fieberkurve(int tage) {
  float[] werte = new float[tage];

  System.out.println("Bitte Fieberwerte (in Grad) eingeben");

  Scanner scanner = new Scanner(System.in);

  int[] zuNiedrigIndex = new int[tage];
  int[] zuHochIndex = new int[tage];

  float sum = 0;

  for (int i = 0; i < werte.length; i++) {
    System.out.print("Tag " + (i + 1) + ": ");

    werte[i] = scanner.nextFloat();

    if (werte[i] < 35.0) {
      zuNiedrigIndex[i] = i;
    }

    if (werte[i] > 40.0) {
      zuHochIndex[i] = i;
    }

    sum += werte[i];
  }

  System.out.println("Auswertung:");

  for (int index : zuNiedrigIndex) {
    if (index == 0) {
      continue;
    }
    System.out.println("Tag " + (index + 1) + ": Zu niedrige Temperatur, Unterkühlung!");
  }

  for (int index : zuHochIndex) {
    if (index == 0) {
      continue;
    }
    System.out.println("Tag " + (index + 1) + ": Sehr hohes Fieber, Gefahr des Kreislaufversagens");
  }

  float mittelwert = sum / tage;

  System.out.println("Mittelwert der Körpertemperatur: " + mittelwert);

  scanner.close();
  return mittelwert;
}
