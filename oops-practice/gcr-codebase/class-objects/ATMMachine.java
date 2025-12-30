public class ATMMachine {

    static class BankAccount {
        //  initializing instance variables
        String accountHolderName;
        long accountNumber;
        double balance;
        BankAccount(String accountHolderName, long accountNumber, double balance) {           // Constructor to initialize bank account
            this.accountHolderName = accountHolderName;
            this.accountNumber = accountNumber;
            this.balance = balance;
        }

        void deposit(double amount) {  // method to deposit money
            balance = balance + amount;
            System.out.println("Amount Deposited: " + amount);
        }
        void withdraw(double amount) {   // method to withdraw money
            if (amount <= balance) {
                balance = balance - amount;
                System.out.println("Amount Withdrawn: " + amount);
            } else {
                System.out.println("Insufficient Balance");
            }
        }
        void display() {
            System.out.println("Current Balance: " + balance);
        }
    }
    public static void main(String[] args) {
        BankAccount account = new BankAccount("Abhinav Tomar", 78829308L, 6579.0);   // create bankaccount object
        account.display();
        account.deposit(2000.0);
        account.withdraw(5000.0);
        account.display();
    }
}

