package creational.factory_method.notification_factory;

public class PushNotification implements NotificationService{
    @Override
    public void send(String message) {
        System.out.println("[PUSH]: "+message);
    }
}
