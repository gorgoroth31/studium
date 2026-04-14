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
    // mit dem ersten Parameter in i wird dieser
    for (int i = 0; i < 5; i++) {
      System.out.println("    *********".substring(i, 5 + 2 * i));
    }
  }

  public static void main(String[] args) {
    ZeichenObjekt x = new ZeichenObjekt();

    x.zeichneQuadrat(6);
    x.zeichneLinie(11);
    x.zeichneDreieck();
  }
}
