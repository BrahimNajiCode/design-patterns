package behavioral.template_method.auth;

public class Main {
    public static void main(String[] args) {
        AuthenticationProcess process = new PasswordAuthentication();
        process.login();
    }
}
