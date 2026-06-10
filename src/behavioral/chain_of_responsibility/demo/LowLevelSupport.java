package behavioral.chain_of_responsibility.demo;

public class LowLevelSupport extends Handler{

    @Override
    public void handle(String req) {
        if(req.equals("password_reset")){
            System.out.println("Handled by low level support.");
        }else if (next!=null){
            next.handle(req);
        }
    }
}
