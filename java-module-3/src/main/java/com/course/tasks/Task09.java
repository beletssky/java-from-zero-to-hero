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

        if (currency == null || currency.length() != 3) {
            throw new IllegalArgumentException("NOOOOO");
        }
        for (int i = 0; i < currency.length(); i++) {
            char ch = currency.charAt(i);
            if (ch < 'A' || ch > 'Z') {
                throw new IllegalArgumentException("NOOOOO");
            }
        }
        this.amount = amount;
        this.currency = currency;
    }

    public long getAmount() {
        return amount;
    }

    public String getCurrency() {
        return currency;
    }

    public double toMajor() {
        return amount / 100.0;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Task09 task09 = (Task09) o;
        return currency.equals(task09.currency) && amount == task09.amount;
    }

    @Override
    public int hashCode() {
        return Objects.hash(amount, currency);
    }

    @Override
    public String toString() {
        return "Money{" + currency + "," + amount + "}";
    }
}
