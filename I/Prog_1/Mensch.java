public class Mensch {
  private String vorname;
  private String nachname;
  private int alter;
  private String beruf = "nicht bekannt";
  private double gewicht;
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
    anzahlKinder++;
  }

  public void verliertKind() {
    anzahlKinder--;
  }
}
