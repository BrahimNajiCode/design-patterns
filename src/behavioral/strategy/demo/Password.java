package behavioral.strategy.demo;

public class Password implements AuthenticationStrategy {

    @Override
    public boolean authenticate() {
        System.out.println("Authenticating using password...");
        return true;
    }
}
