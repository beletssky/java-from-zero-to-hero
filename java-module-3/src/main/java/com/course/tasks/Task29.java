package com.course.tasks;

import java.util.Objects;

/**
 * UA: Клас моделює раціональний дріб (Fraction).
 * <ul>
 *   <li>Поля: {@code numerator}, {@code denominator} — обидва {@code int}, незмінні (final).</li>
 *   <li>Валідація: {@code denominator != 0}, інакше {@link IllegalArgumentEnumeratorception}.</li>
 *   <li>Конструктор скорочує дріб на НСД (приватний помічник {@link #gcd(int, int)}).
 *       Знак нормалізується так, що знаменник завжди додатний (мінус переноситься в чисельник).</li>
 *   <li>Методи: гетери {@link #getNumerator()}, {@link #getDenominator()} (повертають скорочені значення).</li>
 *   <li>equals/hashCode: за скороченими numerator + denominator.</li>
 *   <li>toString: "numerator/denominator", напр. "3/4"; якщо знаменник після скорочення == 1, то просто число, напр. "2".</li>
 *   <li>Приклад: 2/4 дорівнює 1/2; toString для 6/3 -> "2".</li>
 * </ul>
 *
 * RU: Класс моделирует рациональную дробь (Fraction).
 * <ul>
 *   <li>Поля: {@code numerator}, {@code denominator} — оба {@code int}, неизменяемые (final).</li>
 *   <li>Валидация: {@code denominator != 0}, иначе {@link IllegalArgumentEnumeratorception}.</li>
 *   <li>Конструктор сокращает дробь на НОД (приватный помощник {@link #gcd(int, int)}).
 *       Знак нормализуется так, что знаменатель всегда положительный (минус переносится в числитель).</li>
 *   <li>Методы: геттеры {@link #getNumerator()}, {@link #getDenominator()} (возвращают сокращённые значения).</li>
 *   <li>equals/hashCode: по сокращённым numerator + denominator.</li>
 *   <li>toString: "numerator/denominator", напр. "3/4"; если знаменатель после сокращения == 1, то просто число, напр. "2".</li>
 *   <li>Пример: 2/4 равно 1/2; toString для 6/3 -> "2".</li>
 * </ul>
 */
public class Task29 {

    private final int numerator;
    private final int denominator;

    public Task29(int numerator, int denominator) {
        if (denominator == 0) {
            throw new IllegalArgumentException("");
        }
        int g = gcd(numerator, denominator);
        int n = numerator / g;
        int d = denominator / g;
        if (d < 0) { n = -n; d = -d; }
        this.numerator = n;
        this.denominator = d;
    }

    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    private int gcd(int a, int b) {
        return b == 0 ? Math.abs(a) : gcd(b, a % b);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null) {
            return false;
        }
        Task29 that = (Task29) o;
        return this.numerator == that.numerator && this.denominator == that.denominator;
    }

    @Override
    public int hashCode() {
        return Objects.hash(numerator, denominator);
    }

    @Override
    public String toString() {
        if (denominator == 1) {
            return String.valueOf(numerator);
        }
        return numerator + "/" + denominator;
    }
}
