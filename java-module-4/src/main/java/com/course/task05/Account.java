package com.course.task05;

/**
 * Банковский счёт.
 * Поддерживает пополнение и снятие средств с валидацией.
 */
public class Account {

    protected long balance;

    public Account(long initialBalance) {
        // TODO: реализуй
        this.balance = initialBalance;
    }

    public void deposit(long amount) {
        // TODO: реализуй
        balance += amount;
    }

    public void withdraw(long amount) {
        // TODO: реализуй
        balance -= amount;
    }

    public long getBalance() {
        // TODO: реализуй
        return balance;
    }
}
