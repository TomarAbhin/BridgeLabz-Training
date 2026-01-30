package payment_integration;

public class CreditCardPaymentProcessor implements PaymentProcessor {

    @Override
    public void processPayment(double amount) {
        System.out.println("Credit Card payment of ₹" + amount + " successful");
    }

    @Override
    public void refund(double amount) {
        System.out.println("Credit Card refund of ₹" + amount + " initiated");
    }
}

