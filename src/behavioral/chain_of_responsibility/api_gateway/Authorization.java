package behavioral.chain_of_responsibility.api_gateway;

public class Authorization extends Handler{

    @Override
    protected void handle(Request req) {
        // If user trying to retrieve some high privilege data.
        if(req.getEndpoint().contains("/admin") && !req.getRole().equalsIgnoreCase("ADMIN")){
            System.out.println("Access denied");
            return;
        }
        System.out.println("Authorized");

        if(next!=null){
            next.handle(req);
        }
    }
}
