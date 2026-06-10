package behavioral.command.firewall;

public class Firewall {

    public void blockIp(String ip){
        System.out.println("Blocking IP: "+ip);
    }
    public void allowIp(String ip){
        System.out.println("Allowing IP: "+ip);
    }
    public void quarantine(String deviceId){
        System.out.println("Quarantining device: "+deviceId);
    }
}
