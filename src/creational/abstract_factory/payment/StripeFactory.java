package creational.abstract_factory.payment;

public class StripeFactory implements PaymentFactory {

    @Override
    public PaymentProcessor createPaymentProcessor() {
        return new StripePaymentProcessor();
    }

    @Override
    public InvoiceGenerator createInvoiceGenerator() {
        return new StripeInvoiceGenerator();
    }
}
