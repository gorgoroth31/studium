import java.io.FileOutputStream;
import java.io.PrintWriter;

public class Laeufer {

  private String name;
  private int startNr;
  private int alter;
  private double gewicht;

  public Laeufer(int startNr, String name, int alter, double gewicht) {
    this.startNr = startNr;
    this.name = name;
    this.alter = alter;
    this.gewicht = gewicht;
  }

  public static void main(String[] args) {

  }

  public void saveFkt() {
    Laeufer ho = new Laeufer(12, "homer", 36, 106.9);
    Laeufer sm = new Laeufer(14, "smithers", 39, 67);

    try {
      PrintWriter toFile = new PrintWriter(new FileOutputStream("./marathon.txt"));

      ho.save(toFile);
      sm.save(toFile);

      toFile.close();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  public void save(PrintWriter fileWriter) {
    fileWriter.println("Lauefer");
    fileWriter.println(startNr);
    fileWriter.println(name);
    fileWriter.println(alter);
    fileWriter.println(gewicht);
  }
}
