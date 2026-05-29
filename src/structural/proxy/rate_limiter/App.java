package structural.proxy.rate_limiter;

public class App {
    public static void main(String[] args) {
        WeatherService weatherService = new WeatherProxy();
        for(float i=0;i<10;++i){
            weatherService.request();
        }
    }
}
