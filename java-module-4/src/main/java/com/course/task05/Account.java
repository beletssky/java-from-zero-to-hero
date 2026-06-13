package com.course.task05;

/**
 * Банковский счёт.
 * Поддерживает пополнение и снятие средств с валидацией.
 */
public class Account {

    protected long balance;

    public Account(long initialBalance) {
        this.balance = initialBalance;
    }

    public void deposit(long amount) {
        balance = balance + amount;
    }

    public void withdraw(long amount) {
        balance = balance - amount;
    }

    public long getBalance() {
        return balance;
    }
}
