import java.awt.Panel;
import java.awt.TextArea;

public class Center extends Panel {
  private TextArea textArea = new TextArea("TextArea");

  public Center() {
    this.add(textArea);
  }
}
