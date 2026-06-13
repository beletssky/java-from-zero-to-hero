package com.course.task05;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Task05Test {

    @Test
    void accountConstructorSetsInitialBalance() {
        Account a = new Account(10_000L);
        assertEquals(10_000L, a.getBalance());
    }

    @Test
    void depositIncreasesBalance() {
        Account a = new Account(1_000L);
        a.deposit(500L);
        assertEquals(1_500L, a.getBalance());
    }

    @Test
    void withdrawDecreasesBalance() {
        Account a = new Account(1_000L);
        a.withdraw(400L);
        assertEquals(600L, a.getBalance());
    }

    @Test
    void savingsAccountConstructorSetsFields() {
        SavingsAccount s = new SavingsAccount(10_000L, 0.05);
        assertEquals(10_000L, s.getBalance());
        assertEquals(0.05, s.getInterestRate(), 1e-9);
    }

    @Test
    void addInterestAtTenPercentOnThousand() {
        SavingsAccount s = new SavingsAccount(1_000L, 0.10);
        s.addInterest();
        assertEquals(1_100L, s.getBalance());
    }

    @Test
    void polymorphicDepositOnSavingsAccount() {
        Account a = new SavingsAccount(1_000L, 0.05);
        a.deposit(500L);
        assertEquals(1_500L, a.getBalance());
    }
}
