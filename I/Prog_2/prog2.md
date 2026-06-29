- Student: Matthias Glenk
- Vorlesung: Programmieren 2 Sommersemester 2026

```java

public class Laeufer {
  public String name;
  public int startNummer;
  public double gewicht;
  public int alter;

  public void druckeInfo() {
    // 2A
    System.out
        .println("Name: " + name + "\nStartnummer: " + startNummer + "\nGewicht: " + gewicht + "kg\nAlter: " + alter);
  }
}
public class LaufVerwaltung {
  // 2B

  private Laeufer[] laeufer = {};;

  void main() {
    Laeufer l = new Laeufer();
    Laeufer l2 = new Laeufer();
    laeuferHinzu(l);
    laeuferHinzu(l2);

    gibLaeuferAus();
  }

  public LaufVerwaltung() {
  }

  public void laeuferHinzu(Laeufer l) {
    Laeufer[] tmp = laeufer;

    laeufer = new Laeufer[laeufer.length + 1];

    for (int i = 0; i < tmp.length; i++) {
      laeufer[i] = tmp[i];
    }

    l.startNummer = ersteVerfuegbareNummer();
    laeufer[laeufer.length - 1] = l;
  }

  public void gibLaeuferAus() {
    for (Laeufer l : laeufer) {
      l.druckeInfo();
    }
  }

  private int ersteVerfuegbareNummer() {
    int number = 0;
    for (int i = 0; i < laeufer.length; i++) {
      for (Laeufer l : laeufer) {
        if (l == null) {
          continue;
        }
        if (l.startNummer == i) {
          break;
        }

        number = i;
      }
      if (number != 0) {
        break;
      }
    }
    return number;
  }
}
public class Eieruhr {
  // 3
  private int laufzeit;

  void main() {
    Eieruhr eu = new Eieruhr(10);
    eu.start();
  }

  public Eieruhr() {
  }

  public Eieruhr(int laufzeit) {
    this.laufzeit = laufzeit;
  }

  public void start() {
    for (int i = laufzeit; i >= 0; i--) {
      System.out.println("tick - " + i);
      if (i == 0) {
        System.out.println("Klingel!");
      }
      try {
        Thread.sleep(1000);
      } catch (InterruptedException e) {
        System.out.println(e);
      }
    }
  }
}
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
class Main {
  void main() {
    new SimpleApplication();
  }
}
import java.awt.Button;
import java.awt.GridLayout;
import java.awt.Panel;

public class North extends Panel {
  private Button b1 = new Button("1");
  private Button b2 = new Button("2");
  private Button b3 = new Button("3");

  public North() {
    init();
  }

  private void init() {
    this.setLayout(new GridLayout(1, 3));
    this.add(b1);
    this.add(b2);
    this.add(b3);
  }
}
import java.awt.Frame;

public class SimpleApplication {
  private Frame frame = null;

  public SimpleApplication() {
    frame = new BorderFrame();
    frame.validate();
    frame.setVisible(true);
  }
}
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
public class SwingApplication {

  public static void main(String[] args) {
    new SwingApplication();
  }

  public SwingApplication() {
    SimpleSwingFrame frame = new SimpleSwingFrame();

    frame.validate();
    frame.setVisible(true);

  }
}
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
public class SwingApplication {

  public static void main(String[] args) {
    new SwingApplication();
  }

  public SwingApplication() {
    SimpleSwingFrame frame = new SimpleSwingFrame();

    frame.validate();
    frame.setVisible(true);

  }
}
public class GraphicApplication {
  public GraphicApplication() {
    GraphicFrame frame = new GraphicFrame();

    frame.validate();
    frame.setVisible(true);

    frame.drawTest();
  }

  public static void main(String[] args) {
    new GraphicApplication();
  }
}
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
import java.awt.Frame;

public class App {
  private Frame frame = null;

  public App() {
    frame = new AufgabenFrame();

    frame.validate();
    frame.setVisible(true);
  }
}
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
import java.awt.Panel;
import java.awt.TextArea;

public class Center extends Panel {
  private TextArea textArea = new TextArea("TextArea");

  public Center() {
    this.add(textArea);
  }
}
import java.awt.List;
import java.awt.Panel;

public class East extends Panel {
  private List list = new List();

  public East() {
    list.add("List");
    this.add(list);
  }
}
public class Main {
  // 4
  void main() {
    new App();
  }
}
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;

public class North extends Panel {
  private Label label = new Label("Adresse:");
  private TextField textField = new TextField("TextField....");

  public North() {
    this.add(label);
    this.add(textField);
  }
}
import java.awt.Checkbox;
import java.awt.GridLayout;
import java.awt.Panel;

public class South extends Panel {

  private Checkbox c1 = new Checkbox("Checkbox");
  private Checkbox c2 = new Checkbox("Checkbox");
  private Checkbox c3 = new Checkbox("Checkbox");
  private Checkbox c4 = new Checkbox("Checkbox");
  private Checkbox c5 = new Checkbox("Checkbox");
  private Checkbox c6 = new Checkbox("Checkbox");

  public South() {
    this.setLayout(new GridLayout(2, 3));

    this.add(c1);
    this.add(c2);
    this.add(c3);
    this.add(c4);
    this.add(c5);
    this.add(c6);
  }
}
import java.awt.Button;
import java.awt.GridLayout;
import java.awt.Panel;

public class West extends Panel {
  // 7 felder übereinander, das 5te ist leer
  private Button b1 = new Button("Button");
  private Button b2 = new Button("Button");
  private Button b3 = new Button("Button");
  private Button b4 = new Button("Button");
  private Button b5 = new Button("Button");
  private Button b0 = new Button();
  private Button b6 = new Button("Button");

  public West() {
    this.setLayout(new GridLayout(7, 1));
    this.add(b1);
    this.add(b2);
    this.add(b3);
    this.add(b4);
    this.add(b5);
    b0.setVisible(false);
    this.add(b0);
    this.add(b6);
  }
}
import java.io.FileOutputStream;
import java.io.PrintWriter;

public class Laeufer {

  private String name;
  private int startNr;
  private int alter;
  private double gewicht;

  public Laeufer(int startNr, String name, int alter, double gewicht) {
    this.startNr = startNr;
    this.name = name;
    this.alter = alter;
    this.gewicht = gewicht;
  }

  public static void main(String[] args) {

  }

  public void saveFkt() {
    Laeufer ho = new Laeufer(12, "homer", 36, 106.9);
    Laeufer sm = new Laeufer(14, "smithers", 39, 67);

    try {
      PrintWriter toFile = new PrintWriter(new FileOutputStream("./marathon.txt"));

      ho.save(toFile);
      sm.save(toFile);

      toFile.close();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  public void save(PrintWriter fileWriter) {
    fileWriter.println("Lauefer");
    fileWriter.println(startNr);
    fileWriter.println(name);
    fileWriter.println(alter);
    fileWriter.println(gewicht);
  }
}
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
public class Rekursion {
  public void main() {
    Rekursion r = new Rekursion();

    r.zeichneDreieck(5);
    r.dreieckZeichnen(5);
    System.out.println(r.zweiHochX(10));
    System.out.println(r.aHochB(3, 3));
    System.out.println(r.fakultaet(6));
  }

  public void zeichneDreieck(int n) {
    if (n > 0) {
      zeichneDreieck(n - 1);
    }

    for (int i = 0; i < n; i++) {
      System.out.print("#");
    }

    System.out.println("");
  }

  public void dreieckZeichnen(int n) {
    if (n == 0) {
      return;
    }
    for (int i = 0; i < n; i++) {
      System.out.print("o");
    }
    System.out.println();

    dreieckZeichnen(n - 1);
  }

  public int zweiHochX(int x) {
    if (x == 0) {
      return 1;
    }

    return 2 * zweiHochX(x - 1);
  }

  public int aHochB(int a, int b) {
    if (b == 0) {
      return 1;
    }

    return a * aHochB(a, b - 1);
  }

  public int fakultaet(int x) {
    if (x == 0) {
      return 1;
    }

    return x * fakultaet(x - 1);
  }
}
```