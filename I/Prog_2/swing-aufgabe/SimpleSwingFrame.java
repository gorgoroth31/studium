import java.awt.*;
import javax.swing.*;

public class SimpleSwingFrame extends JFrame {

  JPanel panel = new JPanel();

  public SimpleSwingFrame() {
    this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    init();
  }

  private void init() {
    this.setSize(new Dimension(400, 300));
    this.setTitle("Simple Swing Frame");
    panel.setLayout(new BorderLayout());

    addNorth();
    addWest();
    addEast();
    addCenter();
    addSouth();

    this.setContentPane(panel);
  }

  private void addNorth() {
    JPanel north = new JPanel();

    north.add(new JLabel("Adresse: "));
    north.add(new JTextField("TextField........"));

    panel.add(north, BorderLayout.PAGE_START);
  }

  private void addWest() {
    JPanel west = new JPanel();
    west.setLayout(new GridLayout(7, 1));

    for (int i = 0; i < 7; i++) {
      JButton btn = new JButton("Button");

      west.add(btn);

      if (i == 4) {
        btn.setVisible(false);
      }
    }

    panel.add(west, BorderLayout.LINE_START);
  }

  private void addCenter() {
    JPanel center = new JPanel();

    center.add(new TextArea("TextArea"));

    panel.add(center, BorderLayout.CENTER);
  }

  private void addEast() {
    JPanel east = new JPanel();

    JList<String> list = new JList<String>(new String[] { "List" });

    east.add(list);

    panel.add(east, BorderLayout.LINE_END);
  }

  private void addSouth() {
    JPanel south = new JPanel();
    south.setLayout(new GridLayout(2, 3));

    for (int i = 0; i < 6; i++) {
      south.add(new JCheckBox("Checkbox"));
    }

    panel.add(south, BorderLayout.PAGE_END);
  }

}
