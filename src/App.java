import behavioral.state.BrushTool;
import behavioral.state.Canvas;
import behavioral.state.SelectionTool;
import behavioral.strategy.BlackWhiteFilter;
import behavioral.strategy.ImageStorage;
import behavioral.strategy.JpegCompressor;

public class App {

  public static void main(String[] args) throws Exception {
    // Behavioral State Design Pattern
    System.out.println("==========Behavioral State Design Pattern==========");
    var canvas = new Canvas();
    canvas.setCurrentTool(new SelectionTool()); // pass an object that implements the Tool interface
    canvas.mouseUp();
    canvas.mouseDown();
    canvas.setCurrentTool(new BrushTool()); // pass an object that implements the Tool interface
    canvas.mouseUp();
    canvas.mouseDown();

    // Behavioral Strategy Design Pattern
    System.out.println("===========Behavioral Strategy Design Pattern======");
    var imageStorage = new ImageStorage();
    imageStorage.storeIntoStorage(
      "This is file name!",
      new JpegCompressor(),
      new BlackWhiteFilter()
    );
  }
}
