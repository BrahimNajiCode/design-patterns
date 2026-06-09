package behavioral.template_method.auth;

public class OTPAuthentication extends AuthenticationProcess{
    @Override
    protected void authenticate() {
        System.out.println("Authenticating using OTP...");
    }
}
