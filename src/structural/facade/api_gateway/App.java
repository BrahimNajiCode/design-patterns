package structural.facade.api_gateway;

import java.io.IOException;

public class App {
    public static void main(String[] args) throws IOException {
        ApiGatewayFacade apiGatewayFacade = new ApiGatewayFacade();
        apiGatewayFacade.getDashboardData();
    }
}
