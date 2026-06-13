package com.course.tasks;

import java.util.Objects;

/**
 * UA: Моделює грошову суму.
 *     Поля: amount (long, у копійках, незмінне), currency (String, незмінне).
 *     Валідація: currency — рівно 3 великі латинські літери (наприклад USD, EUR, UAH),
 *     інакше IllegalArgumentException. Сеттерів немає.
 *     Методи: getAmount(), getCurrency(), toMajor() = amount / 100.0.
 *     Формат toString містить префікс "Money" та значення полів.
 *
 * RU: Моделирует денежную сумму.
 *     Поля: amount (long, в копейках, неизменяемое), currency (String, неизменяемое).
 *     Валидация: currency — ровно 3 заглавные латинские буквы (например USD, EUR, UAH),
 *     иначе IllegalArgumentException. Сеттеров нет.
 *     Методы: getAmount(), getCurrency(), toMajor() = amount / 100.0.
 *     Формат toString содержит префикс "Money" и значения полей.
 */
public class Task09 {

    private final long amount;
    private final String currency;

    public Task09(long amount, String currency) {
        if (currency == null || !currency.matches("[A-Z]{3}")) {
            throw new IllegalArgumentException();
    }

    public long getAmount() {
        return amount;
    }

    public String getCurrency() {
        // TODO: реализуй
        throw new UnsupportedOperationException("TODO: реализуй");
    }

    public double toMajor() {
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
