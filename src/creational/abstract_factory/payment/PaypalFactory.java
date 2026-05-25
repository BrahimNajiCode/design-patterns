package creational.abstract_factory.payment;

public class PaypalFactory implements PaymentFactory {

    @Override
    public PaymentProcessor createPaymentProcessor() {
        return new PaypalPaymentProcessor();
    }

    @Override
    public InvoiceGenerator createInvoiceGenerator() {
        return new PaypalInvoiceGenerator();
    }
}
