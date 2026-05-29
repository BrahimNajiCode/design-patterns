package structural.proxy.rate_limiter;

public class WeatherProxy implements WeatherService {
    private static final int MAX_REQUESTS = 5;
    private int counter = 0;
    private RealWeatherService realWeatherService;

    @Override
    public void request() {
        logRequest();

        if(counter>=MAX_REQUESTS){
            // Block After Limit
            System.out.println("Too many requests!");
            return;
        }

        // Lazy initialization - create only when needed
        if(realWeatherService == null)
            realWeatherService = new RealWeatherService();

        counter++;
        realWeatherService.request();
    }

    private void logRequest(){
        System.out.println("[LOG] Incoming request #" + (counter + 1));
    }
}
