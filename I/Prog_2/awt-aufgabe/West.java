import java.awt.Button;
import java.awt.GridLayout;
import java.awt.Panel;

public class West extends Panel {
  // 7 felder übereinander, das 5te ist leer
  private Button b1 = new Button("Button");
  private Button b2 = new Button("Button");
  private Button b3 = new Button("Button");
  private Button b4 = new Button("Button");
  private Button b5 = new Button("Button");
  private Button b0 = new Button();
  private Button b6 = new Button("Button");

  public West() {
    this.setLayout(new GridLayout(7, 1));
    this.add(b1);
    this.add(b2);
    this.add(b3);
    this.add(b4);
    this.add(b5);
    b0.setVisible(false);
    this.add(b0);
    this.add(b6);
  }
}
