import java.awt.*;
import java.awt.event.*;

public class KomponentsFrame extends Frame {
  private Button button = new Button("Button");
  private Label label = new Label("Label");
  private Checkbox checkbox = new Checkbox("Checkbox");

  private Label groupLabel = new Label("Checkboxgroup:");

  private CheckboxGroup group = new CheckboxGroup();

  private Checkbox box1 = new Checkbox("one", group, false);
  private Checkbox box2 = new Checkbox("two", group, true);
  private Checkbox box3 = new Checkbox("three", group, false);

  public KomponentsFrame() {
    enableEvents(AWTEvent.WINDOW_EVENT_MASK);
    init();
  }

  private void init() {
    this.setLayout(new BorderLayout());
    this.setSize(300, 200);
    this.setTitle("Komponents App");

    this.add(label, BorderLayout.NORTH);
    this.add(button, BorderLayout.NORTH);
    this.add(checkbox, BorderLayout.CENTER);

    this.add(groupLabel, BorderLayout.SOUTH);
    this.add(box1, BorderLayout.SOUTH);
    this.add(box2, BorderLayout.SOUTH);
    this.add(box3, BorderLayout.SOUTH);
  }

  protected void processWindowEvent(WindowEvent e) {
    if (e.getID() == WindowEvent.WINDOW_CLOSING) {
      System.exit(0);
    }
  }
}
