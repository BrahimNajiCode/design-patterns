package behavioral.chain_of_responsibility.api_gateway;

public class Controller extends Handler{


    @Override
    protected void handle(Request req) {
        System.out.println("Users retrieved successfully");
    }
}
