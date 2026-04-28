import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.border.Border;

public class Main {

  void main() {
    JFrame frame = new JFrame();

    Container pane = frame.getContentPane();

    pane.add(new PageStart(), BorderLayout.PAGE_START);

    pane.setLayout(new BorderLayout());
    pane.setVisible(true);
    frame.setVisible(true);
  }
}
