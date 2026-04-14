public class ZeichenObjekt {
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
    // dreieck 7d
    // mit jeder Reihe, die es weiter runter geht, braucht es weniger linken margin
    // mit dem ersten Parameter in i wird dieserr margin pro linie reduziert
    // der zweite Parameter gibt an, wie viele Zeichen in der Linie sein sollen
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
