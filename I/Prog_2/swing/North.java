import java.awt.Button;
import java.awt.GridLayout;
import java.awt.Panel;

public class North extends Panel {
  private Button b1 = new Button("1");
  private Button b2 = new Button("2");
  private Button b3 = new Button("3");

  public North() {
    init();
  }

  private void init() {
    this.setLayout(new GridLayout(1, 3));

    this.add(b1);
    this.add(b2);
    this.add(b3);
  }
}
