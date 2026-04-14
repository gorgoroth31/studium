import java.awt.Frame;

public class SimpleApplication {
  private Frame frame = null;

  public SimpleApplication() {
    frame = new SimpleFrame();

    frame.validate();
    frame.setVisible(true);
  }
}
