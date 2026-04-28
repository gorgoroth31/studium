import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;

public class North extends Panel {
  private Label label = new Label("Adresse:");
  private TextField textField = new TextField("TextField....");

  public North() {
    this.add(label);
    this.add(textField);
  }
}
