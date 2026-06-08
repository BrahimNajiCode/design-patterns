package behavioral.strategy.demo;

public class AuthService {
    // The Auth Service use Auth Strategy which means we have DI.
    private  AuthenticationStrategy authStrategy;

    public AuthService(AuthenticationStrategy authStrategy) {
        this.authStrategy = authStrategy;
    }

    public boolean login(){
        return authStrategy.authenticate();
    }

    // A setter in case we want to change our strategy (ie our way of login [password-otp-biometrics])
    public void setAuthenticationStrategy(AuthenticationStrategy authStrategy) {
        this.authStrategy = authStrategy;
    }
}
