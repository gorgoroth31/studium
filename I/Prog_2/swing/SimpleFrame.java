import java.awt.*;
import java.awt.event.*;

public class SimpleFrame extends Frame {
  private Button button1 = new Button("first button");

  private Choice eisart = new Choice();

  public SimpleFrame() {
    enableEvents(AWTEvent.WINDOW_EVENT_MASK);
    init();
  }

  private void init() {
    this.setLayout(new FlowLayout());
    this.setSize(400, 300);

    this.setTitle("Fenster zum Test");
    this.add(button1);

    this.eisart.add("Vanille");
    this.eisart.add("Schlumpf");
    this.eisart.add("Kokos");

    this.add(eisart);
  }

  protected void processWindowEvent(WindowEvent evt) {
    if (evt.getID() == WindowEvent.WINDOW_CLOSING) {
      System.exit(0);
    }
  }
}
