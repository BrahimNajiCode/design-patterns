package creational.abstract_factory.payment;

public class StripeInvoiceGenerator implements InvoiceGenerator{
    @Override
    public void generateInvoice() {
        System.out.println("Stripe invoice generated.");
    }
}
