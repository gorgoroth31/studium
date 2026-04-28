import java.awt.Frame;

public class App {
  private Frame frame = null;

  public App() {
    frame = new AufgabenFrame();

    frame.validate();
    frame.setVisible(true);
  }
}
