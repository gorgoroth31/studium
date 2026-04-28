import java.awt.AWTEvent;
import java.awt.BorderLayout;
import java.awt.Frame;

import javax.swing.border.Border;

public class AufgabenFrame extends Frame {

  public AufgabenFrame() {
    enableEvents(AWTEvent.WINDOW_EVENT_MASK);
    init();
  }

  private void init() {
    this.setLayout(new BorderLayout());
    this.add(new North(), BorderLayout.NORTH);
    this.add(new West(), BorderLayout.WEST);
    this.add(new Center(), BorderLayout.CENTER);
    this.add(new East(), BorderLayout.EAST);
    this.add(new South(), BorderLayout.SOUTH);
  }
}
