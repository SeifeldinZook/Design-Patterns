package behavioral.strategy;

public class JpegCompressor implements Compressor {

  @Override
  public void compress(String fileName) {
    System.out.println("Compress JPEG");
  }
}
