package structural.decorator;

public class CloudStream implements Stream {

  public void writeToCloud(String data) {
    System.out.println("Storing... " + data);
  }
}
