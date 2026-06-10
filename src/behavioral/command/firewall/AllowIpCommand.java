package behavioral.command.firewall;

public class AllowIpCommand implements Command {
    private Firewall firewall;
    private String ip;


    public AllowIpCommand(Firewall firewall, String ip) {
        this.firewall = firewall;
        this.ip = ip;
    }


    @Override
    public void execute() {
        firewall.allowIp(ip);
    }
}
