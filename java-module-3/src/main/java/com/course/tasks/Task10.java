package com.course.tasks;

import java.util.Objects;

/**
 * UA: Моделює діапазон цілих чисел [from, to].
 * Поля: from (int, незмінне), to (int, незмінне).
 * Валідація: from <= to, інакше IllegalArgumentException. Сеттерів немає.
 * Методи: getFrom(), getTo(), contains(int n) — true якщо from <= n <= to,
 * length() = to - from.
 * Формат toString містить префікс "Range" та значення полів.
 * <p>
 * RU: Моделирует диапазон целых чисел [from, to].
 * Поля: from (int, неизменяемое), to (int, неизменяемое).
 * Валидация: from <= to, иначе IllegalArgumentException. Сеттеров нет.
 * Методы: getFrom(), getTo(), contains(int n) — true если from <= n <= to,
 * length() = to - from.
 * Формат toString содержит префикс "Range" и значения полей.
 */
public class Task10 {

    private final int from;
    private final int to;

    public Task10(int from, int to) {
        // TODO: реализуй
        if (from > to) {
            throw new IllegalArgumentException();
        }
        this.from = from;
        this.to = to;
    }

    public int getFrom() {
        // TODO: реализуй
        return from;
    }

    public int getTo() {
        // TODO: реализуй
        return to;
    }

    public boolean contains(int n) {
        // TODO: реализуй
        return n >= from && n <= to;
    }

    public int length() {
        // TODO: реализуй
        return to - from;
    }

    @Override
    public boolean equals(Object o) {
        // TODO: реализуй
        if (!(o instanceof Task10 task10)) return false;
        return this.from == task10.from && this.to == task10.to;
    }

    @Override
    public int hashCode() {
        // TODO: реализуй
        return Objects.hash(from, to);
    }

    @Override
    public String toString() {
        // TODO: реализуй
        return "Range " + from + " " + to;
    }
}
