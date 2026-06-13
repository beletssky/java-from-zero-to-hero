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
        if (currency == null || currency.length() != 3) {
            throw new IllegalArgumentException("");
        }
        for (int i = 0; i < currency.length(); i++) {
            if (!Character.isUpperCase(currency.charAt(i))) {
                throw new IllegalArgumentException("");
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
        if (this== o) {
            return true;
        }
        if (o == null) {
            return false;
        }
        Task09 that = (Task09) o;
        return this.amount == that.amount && this.currency.equals(that.currency);
    }

    @Override
    public int hashCode() {
        return Objects.hash(amount, currency);
    }

    @Override
    public String toString() {
            return "Money{amount=" + amount + ", currency=" + currency + "}";
    }
}
