package structural.decorator.notification;

public class BasicNotification implements Notification{
    //In the Decorator pattern, the ConcreteComponent is the original/basic
    // object that contains the core behavior .
    //Decorators wrap around it to add extra features dynamically.
    @Override
    public void send(String message) {
        System.out.println("Sending notification: "+message);
    }
}
