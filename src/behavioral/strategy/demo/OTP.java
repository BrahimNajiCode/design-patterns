package behavioral.strategy.demo;

public class OTP implements AuthenticationStrategy{

    @Override
    public boolean authenticate() {
        System.out.println("Authenticating using OTP...");
        return true;
    }
}
