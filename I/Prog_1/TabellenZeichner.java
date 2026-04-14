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

  public void zeigeQuadratischeGleichung(double a, double b, double c, double start, double ende, double schritt) {
    for (double i = start; i <= ende; i += schritt) {
      double computed = a * (i * i) + b * i + c;
      System.out.println("f(" + i + "): " + computed);
    }
  }
}
