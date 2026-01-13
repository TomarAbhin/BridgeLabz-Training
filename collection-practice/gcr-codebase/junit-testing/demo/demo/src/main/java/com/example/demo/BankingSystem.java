package com.example.demo;

public class BankingSystem {

    private double balance;

    //constructor to initialize balance
    public BankingSystem(double initialBalance) {
        this.balance = initialBalance;
    }

    //method to deposit money
    public void deposit(double amount) {
        if (amount>0) {
            balance=balance + amount;
        }
    }

    //method to withdraw money
    public void withdraw(double amount) {
        if (amount>balance) {
            throw new IllegalArgumentException("Insufficient funds");
        }
        balance=balance-amount;
    }

    //get the balance
    public double getBalance() {
        return balance;
    }
}
