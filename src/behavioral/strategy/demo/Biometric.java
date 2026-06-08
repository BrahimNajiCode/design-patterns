package behavioral.strategy.demo;

public class Biometric implements AuthenticationStrategy{


    @Override
    public boolean authenticate() {
        System.out.println("Authenticating using biometrics...");
        return true;
    }
}
