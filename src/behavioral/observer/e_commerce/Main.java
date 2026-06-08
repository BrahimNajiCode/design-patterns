package behavioral.observer.e_commerce;

public class Main {
    public static void main(String[] args) {
        OrderSystem system = new OrderSystem();
        // These are like subscribers, when the system place
        // new Order, they get notified, as simple as it is
        system.attach(new EmailNotification());
        system.attach(new InventoryService());
        system.attach(new InventoryService());

        system.placeOrder("ORD-2001");
    }
}
