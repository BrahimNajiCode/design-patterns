package structural.decorator.middleware;

public class LoggingDecorator extends HandlerDecorator{
    public LoggingDecorator(Handler handler){
        super(handler);
    }

    @Override
    public void handle(String request) {
        System.out.println("[LOG] Request received");
        super.handle(request);
        System.out.println("[LOG] Request finished");
    }
}
