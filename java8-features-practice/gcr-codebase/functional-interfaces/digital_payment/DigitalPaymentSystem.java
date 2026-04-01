package digital_payment;

public class DigitalPaymentSystem {

    public static void main(String[] args) {

        Payment upi = new UpiPayment();
        Payment card = new CreditCardPayment();
        Payment wallet = new WalletPayment();

        upi.pay(500);
        card.pay(1200);
        wallet.pay(300);
    }
}
