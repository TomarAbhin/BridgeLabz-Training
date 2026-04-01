package com.example.demo;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
class BankingSystemTest {

    //testing deposit functionality
    @Test
    void testDeposit() {
        BankingSystem account = new BankingSystem(1000);
        account.deposit(500);
        assertEquals(1500, account.getBalance());
    }
    //testing withdraw functionality
    @Test
    void testWithdraw() {
        BankingSystem account = new BankingSystem(1000);
        account.withdraw(300);
        assertEquals(700, account.getBalance());
    }
    //testing insufficient balance scenario
    @Test
    void testWithdrawInsufficientFunds() {
        BankingSystem account = new BankingSystem(500);

        assertThrows(IllegalArgumentException.class, () -> {
            account.withdraw(1000);
        });
    }
}
