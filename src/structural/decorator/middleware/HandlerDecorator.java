package structural.decorator.middleware;

public class HandlerDecorator  implements Handler{
    protected Handler handler;
    public HandlerDecorator(Handler handler){
        this.handler = handler;
    }

    @Override
    public void handle(String request) {
        handler.handle(request);
    }
}
