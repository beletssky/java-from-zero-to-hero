package com.course.tasks;

import java.util.Objects;

/**
 * UA: Клас моделює раціональний дріб (Fraction).
 * <ul>
 *   <li>Поля: {@code numerator}, {@code denominator} — обидва {@code int}, незмінні (final).</li>
 *   <li>Валідація: {@code denominator != 0}, інакше {@link IllegalArgumentException}.</li>
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
 *   <li>Валидация: {@code denominator != 0}, иначе {@link IllegalArgumentException}.</li>
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
        // TODO: реализуй
        throw new UnsupportedOperationException("TODO: реализуй");
    }

    public int getNumerator() {
        // TODO: реализуй
        throw new UnsupportedOperationException("TODO: реализуй");
    }

    public int getDenominator() {
        // TODO: реализуй
        throw new UnsupportedOperationException("TODO: реализуй");
    }

    private int gcd(int a, int b) {
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
