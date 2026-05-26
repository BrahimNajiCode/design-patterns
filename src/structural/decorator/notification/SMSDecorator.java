package structural.decorator.notification;

public class SMSDecorator extends NotificationDecorator{

    public SMSDecorator(Notification wrapped) {
        super(wrapped);
    }

    @Override
    public void send(String message){
        super.send(message);
        System.out.println("Sending SMS: "+message);
    }
}
