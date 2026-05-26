package structural.decorator.notification;

public class EmailDecorator  extends NotificationDecorator{

    public EmailDecorator(Notification wrapped) {
        super(wrapped);
    }

    @Override
    public void send(String message){
        super.send(message);
        System.out.println("Sending Email: "+message);
    }
}
