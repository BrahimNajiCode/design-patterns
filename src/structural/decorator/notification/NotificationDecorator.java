package structural.decorator.notification;

public abstract class NotificationDecorator implements Notification {
    protected Notification wrapped;

    public NotificationDecorator(Notification wrapped){
        this.wrapped = wrapped;
    }

    @Override
    public void send(String message){
        wrapped.send(message);
    }
}
