package behavioral.observer.e_commerce;

public class EmailNotification implements Observer{
    @Override
    public void update(String orderId) {
        System.out.println("Email sent for order "+orderId);
    }
}
