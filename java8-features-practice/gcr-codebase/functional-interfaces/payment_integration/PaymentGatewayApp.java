package payment_integration;

public class PaymentGatewayApp {

    public static void main(String[] args) {

        PaymentProcessor upi = new UpiPaymentProcessor();
        PaymentProcessor card = new CreditCardPaymentProcessor();

        upi.processPayment(1000);
        upi.refund(200);

        card.processPayment(5000);
        card.refund(1000);
    }
}

