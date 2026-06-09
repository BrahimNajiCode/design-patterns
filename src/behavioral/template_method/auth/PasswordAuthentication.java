package behavioral.template_method.auth;

public class PasswordAuthentication extends AuthenticationProcess{

    @Override
    protected void authenticate() {
        System.out.println("Authenticating using password...");
    }
}
