package behavioral.command.demo;

public class Main {
    public static void main(String[] args) {
        // Receiver
        Tv tv = new Tv();
        // invoker
        RemoteControl remote = new RemoteControl();

        // Create commands
        Command power = new PowerCommand(tv);
        Command volumeUp = new VolumeUpCommand(tv);
        Command mute = new MuteCommand(tv);

        // Execute commands
        remote.setCommand(power);
        remote.pressButton();     // TV is ON

        remote.setCommand(volumeUp);
        remote.pressButton();     // Volume: 11
        remote.pressButton();     // Volume: 12

        remote.setCommand(mute);
        remote.pressButton();     // Volume: 0

        // Undo!
        remote.undo();            // Volume: 12
        remote.undo();            // Volume: 11
        remote.undo();            // TV is OFF
    }
}
