package behavioral.command.firewall;

public class FirewallConsole {
    private Command command;
    public FirewallConsole(Command command) {
        this.command = command;
    }
    public void run(){
        command.execute();
    }
}
