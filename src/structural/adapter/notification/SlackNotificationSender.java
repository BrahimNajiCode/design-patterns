package structural.adapter.notification;

public class SlackNotificationSender implements NotificationSender{
    // Injection of adaptee (SlackAPI)
    private SlackAPI slackAPI;

    public SlackNotificationSender(SlackAPI slackAPI) {
        this.slackAPI = slackAPI;
    }

    @Override
    public void send(String message) {
        slackAPI.publish(message);
    }
}
