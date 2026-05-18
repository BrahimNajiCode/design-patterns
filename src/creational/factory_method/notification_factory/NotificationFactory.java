package creational.factory_method.notification_factory;

public class NotificationFactory {
    static NotificationService create(String type){
        if(type.equalsIgnoreCase("sms"))
            return new SMSNotification();
        if(type.equalsIgnoreCase("email"))
            return new EmailNotification();
        if(type.equalsIgnoreCase("push"))
            return new PushNotification();
        throw new  IllegalArgumentException("UNKNOWN TYPE OF NOTIFICATION");
    }
}
