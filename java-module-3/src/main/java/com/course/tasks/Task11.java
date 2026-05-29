package com.course.tasks;

import java.util.Objects;

/**
 * UA: Модель банківського рахунку (BankAccount).
 * <p>Поля:
 * <ul>
 *   <li>{@code owner} — власник рахунку (незмінне, final).</li>
 *   <li>{@code balanceKopecks} — баланс у копійках (змінюється лише через методи, без прямого сетера).</li>
 * </ul>
 * Методи: {@code deposit(long)} — поповнення (amount &gt; 0, інакше IllegalArgumentException);
 * {@code withdraw(long)} — зняття (amount &gt; 0 і balance &ge; amount, інакше IllegalArgumentException);
 * {@code getBalance()} — повертає баланс.
 * toString має префікс "BankAccount" і містить власника та баланс.
 *
 * <p>RU: Модель банковского счёта (BankAccount).
 * <p>Поля:
 * <ul>
 *   <li>{@code owner} — владелец счёта (неизменяемое, final).</li>
 *   <li>{@code balanceKopecks} — баланс в копейках (изменяемое, меняется только через методы, без прямого сеттера).</li>
 * </ul>
 * Методы: {@code deposit(long)} — пополнение (amount &gt; 0, иначе IllegalArgumentException);
 * {@code withdraw(long)} — снятие (amount &gt; 0 и balance &ge; amount, иначе IllegalArgumentException);
 * {@code getBalance()} — возвращает баланс.
 * toString имеет префикс "BankAccount" и содержит владельца и баланс.
 *
 * <p>Приклад / Пример: new Task11("Ivan", 1000) -&gt; "BankAccount{owner='Ivan', balanceKopecks=1000}".
 */
public class Task11 {

    private final String owner;
    private long balanceKopecks;

    public Task11(String owner, long initialBalance) {
        // TODO: реализуй
        this.owner = owner;
        this.balanceKopecks = initialBalance;
    }

    public String getOwner() {
        // TODO: реализуй
        return owner;
    }

    public long getBalance() {
        // TODO: реализуй
        return balanceKopecks;
    }

    public long deposit(long amount) {
        // TODO: реализуй
        if (amount <= 0) {
            throw new IllegalArgumentException();
        }
        balanceKopecks += amount;
        return balanceKopecks;
    }

    public long withdraw(long amount) {
        // TODO: реализуй
        if (amount <= 0 || balanceKopecks < amount) {
            throw new IllegalArgumentException();
        }
        balanceKopecks -= amount;
        return balanceKopecks;
    }

    @Override
    public boolean equals(Object o) {
        // TODO: реализуй
        if (!(o instanceof Task11 task11)) return false;

        return Objects.equals(this.owner, task11.owner)
                && this.balanceKopecks == task11.balanceKopecks;
    }

    @Override
    public int hashCode() {
        // TODO: реализуй
        return Objects.hash(owner, balanceKopecks);
    }

    @Override
    public String toString() {
        // TODO: реализуй
        return "BankAccount " + owner + " " + balanceKopecks;
    }
}
