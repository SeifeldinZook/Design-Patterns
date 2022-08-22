package structural.decorator;

public class EncryptedCloudStream implements Stream {

  private Stream stream;

  public EncryptedCloudStream(Stream stream) {
    this.stream = stream;
  }

  @Override
  public void writeToCloud(String data) {
    var encrypted = encrypt(data);
    stream.writeToCloud(encrypted);
  }

  private String encrypt(String data) {
    return data + " ENCRYPTED";
  }
}
