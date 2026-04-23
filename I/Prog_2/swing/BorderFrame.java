import java.awt.AWTEvent;
import java.awt.BorderLayout;
import java.awt.Frame;

public class BorderFrame extends Frame {
  public BorderFrame() {
    enableEvents(AWTEvent.WINDOW_EVENT_MASK);
    init();
  }

  private void init() {
    this.setLayout(new BorderLayout());
    this.add(new North(), BorderLayout.North);
  }
}
