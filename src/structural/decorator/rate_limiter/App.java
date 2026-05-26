package structural.decorator.rate_limiter;

public class App {
    public static void main(String[] args) {
        ApiService apiService = new ApiServiceDecorator(new BasicApiService());
        apiService.request(); // New request sent.
        apiService.request(); // New request sent.
        apiService.request(); // New request sent.
        apiService.request(); // RATE LIMIT EXCEEDED.
    }
}
