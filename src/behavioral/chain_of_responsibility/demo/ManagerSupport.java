package behavioral.chain_of_responsibility.demo;

public class ManagerSupport extends Handler{

    @Override
    public void handle(String req) {
        if(req.equals("refund")){
            System.out.println("Handled by Manager.");
        } else if (next!=null) /* Check if we have a next handler */ {
            next.handle(req);
        }
    }
}
