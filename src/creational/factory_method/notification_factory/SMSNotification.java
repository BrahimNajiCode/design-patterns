package creational.factory_method.notification_factory;

public class SMSNotification implements NotificationService{
    @Override
    public void send(String message) {
        System.out.println("[SMS]: "+message);
    }
}
