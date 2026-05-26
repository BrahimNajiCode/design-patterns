package structural.decorator.middleware;

public class ContollerHandler implements Handler{
    @Override
    public void handle(String request) {
        System.out.println("Controller executed.");
    }
}
