package structural.decorator.middleware;

public class CacheDecorator extends HandlerDecorator{
    private boolean cached = false;
    public CacheDecorator(Handler handler) {
        super(handler);
    }
    @Override
    public void handle(String request){
        if (cached) {
            System.out.println("CACHE HIT");
            return;
        }

        System.out.println("CACHE MISS");

        cached = true;

        super.handle(request);
    }
}
