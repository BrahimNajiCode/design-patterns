package behavioral.chain_of_responsibility.demo;

public class DirectorSupport extends Handler{
    @Override
    public void handle(String req) {
        System.out.println("Handled by Director.");
    }
}
