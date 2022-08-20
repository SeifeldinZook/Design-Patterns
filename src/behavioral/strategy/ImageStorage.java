package behavioral.strategy;

public class ImageStorage {

  /* 
  private Compressor compressor;
  private Filter filter;

  // Constructor
  public ImageStorage(Compressor compressor, Filter filter) {
    this.compressor = compressor;
    this.filter = filter;
  }

  public void storeIntoStorage(String fileName) {
    compressor.compress(fileName);
    filter.filter(fileName);
  } 
  */

  public void storeIntoStorage(
    String fileName,
    Compressor compressor,
    Filter filter
  ) {
    compressor.compress(fileName);
    filter.filter(fileName);
  }
}
