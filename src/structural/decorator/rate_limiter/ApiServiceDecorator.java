package structural.decorator.rate_limiter;

public class ApiServiceDecorator implements ApiService{
    private int counter = 0;
    protected ApiService apiService;
    public ApiServiceDecorator(ApiService apiService){
        this.apiService = apiService;
    }

    @Override
    public void request() {
       if(counter++<3)
           apiService.request();
       else
           System.out.println("RATE LIMIT EXCEEDED.");
    }
}
