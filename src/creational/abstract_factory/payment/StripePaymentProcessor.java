package creational.abstract_factory.payment;

public class StripePaymentProcessor implements PaymentProcessor{

    @Override
    public void pay(double amount) {
        System.out.println("Stripe payment: $"+amount);
    }
}
