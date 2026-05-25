package creational.abstract_factory.payment;

public class App {
    public static void main(String[] args) {
        String paymentMethod = "Paypal";
        PaymentFactory paymentFactory;
        if(paymentMethod.equals("Stripe")){
            paymentFactory = new StripeFactory();
        }else {
            paymentFactory = new PaypalFactory();
        }
        PaymentProcessor processor = paymentFactory.createPaymentProcessor();
        processor.pay(400);
        InvoiceGenerator invoiceGenerator = paymentFactory.createInvoiceGenerator();
        invoiceGenerator.generateInvoice();
    }
}
