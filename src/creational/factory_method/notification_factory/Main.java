package creational.factory_method.notification_factory;

public class Main {
    public static void main(String[] args) {
        NotificationService service;
        service = NotificationFactory.create("sms");
        service.send("WACH ABANA SNOW!");
        service = NotificationFactory.create("email");
        service.send("MEOWWWWWWWWWWWW");
    }
}
