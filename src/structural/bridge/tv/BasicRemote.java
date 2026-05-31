package structural.bridge.tv;

public class BasicRemote extends RemoteControl{
    public BasicRemote(Device device) {
        super(device);
    }
    @Override
    public void togglePower(){
        device.turnOn();
    }
}
