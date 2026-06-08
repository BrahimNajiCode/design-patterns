package behavioral.observer.e_commerce;

public class InventoryService implements Observer{
    @Override
    public void update(String orderId) {
        System.out.println("Inventory updated for order "+orderId);
    }
}
