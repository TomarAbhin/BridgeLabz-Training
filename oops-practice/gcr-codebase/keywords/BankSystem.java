public class BankSystem {
    // Static variable shared by all accounts
    static String bankName = "Bank Of Baroda";
    static int totalAccounts = 0;

    // initialize instance variables
    String accountHolderName;
    final int accountNumber;     // final keyword so it cannot be changed
    double balance;

    // Constructor 
    BankSystem(String accountHolderName, int accountNumber, double balance) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        this.balance = balance;
        totalAccounts++;
    }

    static void getTotalAccounts() {   // static method to display total accounts created
        System.out.println("Total Accounts: " + totalAccounts);
    }

    // method to deposit money
    void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        }
    }

    // method to withdraw money 
    void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {   //check if sufficient balance exists
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance");
        }
    }

    // display account details using instanceof
    void display(Object obj) {
        if (obj instanceof BankSystem) {
            System.out.println("Bank Name: " + bankName);
            System.out.println("Account Holder: " + accountHolderName);
            System.out.println("Account Number: " + accountNumber);
            System.out.println("Balance: " + balance);
        }
    }
    public static void main(String[] args) {

        BankSystem acc1 = new BankSystem("Abhinav", 100025, 56905);   // creating a bank account object
        BankSystem.getTotalAccounts();
        acc1.display(acc1);
        // perform deposit and withdrawal
        acc1.deposit(10000);
        acc1.withdraw(15000);

        // display updated details
        acc1.display(acc1);
        System.out.println();

        
    }
}
