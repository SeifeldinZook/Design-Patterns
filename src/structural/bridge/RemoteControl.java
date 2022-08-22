package structural.bridge;

public class RemoteControl {

  public Device device; // this is the bridge

  public RemoteControl(Device device) {
    this.device = device;
  }

  public void turnOn() {
    device.turnOn();
  }

  public void turnOff() {
    device.turnOff();
  }
}
