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
