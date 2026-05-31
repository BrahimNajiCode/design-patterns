package structural.bridge.tv;

public class App {
    public static void main(String[] args) {
        Device samsungTV = new SamsungTV();
        RemoteControl remote1 = new BasicRemote(samsungTV);
        remote1.togglePower();

        Device appleTV = new AppleTV();
        RemoteControl remote2 = new BasicRemote(appleTV);
        remote2.togglePower();

    }
}
