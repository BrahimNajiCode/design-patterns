package behavioral.observer.demo;

public class Main {
    public static void main(String[] args) {
        SecurityAlertSystem system = new SecurityAlertSystem();
        system.attach(new EmailService());
        system.attach(new SmsService());
        system.detectThreat("Multiple failed login attempts");
    }
}
