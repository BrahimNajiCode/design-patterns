package structural.proxy.rate_limiter;

public class RealWeatherService implements WeatherService{
    public RealWeatherService(){
        System.out.println("Creating new weather service...");
    }

    @Override
    public void request() {
        System.out.println("Request accepted.");
    }
}
