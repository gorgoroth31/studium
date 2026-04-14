public class TextObjekt {

  public void main() {
    TextObjekt text = new TextObjekt();

    String x = text.bisAufLetzten("Weiter");

    System.out.println(x);

    System.out.println(text.ohneVokale("vom Eise befreit ist der Strom"));

    System.out.println(text.allesMitO("vom Eise befreit ist der Strom"));

    System.out.println(text.laengstesWort("vom Eise befreit sind der Strom und Bäche"));
  }

  public String bisAufLetzten(String s) {
    // 12a
    return s.substring(0, s.length() - 1);
  }

  public String ohneVokale(String s) {
    // 12b
    StringBuilder sb = new StringBuilder();

    for (char c : s.toCharArray()) {
      if (!istVokal(c)) {
        sb.append(c);
      }
    }
    return sb.toString();
  }

  public String allesMitO(String s) {
    // 12c
    StringBuilder sb = new StringBuilder();

    for (char c : s.toCharArray()) {
      if (istVokal(c)) {
        sb.append(this.istUppercaseVokal(c) ? 'O' : 'o');
        continue;
      }
      sb.append(c);
    }
    return sb.toString();
  }

  public String laengstesWort(String s) {
    // 12d
    int longestSeqLength = 0;
    int longestSeqIndex = 0;

    int currentSeqLength = 0;
    int currentSeqIndex = 0;

    boolean wasLastCharacterSpace = true;

    char[] c = s.toCharArray();

    for (int i = 0; i < c.length; i++) {
      if (c[i] == ' ') {
        wasLastCharacterSpace = true;
        continue;
      }

      if (wasLastCharacterSpace) {
        wasLastCharacterSpace = false;
        currentSeqIndex = i;
        currentSeqLength = 0;
      }

      currentSeqLength++;

      if (currentSeqLength > longestSeqLength) {
        longestSeqLength = currentSeqLength;
        longestSeqIndex = currentSeqIndex;
      }
    }

    return s.substring(longestSeqIndex, longestSeqIndex + longestSeqLength);
  }

  private boolean istVokal(char c) {
    return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O'
        || c == 'U';
  }

  private boolean istUppercaseVokal(char c) {
    return c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U';
  }
}
