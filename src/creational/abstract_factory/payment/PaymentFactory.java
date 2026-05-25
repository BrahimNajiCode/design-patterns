package creational.abstract_factory.payment;

public interface PaymentFactory {
    PaymentProcessor createPaymentProcessor();
    InvoiceGenerator createInvoiceGenerator();
}
