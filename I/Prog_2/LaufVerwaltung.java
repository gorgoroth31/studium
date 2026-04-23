public class LaufVerwaltung {

  private Laeufer[] laeufer = {};;

  public LaufVerwaltung() {
  }

  public void laeuferHinzu(Laeufer l) {
    Laeufer[] tmp = laeufer;

    laeufer = new Laeufer[laeufer.length + 1];

    for (int i = 0; i < tmp.length; i++) {
      laeufer[i] = tmp[i];
    }

    laeufer[laeufer.length - 1] = l;
  }
}
