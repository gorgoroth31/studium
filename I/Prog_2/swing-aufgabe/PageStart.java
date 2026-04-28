import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PageStart extends JPanel {
  private JLabel label = new JLabel("Adresse:");
  private JTextField textField = new JTextField();

  public PageStart() {
    this.add(label);
    this.add(textField);

    this.setVisible(true);
  }
}
