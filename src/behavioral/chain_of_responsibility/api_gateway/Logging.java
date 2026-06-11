package behavioral.chain_of_responsibility.api_gateway;

public class Logging extends Handler{

    @Override
    protected void handle(Request req) {
        System.out.println("[LOG] Request received: "+req.getEndpoint());
        if(next!=null)
            next.handle(req);
    }
}
