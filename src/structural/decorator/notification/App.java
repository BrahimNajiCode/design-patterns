package structural.decorator.notification;

public class App {
    public static void main(String[] args) {
        Notification notification = new SMSDecorator(
          new EmailDecorator(
                  new BasicNotification()
          )
        );

        notification.send("Server is down!");
    }
}
