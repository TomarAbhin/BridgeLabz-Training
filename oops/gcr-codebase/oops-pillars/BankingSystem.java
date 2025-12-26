class BankAccount {   //create superclass
    int accountNumber;
    double balance;
    BankAccount(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    void displayDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
    }
}

class SavingsAccount extends BankAccount {   //savings account  subclass
    double interestRate;
    SavingsAccount(int accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }
    void displayAccountType() {
        System.out.println("Account Type: Savings Account");
    }
}

class CheckingAccount extends BankAccount {  //checking account subclass
    double withdrawalLimit;
    CheckingAccount(int accountNumber, double balance, double withdrawalLimit) {
        super(accountNumber, balance);
        this.withdrawalLimit = withdrawalLimit;
    }
    void displayAccountType() {
        System.out.println("Account Type: Checking Account");
    }
}

class FixedDepositAccount extends BankAccount {  //fd account subclass
    int yearsTenure;
    FixedDepositAccount(int accountNumber, double balance, int yearsTenure) {
        super(accountNumber, balance);
        this.yearsTenure = yearsTenure;
    }
    void displayAccountType() {
        System.out.println("Account Type: Fixed Deposit Account");
    }
}

public class BankingSystem  {
    public static void main(String[] args) {
        BankAccount a1 = new SavingsAccount(1001, 55000, 4.5);
        BankAccount a2 = new CheckingAccount(1002, 100002, 25000);
        BankAccount a3 = new FixedDepositAccount(1003, 100000, 10);
        a1.displayDetails();
        ((SavingsAccount) a1).displayAccountType();

        a2.displayDetails();
        ((CheckingAccount) a2).displayAccountType();

        a3.displayDetails();
        ((FixedDepositAccount) a3).displayAccountType();
    }
}
