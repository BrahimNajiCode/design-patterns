package structural.decorator.middleware;

public class App {
    public static void main(String[] args) {
        Handler handler = new LoggingDecorator(
                new AuthDecorator(
                new CacheDecorator(
                new ContollerHandler()
        )));
        System.out.println("=== REQUEST 1 ===");

        handler.handle("GET /users?token=valid");

        System.out.println();

        System.out.println("=== REQUEST 2 ===");

        handler.handle("GET /users?token=valid");

        System.out.println();

        System.out.println("=== REQUEST 3 ===");

        handler.handle("GET /users");
    }
}
