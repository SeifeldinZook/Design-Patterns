package behavioral.state;

public class BrushTool implements Tool {

  @Override
  public void mouseUp() {
    System.out.println("Brush Tool: mouseUp");
  }

  @Override
  public void mouseDown() {
    System.out.println("Brush Tool: mouseDown");
  }
}
