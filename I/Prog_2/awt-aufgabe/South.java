import java.awt.Checkbox;
import java.awt.GridLayout;
import java.awt.Panel;

public class South extends Panel {

  private Checkbox c1 = new Checkbox("Checkbox");
  private Checkbox c2 = new Checkbox("Checkbox");
  private Checkbox c3 = new Checkbox("Checkbox");
  private Checkbox c4 = new Checkbox("Checkbox");
  private Checkbox c5 = new Checkbox("Checkbox");
  private Checkbox c6 = new Checkbox("Checkbox");

  public South() {
    this.setLayout(new GridLayout(2, 3));

    this.add(c1);
    this.add(c2);
    this.add(c3);
    this.add(c4);
    this.add(c5);
    this.add(c6);
  }
}
