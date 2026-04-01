package payment_integration;

public class UpiPaymentProcessor implements PaymentProcessor {

    @Override
    public void processPayment(double amount) {
        System.out.println("UPI payment of ₹" + amount + " successful");
    }
}


