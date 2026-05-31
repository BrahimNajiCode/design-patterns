package structural.bridge.tv;

public class AppleTV implements Device{
    @Override
    public void turnOn() {
        System.out.println("Apple TV is ON.");
    }

    @Override
    public void turnOff() {
        System.out.println("Apple TV is OFF.");
    }
}
