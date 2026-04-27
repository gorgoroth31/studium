public class LaufVerwaltung {
  // 2B

  private Laeufer[] laeufer = {};;

  void main() {
    Laeufer l = new Laeufer();
    Laeufer l2 = new Laeufer();
    laeuferHinzu(l);
    laeuferHinzu(l2);

    gibLaeuferAus();
  }

  public LaufVerwaltung() {
  }

  public void laeuferHinzu(Laeufer l) {
    Laeufer[] tmp = laeufer;

    laeufer = new Laeufer[laeufer.length + 1];

    for (int i = 0; i < tmp.length; i++) {
      laeufer[i] = tmp[i];
    }

    l.startNummer = ersteVerfuegbareNummer();
    laeufer[laeufer.length - 1] = l;
  }

  public void gibLaeuferAus() {
    for (Laeufer l : laeufer) {
      l.druckeInfo();
    }
  }

  private int ersteVerfuegbareNummer() {
    int number = 0;
    for (int i = 0; i < laeufer.length; i++) {
      for (Laeufer l : laeufer) {
        if (l == null) {
          continue;
        }
        if (l.startNummer == i) {
          break;
        }

        number = i;
      }
      if (number != 0) {
        break;
      }
    }
    return number;
  }
}
