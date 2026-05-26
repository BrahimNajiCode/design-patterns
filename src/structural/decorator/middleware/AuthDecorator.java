package structural.decorator.middleware;

public class AuthDecorator extends HandlerDecorator{
    public AuthDecorator(Handler handler) {
        super(handler);
    }

    @Override
    public void handle(String request) {
        if (!request.contains("token=valid")) {
            System.out.println("401 UNAUTHORIZED");
            return;
        }

        System.out.println("Authentication successful");

        super.handle(request);
    }
}
