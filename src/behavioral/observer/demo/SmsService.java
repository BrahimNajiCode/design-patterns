package behavioral.observer.demo;

public class SmsService implements Observer{
    @Override
    public void update(String message) {
        System.out.println("[SMS] " + message);
    }
}
