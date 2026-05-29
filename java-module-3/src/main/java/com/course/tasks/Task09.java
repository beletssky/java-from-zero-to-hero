package com.course.tasks;

import java.util.Objects;

/**
 * UA: Моделює грошову суму.
 * Поля: amount (long, у копійках, незмінне), currency (String, незмінне).
 * Валідація: currency — рівно 3 великі латинські літери (наприклад USD, EUR, UAH),
 * інакше IllegalArgumentException. Сеттерів немає.
 * Методи: getAmount(), getCurrency(), toMajor() = amount / 100.0.
 * Формат toString містить префікс "Money" та значення полів.
 * <p>
 * RU: Моделирует денежную сумму.
 * Поля: amount (long, в копейках, неизменяемое), currency (String, неизменяемое).
 * Валидация: currency — ровно 3 заглавные латинские буквы (например USD, EUR, UAH),
 * иначе IllegalArgumentException. Сеттеров нет.
 * Методы: getAmount(), getCurrency(), toMajor() = amount / 100.0.
 * Формат toString содержит префикс "Money" и значения полей.
 */
public class Task09 {

    private final long amount;
    private final String currency;

    public Task09(long amount, String currency) {
        // TODO: реализуй
        if (currency == null || !currency.matches("^[A-Z]{3}$")) {
            throw new IllegalArgumentException();
        }
        this.amount = amount;
        this.currency = currency;
    }

    public long getAmount() {
        // TODO: реализуй
        return amount;
    }

    public String getCurrency() {
        // TODO: реализуй
        return currency;
    }

    public double toMajor() {
        // TODO: реализуй
        return amount / 100.0;
    }

    @Override
    public boolean equals(Object o) {
        // TODO: реализуй
        if (!(o instanceof Task09 task09)) return false;
        return Objects.equals(this.currency, task09.currency)
                && this.amount == task09.amount;
    }

    @Override
    public int hashCode() {
        // TODO: реализуй
        return Objects.hash(amount, currency);
    }

    @Override
    public String toString() {
        // TODO: реализуй
        return "Money " + amount + " " + currency;
    }
}
