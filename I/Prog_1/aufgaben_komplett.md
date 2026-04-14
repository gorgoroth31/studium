Student: Glenk, Matthias

Vorlesung: Prog_1 Min/Dsm SoSe26

```java
// Aufgaben.java (Name der Quellcode-Datei)

import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;

public class Aufgaben {

  public static void aufgabe1() {
    // 1a (Seite in Datei 'prog1_aufgaben.pdf' + Aufgabe (Seite 1 + Aufgabe a))
    int sternchen = 20;

    for (int i = 0; i < sternchen; i++) {
      System.out.print("*");
    }
  }

  static void aufgabe2() {
    // 1b
    int zahl = 420;

    for (int i = 1; i <= zahl; i++) {
      if (zahl % i == 0) {
        System.out.print(i + " ");
      }
    }
  }

  static void aufgabe3() {
    // 2a
    int sternchen = 20;

    int i = 0;

    while (sternchen > i) {
      System.out.print("*");
      i++;
    }

    System.out.println();

    int zahl = 420;

    int j = 1;

    while (zahl >= j) {
      if (zahl % j == 0) {
        System.out.print(j + " ");
      }

      j++;
    }
  }

  static void aufgabe4() {
    // 2b - fahrenheit zu celsius
    double anfang = 32;
    double ende = 110;

    for (double d = anfang; d <= ende; d++) {
      double celsius = (d - 32.0) * (5.0 / 9.0);

      System.out.println(d + "\t| " + celsius);
    }
  }

  static void aufgabe5() {
    // 2c - fakultät
    int zahl = 6;

    int fakultät = 1;

    for (int i = zahl; i > 0; i--) {
      fakultät *= i;
    }

    System.out.println(fakultät);
  }

  static void aufgabe6() {
    // 3a
    int kante = 8;

    for (int i = 1; i <= kante; i++) {
      for (int j = 1; j <= i; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }

  static void aufgabe7() {
    // 3b
    for (int i = 1; i <= 10; i++) {
      for (int j = 1; j <= 10; j++) {
        System.out.print(i * j + "\t");
      }
      System.out.println();
    }
  }

  static void aufgabe8() {
    // 3c - weihnachtsbaum
    int hoehe = 5;

    int max_breite = hoehe + (hoehe - 1);

    for (int i = 1; i <= hoehe; i++) {
      int breite = (i * 2) - 1;

      int margin = (max_breite - breite) / 2;

      for (int j = 0; j < margin; j++) {
        System.out.print(" ");
      }

      for (int k = 0; k < breite; k++) {
        System.out.print("*");
      }

      for (int j = 0; j < margin; j++) {
        System.out.print(" ");
      }

      System.out.println();
    }

    int stamm_margin = (max_breite / 2) - 1;

    for (int s = 0; s < stamm_margin; s++) {
      System.out.print(" ");
    }

    System.out.print("||");

  }

  static void aufgabe9() {
    // 4a - messwerte einlesen
    System.out.print("Eingabe Zahl q: ");
    Scanner reader = new Scanner(System.in);

    int q = reader.nextInt();

    int[] array = new int[q];

    for (int i = 0; i < q; i++) {
      System.out.print("Messwert " + (i + 1) + " eingeben: ");
      array[i] = reader.nextInt();
    }

    System.out.print("Messwerte: ");

    int sum = 0;

    for (int i = 0; i < array.length; i++) {
      System.out.print(array[i] + " ");
      sum += array[i];
    }

    System.out.println("Durchschnitt: " + (sum / q));
  }

  static void aufgabe10() {
    // 4b - 8x8 array

    int size = 8;

    int[][] array = new int[size][size];

    Scanner reader = new Scanner(System.in);

    while (true) {
      System.out.print("X: ");
      int x = reader.nextInt();
      System.out.print("Y: ");
      int y = reader.nextInt();
      System.out.print("Wert:");
      int w = reader.nextInt();

      array[x][y] = w;

      for (int i = 0; i < size; i++) {
        for (int j = 0; j < size; j++) {
          System.out.print(array[i][j] + " ");
        }
        System.out.println();
      }
    }
  }

  static void aufgabe11() {
    // 5a - zahlenraten
    Random rand = new Random();
    int zahl = rand.nextInt(1000);

    zahl++;

    Scanner reader = new Scanner(System.in);

    int counter = 0;

    while (true) {
      counter++;
      System.out.print("Rate mal: ");
      int input = reader.nextInt();

      if (input > zahl) {
        System.out.println("Die gesuchte Zahl ist kleiner");
      } else if (input < zahl) {
        System.out.println("Die gesuchte Zahl ist größer");
      } else {
        System.out.println("Glückwunsch! Du hast die gesuchte Zahl gefunden!");
        System.out.println("Anzahl der Versuche: " + counter);
        break;
      }
    }
  }

  static void aufgabe12() {
    // 6a & 6b - quadratische funktion
    Scanner reader = new Scanner(System.in);

    System.out.print("Startwert: ");
    int x1 = reader.nextInt();

    System.out.print("Endwert: ");
    int x2 = reader.nextInt();

    System.out.print("Schrittweite n: ");
    int n = reader.nextInt();

    int minBetrag = 1000000000;
    int minBetragX = 0;

    for (int i = x1; i <= x2; i = i + n) {
      int computed = (i * i * i) - 2 * (i * i) + 5 * i;
      System.out.println(i + "\t|\t" + computed);

      if (Math.abs(computed) < minBetrag) {
        minBetrag = computed;
        minBetragX = i;
      }
    }

    System.out.println("Minimumbetrag: f(" + minBetragX + ") = " + minBetrag);

    reader.close();
  }

  static void aufgabe13() {
    // 6c -  sortieren (schwer)
    int[] array = { 12, 11, 2, 55, 32, 1, 33, 37 };

    for (int i = 0; i < array.length - 1; i++) {
      int maxIndex = i;
      for (int j = i + 1; j < array.length; j++) {
        if (array[j] > array[maxIndex]) {
          maxIndex = j;
        }
      }

      int currentVal = array[i];
      int currentMax = array[maxIndex];
      array[i] = currentMax;
      array[maxIndex] = currentVal;
    }
    System.out.println(Arrays.toString(array));
  }
}

// ZeichenObjekt.java

public class ZeichenObjekt {
  // 7a

  public void zeichneLinie(int n) {
    for (int x = 0; x < n; x++) {
      System.out.print("+ ");
    }
    System.out.println();
  }

  public void zeichneQuadrat(int s) {
    for (int i = 0; i < s; i++) {
      for (int k = 0; k < s; k++) {
        System.out.print("* ");
      }
      System.out.println();
    }
  }

  public void zeichneDreieck() {
    // 7d dreieck
    // mit jeder Reihe, die es weiter runter geht, braucht es weniger linken margin
    // mit dem ersten Parameter in i wird dieserr margin pro linie reduziert
    // der zweite Parameter gibt an, wie viele Zeichen in der Linie sein sollen, diese Anzahl muss mit steigendem i auch steigen
    for (int i = 0; i < 5; i++) {
      System.out.println("    *********".substring(i, 5 + 2 * i));
    }
  }

  public void zeichneRechteck(int hoehe, int breite) {
    // 8b
    for (int i = 0; i < hoehe; i++) {
      for (int j = 0; j < breite; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }

  public void zeichneDreieck(int hoehe, int breite) {
    // 8c
    for (int i = 1; i <= hoehe; i++) {
      int anzahlSterne = i * breite / hoehe;

      for (int j = 0; j < anzahlSterne; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }

  public static void main(String[] args) {
    ZeichenObjekt x = new ZeichenObjekt();

    x.zeichneQuadrat(6);
    x.zeichneLinie(11);
    x.zeichneDreieck();
    x.zeichneLinie(11);
    x.zeichneRechteck(5, 7);
    x.zeichneLinie(11);
    x.zeichneDreieck(5, 15);
  }
}

// Hund.java
// 7b
public class Hund {
  public void belle() {
    System.out.println("wuff");
  }
}

// Katze.java
// 7c
public class Katze {
  public void miaue() {
    System.out.println("miau");
  }
}

// Quadrierer.java

import java.util.Scanner;

public class Quadrierer {

  public void main() {
    Quadrierer q = new Quadrierer();
    q.berechneQuadrate();
  }

  public void berechneQuadrate() {
    // 7e

    Scanner scanner = new Scanner(System.in);

    System.out.print("Gib eine Zahl ein: ");

    int n = scanner.nextInt();

    for (int i = 1; i <= n; i++) {
      System.out.println(i * i);
    }
  }
}

// TabellenZeichner.java

public class TabellenZeichner {
  public void main() {
    TabellenZeichner tz = new TabellenZeichner();
    tz.zeigeQuadratVonBis(5, 9);

    System.out.println("-".repeat(20));

    tz.zeigeQuadratischeGleichung(3, -3 / 7, 12, -10, 10, 1);
  }

  public void zeigeQuadratVonBis(int von, int bis) {
    // 8a
    for (int i = von; i <= bis; i++) {
      System.out.println(i + "  " + (i * i));
    }
  }

  public void zeigeQuadratischeGleichung(double a, double b, double c, double start, 
  double ende, double schritt) {
    // 8d
    for (double i = start; i <= ende; i += schritt) {
      double computed = a * (i * i) + b * i + c;
      System.out.println("f(" + i + "): " + computed);
    }
  }
}

// Potenzierer.java
// 10a

public class Potenzierer {
  public void main() {
    System.out.println(aHochB(3, 4));

    System.out.println(zweiHochX(12));
  }

  public double aHochB(double a, int b) {
    if (a == 0 && b == 0) {
      throw new ArithmeticException("0 hoch 0 kann nicht berechnet werden");
    }
    if (b == 0) {
      return 1;
    }

    double value = a;

    for (int i = 1; i < b; i++) {
      value *= a;
    }

    return value;
  }

  public double zweiHochX(double x) {
    if (x == 0) {
      return 1;
    }

    double value = 2;

    for (int i = 1; i < x; i++) {
      value *= 2;
    }

    return value;
  }
}

// MatheObjekt.java 
// 10b

public class MatheObjekt {
  public void main() {
    MatheObjekt m = new MatheObjekt();

    System.out.println(m.mittelwert(new double[] { 2.2, 3.3, 4.4, 5.5, 6.6, 7.7, 8.8 }));
  }

  public double mittelwert(double[] werte) {
    double sum = 0;

    for (int i = 0; i < werte.length; i++) {
      sum += werte[i];
    }

    return sum / werte.length;
  }
}

// Mensch.java

public class Mensch {
  private String vorname;
  private String nachname;
  private int alter;
  private String beruf = "nicht bekannt";
  private double gewicht;
  // 11d
  private int anzahlKinder;

  public Mensch(String v, String n, int a) {
    vorname = v;
    nachname = n;
    alter = a;
  }

  public void drucke() {
    System.out.println("Name: " + vorname + " " + nachname);
    System.out.println("Alter: " + alter);
    System.out.println("Beruf: " + beruf);
    System.out.println("Gewicht: " + gewicht + " kg");
  }

  public void setzeVorname(String v) {
    vorname = v;
  }

  public void setzeNachname(String n) {
    nachname = n;
  }

  public void setzeAlter(int a) {
    alter = a;
  }

  public void hatGeburtstag() {
    alter++;
  }

  public void setzeBeruf(String b) {
    // 11a
    beruf = b;
  }

  public void aendereNachname(String n) {
    // 11b
    nachname = n;
  }

  public void setzeGewicht(double g) {
    // 11c
    gewicht = g;
  }

  public void bekommtKind() {
    // 11d
    anzahlKinder++;
  }

  public void verliertKind() {
    // 11d
    anzahlKinder--;
  }
}

// TextObjekt.java

// 12a,b,c,d

public class TextObjekt {

  public void main() {
    TextObjekt text = new TextObjekt();

    String x = text.bisAufLetzten("Weiter");

    System.out.println(x);

    System.out.println(text.ohneVokale("vom Eise befreit ist der Strom"));

    System.out.println(text.allesMitO("vom Eise befreit ist der Strom"));

    System.out.println(text.laengstesWort("vom Eise befreit sind der Strom und Bäche"));
  }

  public String bisAufLetzten(String s) {
    // 12a
    return s.substring(0, s.length() - 1);
  }

  public String ohneVokale(String s) {
    // 12b
    StringBuilder sb = new StringBuilder();

    for (char c : s.toCharArray()) {
      if (!istVokal(c)) {
        sb.append(c);
      }
    }
    return sb.toString();
  }

  public String allesMitO(String s) {
    // 12c
    StringBuilder sb = new StringBuilder();

    for (char c : s.toCharArray()) {
      if (istVokal(c)) {
        sb.append(this.istUppercaseVokal(c) ? 'O' : 'o');
        continue;
      }
      sb.append(c);
    }
    return sb.toString();
  }

  public String laengstesWort(String s) {
    // 12d
    int longestSeqLength = 0;
    int longestSeqIndex = 0;

    int currentSeqLength = 0;
    int currentSeqIndex = 0;

    boolean wasLastCharacterSpace = true;

    char[] c = s.toCharArray();

    for (int i = 0; i < c.length; i++) {
      if (c[i] == ' ') {
        wasLastCharacterSpace = true;
        continue;
      }

      if (wasLastCharacterSpace) {
        wasLastCharacterSpace = false;
        currentSeqIndex = i;
        currentSeqLength = 0;
      }

      currentSeqLength++;

      if (currentSeqLength > longestSeqLength) {
        longestSeqLength = currentSeqLength;
        longestSeqIndex = currentSeqIndex;
      }
    }

    return s.substring(longestSeqIndex, longestSeqIndex + longestSeqLength);
  }

  private boolean istVokal(char c) {
    return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O'
        || c == 'U';
  }

  private boolean istUppercaseVokal(char c) {
    return c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U';
  }
}

// Ware.java

import java.util.Date;

public class Ware {
  // 13
  private String name;
  private long warennr;
  private double preis;
  private long anzahlImLager;

  public void main() {
    Ware w = new Ware("Holzteile");
    w.setzePreis(1.50);
    w.kaufeEin(100);
    w.verkaufe(4);
    w.print();

    Frucht frucht = new Frucht("Apfel");
    frucht.setzePreis(11.22);
    frucht.kaufeEin(12);
    frucht.verkaufe(1);
    frucht.setzeReifegrad(2);
    frucht.setzeVerfallsdatum(new Date());
    frucht.print();
  }

  public Ware() {
  }

  public Ware(String warenName) {
    name = warenName;
  }

  void setzePreis(double preis) {
    this.preis = preis;
  }

  void kaufeEin(long anzahl) {
    anzahlImLager += anzahl;
  }

  void verkaufe(long anzahl) {
    anzahlImLager -= anzahl;
  }

  void print() {
    System.out.println(this.name + "  -- im Lager: " + anzahlImLager + " -- Preis: " + preis);
  }
}

public class Frucht extends Ware {
  private int reifegrad;
  private Date verfallsdatum;

  public Frucht(String name) {
    super(name);
  }

  void setzeReifegrad(int reifegrad) {
    this.reifegrad = reifegrad;
  }

  void setzeVerfallsdatum(Date verfallsdatum) {
    this.verfallsdatum = verfallsdatum;
  }

  String erhalteReifegrad() {
    if (reifegrad == 1) {
      return "grün";
    }
    if (reifegrad == 2) {
      return "reif";
    }

    return "überreif";
  }

  @Override
  public void print() {
    super.print();
    System.out.println("reifegrad: " + erhalteReifegrad());
    System.out.println("verfallsdatum: " + verfallsdatum);
  }
}
```
