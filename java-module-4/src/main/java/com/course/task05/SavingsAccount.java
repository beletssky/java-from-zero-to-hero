package com.course.task05;

/**
 * Сберегательный счёт — подкласс Account.
 * Начисляет проценты на остаток.
 */
public class SavingsAccount extends Account {

    private double interestRate;

    public SavingsAccount(long initialBalance, double interestRate) {
        super(initialBalance);
        this.interestRate  = interestRate;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void addInterest() {
        long interest = (long) (getBalance() * interestRate);
        deposit(interest);
    }
}
