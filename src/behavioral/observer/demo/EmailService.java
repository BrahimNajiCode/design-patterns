package behavioral.observer.demo;

public class EmailService implements Observer{

    @Override
    public void update(String message) {
        System.out.println("[EMAIL] " + message);
    }
}
