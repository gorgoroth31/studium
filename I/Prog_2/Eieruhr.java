public class Eieruhr {
  // 3
  private int laufzeit;

  void main() {
    Eieruhr eu = new Eieruhr(10);
    eu.start();
  }

  public Eieruhr() {
  }

  public Eieruhr(int laufzeit) {
    this.laufzeit = laufzeit;
  }

  public void start() {
    for (int i = laufzeit; i >= 0; i--) {
      System.out.println("tick - " + i);

      if (i == 0) {
        System.out.println("Klingel!");
      }
      try {
        Thread.sleep(1000);
      } catch (InterruptedException e) {
        System.out.println(e);
      }
    }
  }
}
