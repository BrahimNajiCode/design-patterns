package structural.decorator.logging;

public class App {
    public static void main(String[] args) {
        UserService userService = new LoggingDecorator(new BasicUserService());
        userService.createUser("KIZ4RUUU");
    }
}
