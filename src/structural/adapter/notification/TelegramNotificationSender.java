package structural.adapter.notification;

public class TelegramNotificationSender implements NotificationSender{
    // Injection of adaptee (TelegramAPI)

    private TelegramAPI telegramAPI;

    public TelegramNotificationSender(TelegramAPI telegramAPI) {
        this.telegramAPI = telegramAPI;
    }

    @Override
    public void send(String message) {
        telegramAPI.sendText(message);
    }
}
