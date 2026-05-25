package creational.abstract_factory.payment;

public class PaypalInvoiceGenerator implements InvoiceGenerator{
    @Override
    public void generateInvoice() {
        System.out.println("PayPal invoice generated.");
    }
}
