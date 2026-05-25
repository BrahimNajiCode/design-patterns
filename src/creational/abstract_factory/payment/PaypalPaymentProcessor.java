package creational.abstract_factory.payment;

public class PaypalPaymentProcessor implements PaymentProcessor{

    @Override
    public void pay(double amount) {
        System.out.println("PayPal payment: $"+amount);
    }
}
