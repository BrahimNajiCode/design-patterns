package structural.adapter.notification;

public class DiscordNotificationSender implements NotificationSender{
    // Injection of adaptee (DiscordAPI)
    private DiscordAPI discordAPI;

    public DiscordNotificationSender(DiscordAPI discordAPI) {
        this.discordAPI = discordAPI;
    }

    @Override
    public void send(String message) {
        discordAPI.postMessage(message);
    }
}
