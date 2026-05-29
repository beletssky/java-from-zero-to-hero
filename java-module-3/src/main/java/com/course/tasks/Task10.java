package com.course.tasks;

import java.util.Objects;

/**
 * UA: Моделює діапазон цілих чисел [from, to].
 *     Поля: from (int, незмінне), to (int, незмінне).
 *     Валідація: from <= to, інакше IllegalArgumentException. Сеттерів немає.
 *     Методи: getFrom(), getTo(), contains(int n) — true якщо from <= n <= to,
 *     length() = to - from.
 *     Формат toString містить префікс "Range" та значення полів.
 *
 * RU: Моделирует диапазон целых чисел [from, to].
 *     Поля: from (int, неизменяемое), to (int, неизменяемое).
 *     Валидация: from <= to, иначе IllegalArgumentException. Сеттеров нет.
 *     Методы: getFrom(), getTo(), contains(int n) — true если from <= n <= to,
 *     length() = to - from.
 *     Формат toString содержит префикс "Range" и значения полей.
 */
public class Task10 {

    private final int from;
    private final int to;

    public Task10(int from, int to) {
        // TODO: реализуй
        throw new UnsupportedOperationException("TODO: реализуй");
    }

    public int getFrom() {
        // TODO: реализуй
        throw new UnsupportedOperationException("TODO: реализуй");
    }

    public int getTo() {
        // TODO: реализуй
        throw new UnsupportedOperationException("TODO: реализуй");
    }

    public boolean contains(int n) {
        // TODO: реализуй
        throw new UnsupportedOperationException("TODO: реализуй");
    }

    public int length() {
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
