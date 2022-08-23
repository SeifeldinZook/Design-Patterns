import behavioral.momento.Editor;
import behavioral.momento.History;
import behavioral.state.BrushTool;
import behavioral.state.Canvas;
import behavioral.state.SelectionTool;
import behavioral.strategy.BlackWhiteFilter;
import behavioral.strategy.ImageStorage;
import behavioral.strategy.JpegCompressor;
import creational.singleton.Database;
import structural.bridge.RemoteControl;
import structural.bridge.RemoteControlPro;
import structural.bridge.SonyTV;
import structural.decorator.CloudStream;
import structural.decorator.CompressedCloudStream;
import structural.decorator.EncryptedCloudStream;
import structural.proxy.Library;
import structural.proxy.LoggingEbookProxy;

public class App {

  public static void main(String[] args) throws Exception {
    System.out.println("========= Creational Singleton Design Pattern =====");
    var singleton = Database.getInstance("FOO");
    var anotherSingleton = Database.getInstance("BAR");
    System.out.println(singleton.value);
    System.out.println(anotherSingleton.value);

    System.out.println("========= Structural Decorator Design Pattern =====");
    var stream = new EncryptedCloudStream(
      new CompressedCloudStream(new CloudStream())
    ); // Wrapping with different decorators
    stream.writeToCloud("data");

    System.out.println("========= Structural Bridge Design Pattern ========");
    var remoteControl = new RemoteControl(new SonyTV());
    remoteControl.turnOn();
    var remoteControlPro = new RemoteControlPro(new SonyTV());
    remoteControlPro.turnOn();
    remoteControlPro.setChannel(9);

    System.out.println("========= Structural Proxy Design Pattern =========");
    var library = new Library();
    String[] filnames = { "a", "b", "c" };
    for (var fileName : filnames) {
      library.add(new LoggingEbookProxy(fileName));
    }
    library.openEbook("a");

    System.out.println("========== Behavioral State Design Pattern ========");
    var canvas = new Canvas();
    canvas.setCurrentTool(new SelectionTool()); // pass an object that implements the Tool interface
    canvas.mouseUp();
    canvas.mouseDown();
    canvas.setCurrentTool(new BrushTool()); // pass an object that implements the Tool interface
    canvas.mouseUp();
    canvas.mouseDown();

    System.out.println("========= Behavioral Strategy Design Pattern ======");
    var imageStorage = new ImageStorage();
    imageStorage.storeIntoStorage(
      "This is file name!",
      new JpegCompressor(),
      new BlackWhiteFilter()
    );

    System.out.println("========= Behavioral Momento Design Pattern =======");
    var editor = new Editor();
    var history = new History();
    editor.setContent("a");
    history.stack_push(editor.createState());
    editor.setContent("b");
    history.stack_push(editor.createState());
    editor.setContent("c");
    history.stack_push(editor.createState());

    System.out.println(editor.getContent());

    editor.undo(history.stack_pop());
    editor.undo(history.stack_pop());
    System.out.println(editor.getContent());
  }
}
