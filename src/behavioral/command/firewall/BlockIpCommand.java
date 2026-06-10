package behavioral.command.firewall;

public class BlockIpCommand implements Command{
    private Firewall firewall;
    private String ip;

    public BlockIpCommand(Firewall firewall, String ip) {
        this.firewall = firewall;
        this.ip = ip;
    }

    @Override
    public void execute() {
        firewall.blockIp(ip);
    }

}
