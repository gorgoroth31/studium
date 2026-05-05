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
