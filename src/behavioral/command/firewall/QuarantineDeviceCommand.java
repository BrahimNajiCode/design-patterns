package behavioral.command.firewall;

public class QuarantineDeviceCommand implements Command {
    private Firewall firewall;
    private String deviceId;

    public QuarantineDeviceCommand(Firewall firewall, String deviceId) {
        this.firewall = firewall;
        this.deviceId = deviceId;
    }

    @Override
    public void execute() {
        firewall.quarantine(deviceId);
    }

}
