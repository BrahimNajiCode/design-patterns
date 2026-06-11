package behavioral.mediator.demo;

import lombok.Getter;

@Getter
public class User {
    private Integer id;
    private String name;
    private ChatRoom chatRoom;

    public User(Integer id, String name, ChatRoom chatRoom) {
        this.id = id;
        this.name = name;
        this.chatRoom = chatRoom;
    }

    // Send message through mediator
    public void sendMessage(String message) {
        System.out.println(name + " sends: " + message);
        chatRoom.sendMessage(this, message);
    }

    // Receive message from mediator
    public void receiveMessage(String message) {
        System.out.println(name + " receives: " + message);
    }
}
