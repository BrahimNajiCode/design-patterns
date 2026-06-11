package behavioral.mediator.demo;

import java.util.ArrayList;
import java.util.List;

public class ChatRoomImpl implements ChatRoom {
    private List<User> users;
    public ChatRoomImpl(){users = new ArrayList<>();}

    @Override
    public void sendMessage(User sender, String message) {
        for(User user: users){
            if(!user.equals(sender)){
                user.receiveMessage(sender.getName() + ": " +message);
            }
        }
    }

    @Override
    public void addUser(User user) {
        users.add(user);
        System.out.println("✅ " + user.getName() + " joined the chat");
    }

    @Override
    public void removeUser(User user) {
        users.remove(user);
        System.out.println("❌ " + user.getName() + " left the chat");
    }
}
