package behavioral.command.firewall;

public class Main {

    public static void main(String[] args) {

        Firewall firewall = new Firewall();

        Command block =
                new BlockIpCommand(
                        firewall,
                        "192.168.1.10"
                );

        Command allow =
                new AllowIpCommand(
                        firewall,
                        "192.168.1.10"
                );

        Command quarantine =
                new QuarantineDeviceCommand(
                        firewall,
                        "DEVICE-001"
                );

        FirewallConsole console;

        console = new FirewallConsole(block);
        console.run();

        console = new FirewallConsole(allow);
        console.run();

        console = new FirewallConsole(quarantine);
        console.run();
    }
}
