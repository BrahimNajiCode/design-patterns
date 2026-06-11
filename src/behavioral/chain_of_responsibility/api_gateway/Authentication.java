package behavioral.chain_of_responsibility.api_gateway;

public class Authentication extends Handler {

    @Override
    protected void handle(Request req) {
        if(req.getToken()==null){
            System.out.println("Authentication failed");
            return;
        }
        System.out.println("Authentication successful");

        // Instead for verifying each time we create a method, that looks like this
        /*
        * protected void next(Request req) {
        *    if(next != null) {
        *         next.handle(req);
        *    }
        * }
        * */
        if (next!=null) {
            next.handle(req);
        }
    }
}
