package digital_payment;

public class UpiPayment implements Payment {

    @Override
    public void pay(double amount) {
        System.out.println("Paid Rs" + amount + " using UPI");
    }
}

