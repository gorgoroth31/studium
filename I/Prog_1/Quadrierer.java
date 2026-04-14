import java.util.Scanner;

public class Quadrierer {

  public void main() {
    Quadrierer q = new Quadrierer();
    q.berechneQuadrate();
  }

  public void berechneQuadrate() {
    // 7e
    //
    Scanner scanner = new Scanner(System.in);

    System.out.print("Gib eine Zahl ein: ");

    int n = scanner.nextInt();

    for (int i = 1; i <= n; i++) {
      System.out.println(i * i);
    }
  }
}
