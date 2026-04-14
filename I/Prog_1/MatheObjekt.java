public class MatheObjekt {
  public void main() {
    MatheObjekt m = new MatheObjekt();

    System.out.println(m.mittelwert(new double[] { 2.2, 3.3, 4.4, 5.5, 6.6, 7.7, 8.8 }));
  }

  public double mittelwert(double[] werte) {
    // 10b
    double sum = 0;

    for (int i = 0; i < werte.length; i++) {
      sum += werte[i];
    }

    return sum / werte.length;
  }
}
