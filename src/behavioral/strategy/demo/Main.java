package behavioral.strategy.demo;

public class Main {
    public static void main(String[] args) {
        // Simply creating an auth service
        AuthService authService = new AuthService(new Password());
        if(authService.login())
            System.out.println("Log in successfully.");

        // OUT:
        // Authenticating using password...
        // Log in successfully.


        // This time I want to log in using for example Biometrics
        authService.setAuthenticationStrategy(new Biometric());
        if(authService.login())
            System.out.println("Log in successfully.");
    }
}
