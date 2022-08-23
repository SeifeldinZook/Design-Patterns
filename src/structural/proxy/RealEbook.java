package structural.proxy;

public class RealEbook implements Ebook {

  private String fileName;

  public RealEbook(String fileName) {
    this.fileName = fileName;
    load();
  }

  public void load() {
    System.out.println("Loading Ebook... " + fileName);
  }

  @Override
  public void show() {
    System.out.println("Showing Ebook " + fileName);
  }

  @Override
  public String getFileName() {
    return fileName;
  }
}
