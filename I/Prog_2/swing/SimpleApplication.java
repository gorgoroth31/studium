import java.awt.Frame;

public class SimpleApplication {
  private Frame frame = null;

  public SimpleApplication() {
    frame = new BorderFrame();

    frame.validate();
    frame.setVisible(true);
  }
}
