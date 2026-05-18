package creational.factory_method.notification_factory;

public class EmailNotification implements NotificationService{

    @Override
    public void send(String message) {
        System.out.println("[EMAIL]: "+message);
    }
}
