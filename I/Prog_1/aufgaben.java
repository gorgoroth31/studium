public class Aufgaben {

  public static void main(String[] args) {
    aufgabe8();
  }

  public static void aufgabe1() {
    int sternchen = 20;

    for (int i = 0; i < sternchen; i++) {
      System.out.print("*");
    }
  }

  static void aufgabe2() {
    int zahl = 420;

    for (int i = 1; i <= zahl; i++) {
      if (zahl % i == 0) {
        System.out.print(i + " ");
      }
    }
  }

  static void aufgabe3() {
    int sternchen = 20;

    int i = 0;

    while (sternchen > i) {
      System.out.print("*");
      i++;
    }
    
    System.out.println();

    int zahl = 420;

    int j = 1;

    while (zahl >= j) {
      if (zahl % j == 0) {
        System.out.print(j + " ");
      }
      
      j++;
    }
  }

  static void aufgabe4() {
    // fahrenheit zu celsius
    double anfang = 32;
    double ende = 110;

    for (double d = anfang; d <= ende; d++) {
      double celsius = (d - 32.0)*(5.0/9.0);

      System.out.println(d + "\t| " + celsius);
    }
  }

  static void aufgabe5() {
    // fakultät
    int zahl = 6;

    int fakultät = 1;

    for (int i = zahl; i > 0; i--) {
      fakultät *= i;
    }

    System.out.println(fakultät);
  }

  static void aufgabe6() {
    int kante = 8;

    for (int i = 1; i <= kante; i++) {
      for (int j = 1; j <= i; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }

  static void aufgabe7() {
    
    for (int i = 1; i <= 10; i++) {
      for (int j = 1; j <= 10; j++) {
        System.out.print(i*j + "\t");
      }
      System.out.println();
    }
  }

  static void aufgabe8() {
    // weihnachtsbaum
    int hoehe = 5;

    int max_breite = hoehe + (hoehe - 1);

    for (int i = 1; i <= hoehe; i++) {
      int breite = (i * 2) - 1;

      int margin = (max_breite - breite)/2;

      for (int j = 0; j < margin; j++) {
        System.out.print(" ");
      }

      for (int k = 0; k < breite; k++) {
        System.out.print("*");
      }

      for (int j = 0; j < margin; j++) {
        System.out.print(" ");
      }

      System.out.println();
    }

    int stamm_margin = (max_breite / 2) - 1;

    for (int s = 0; s < stamm_margin; s++) {
      System.out.print(" ");
    }

    System.out.print("||");

  }
}
