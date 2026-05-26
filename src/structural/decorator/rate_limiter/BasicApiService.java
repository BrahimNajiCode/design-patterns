package structural.decorator.rate_limiter;

public class BasicApiService implements ApiService{
    @Override
    public void request() {
        System.out.println("New request sent.");
    }
}
