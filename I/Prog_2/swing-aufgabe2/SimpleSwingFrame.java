import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.*;

public class SimpleSwingFrame extends JFrame {

  JPanel panel = new JPanel();
  JTextArea textArea = new JTextArea();

  StringBuilder sb = new StringBuilder();

  public SimpleSwingFrame() {
    this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    init();
  }

  private void init() {
    this.setSize(new Dimension(400, 300));
    this.setTitle("Simple Swing Frame");
    panel.setLayout(new BorderLayout());

    JPanel btnContainer = new JPanel();

    JButton btn1 = new JButton("ich");
    btn1.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        sb.append("ich ");
        rerender();
      }
    });

    JButton btn2 = new JButton("bin");
    btn2.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        sb.append("bin ");
        rerender();
      }
    });

    JButton btn3 = new JButton("wie");
    btn3.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        sb.append("wie ");
        rerender();
      }
    });

    btnContainer.add(btn1);
    btnContainer.add(btn2);
    btnContainer.add(btn3);

    panel.add(btnContainer, BorderLayout.PAGE_START);
    panel.add(textArea, BorderLayout.CENTER);

    this.setContentPane(panel);
  }

  private void rerender() {
    textArea.setText(sb.toString());
  }
}
