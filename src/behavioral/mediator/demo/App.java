package behavioral.mediator.demo;

public class App {
    public static void main(String[] args) {
        ChatRoom chatRoom = new ChatRoomImpl();
        User user1 = new User(1, "KIZ4RUU", chatRoom);
        User user2 = new User(2, "SNOW", chatRoom);
        User user3 = new User(3, "DWIDA", chatRoom);

        chatRoom.addUser(user1);
        chatRoom.addUser(user2);
        chatRoom.addUser(user3);

        user1.sendMessage("Hello Guys");
    }
}
