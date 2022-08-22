package structural.bridge;

public class RemoteControlPro extends RemoteControl {

  public RemoteControlPro(Device device) {
    super(device);
    //TODO Auto-generated constructor stub
  }

  public void setChannel(int channel) {
    device.setChannel(channel);
  }
}
