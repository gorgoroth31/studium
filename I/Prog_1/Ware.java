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
