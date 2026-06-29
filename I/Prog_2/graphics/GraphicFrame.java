import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class GraphicFrame extends JFrame {

  public GraphicFrame() {
    this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    init();
  }

  private void init() {
    this.setSize(new Dimension(400, 300));
    this.setTitle("Graphic Frame");

    DrawPanel newDp = new DrawPanel();
    this.addMouseListener(new MouseListener() {
      public void mouseExited(MouseEvent e) {

      }

      public void mouseEntered(MouseEvent e) {

      }

      public void mouseReleased(MouseEvent e) {

      }

      public void mouseClicked(MouseEvent e) {
        boolean isLeftClick = e.getButton() == 1;
        newDp.colorLeftEllipsis = isLeftClick ? Color.RED : Color.CYAN;
        newDp.repaint();
      }

      public void mousePressed(MouseEvent e) {

      }
    });
    add(newDp);
  }

  public void drawTest() {

    try {
      Thread.sleep(100);
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
    System.out.println("drawing stuff");
  }
}

class DrawPanel extends JPanel {
  private int n = 0;

  public Color colorLeftEllipsis = Color.GREEN;

  @Override
  protected void paintComponent(Graphics g) {
    // paint() hat bei mir nicht funktioniert, deswegen benutze ich diese Methode
    super.paintComponent(g);

    n++;

    int height = g.getClipBounds().height;
    int width = g.getClipBounds().width;

    g.setColor(colorLeftEllipsis);
    g.drawOval((width / 2) - 60, (height / 2) - 50, 30, 30);

    g.setColor(Color.BLUE);
    g.drawOval((width / 2) + 30, (height / 2) - 30, 30, 10);

    g.setColor(new Color(130, 0, 0));
    g.fillRect((width / 2) - 60, (height / 2) + 90, 120, 10);
    g.drawLine((width / 2), (height / 2) + 60, (width / 2), (height / 2));
    // g.draw3DRect(200, 200, 300, 500, false);
    // g.drawArc(100, 200, 100, 200, 90, 270);

    g.setColor(Color.BLACK);
    g.drawString("Paul ist zum " + n + ". mal nicht glücklich", (width / 2) - 100, (height / 2) + 120);

    colorLeftEllipsis = Color.GREEN;
  }
}
