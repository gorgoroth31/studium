import java.awt.Color;
import java.awt.Dimension;
import java.util.Random;

import javax.swing.JFrame;

public class FrameMover {
  public void main() {
    this.create();
  }

  public void create() {
    Frame frame = new Frame();

    frame.validate();
    frame.setVisible(true);

  }
}

public class Frame extends JFrame {

  public Frame() {
    this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    init();
  }

  private void init() {
    this.setSize(new Dimension(100, 100));
    this.setTitle("Framyframe");

    Random rand = new Random();

    float r = rand.nextFloat();
    float g = rand.nextFloat();
    float b = rand.nextFloat();

    Color randomColor = new Color(r, g, b);

    System.out.println(randomColor.getRGB());

    this.getContentPane().setBackground(randomColor);

    MoverThread thread = new MoverThread(this);
    thread.start();
  }

}

public class MoverThread extends Thread {

  private Frame frame;

  public MoverThread(Frame frame) {
    this.frame = frame;
  }

  @Override
  public void run() {
    while (true) {
      Random rand = new Random();

      int duration = rand.nextInt(3, 5);

      try {
        sleep(duration * 1000);
      } catch (InterruptedException ex) {
        System.out.println(ex.getLocalizedMessage());
      }
      System.out.println("relocating...");
      int x = rand.nextInt(50, 600);
      int y = rand.nextInt(50, 600);
      this.frame.setBounds(x, y, 100, 100);
      this.frame.pack();
    }
  }
}
