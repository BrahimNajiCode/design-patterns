package structural.adapter.notification;

public class SlackAPI {

    public void publish(String message){
        System.out.println("Slack API: " + message);
    }
}
