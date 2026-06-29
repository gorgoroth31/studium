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
