package structural.decorator;

public class CompressedCloudStream implements Stream {

  private Stream stream;

  public CompressedCloudStream(Stream stream) {
    this.stream = stream;
  }

  @Override
  public void writeToCloud(String data) {
    var encrypted = encrypt(data);
    stream.writeToCloud(encrypted);
  }

  private String encrypt(String data) {
    return data + " COMPRESSED";
  }
}
