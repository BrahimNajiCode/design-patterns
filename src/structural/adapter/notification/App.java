package structural.adapter.notification;

public class App {
    public static void main(String[] args) {
        // Discord
        DiscordNotificationSender discordNotificationSender = new DiscordNotificationSender(new DiscordAPI());
        discordNotificationSender.send("Hello!");

        // Slack

        SlackNotificationSender slackNotificationSender = new SlackNotificationSender(new SlackAPI());
        slackNotificationSender.send("Hi!");
    }
}
