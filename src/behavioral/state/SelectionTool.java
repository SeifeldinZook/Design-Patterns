package behavioral.state;

public class SelectionTool implements Tool {

  @Override
  public void mouseUp() {
    System.out.println("Selection Tool: mouseUp");
  }

  @Override
  public void mouseDown() {
    System.out.println("Selection Tool: mouseDown");
  }
}
