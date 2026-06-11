package behavioral.mediator.demo;

public interface ChatRoom {
    void sendMessage(User sender, String message);
    void addUser(User user);
    void removeUser(User user);
}
