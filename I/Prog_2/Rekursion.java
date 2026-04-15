public class Rekursion {
  public void main() {
    Rekursion r = new Rekursion();

    r.zeichneDreieck(5);
    r.dreieckZeichnen(5);
    System.out.println(r.zweiHochX(10));
    System.out.println(r.aHochB(3, 3));
    System.out.println(r.fakultaet(6));
  }

  public void zeichneDreieck(int n) {
    if (n > 0) {
      zeichneDreieck(n - 1);
    }

    for (int i = 0; i < n; i++) {
      System.out.print("#");
    }

    System.out.println("");
  }

  public void dreieckZeichnen(int n) {
    if (n == 0) {
      return;
    }
    for (int i = 0; i < n; i++) {
      System.out.print("o");
    }
    System.out.println();

    dreieckZeichnen(n - 1);
  }

  public int zweiHochX(int x) {
    if (x == 0) {
      return 1;
    }

    return 2 * zweiHochX(x - 1);
  }

  public int aHochB(int a, int b) {
    if (b == 0) {
      return 1;
    }

    return a * aHochB(a, b - 1);
  }

  public int fakultaet(int x) {
    if (x == 0) {
      return 1;
    }

    return x * fakultaet(x - 1);
  }
}
