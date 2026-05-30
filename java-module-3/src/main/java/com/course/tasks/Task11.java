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
        throw new UnsupportedOperationException("TODO: реализуй");
    }

    public String getOwner() {
        // TODO: реализуй
        throw new UnsupportedOperationException("TODO: реализуй");
    }

    public long getBalance() {
        // TODO: реализуй
        throw new UnsupportedOperationException("TODO: реализуй");
    }

    public void deposit(long amount) {
        // TODO: реализуй
        throw new UnsupportedOperationException("TODO: реализуй");
    }

    public void withdraw(long amount) {
        // TODO: реализуй
        throw new UnsupportedOperationException("TODO: реализуй");
    }

    @Override
    public boolean equals(Object o) {
        // TODO: реализуй
        throw new UnsupportedOperationException("TODO: реализуй");
    }

    @Override
    public int hashCode() {
        // TODO: реализуй
        throw new UnsupportedOperationException("TODO: реализуй");
    }

    @Override
    public String toString() {
        // TODO: реализуй
        throw new UnsupportedOperationException("TODO: реализуй");
    }
}
