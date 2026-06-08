package behavioral.observer.e_commerce;

public class InvoiceService implements Observer{
    @Override
    public void update(String orderId) {
        System.out.println("Invoice generated for order "+orderId);
    }
}
