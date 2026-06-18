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
        if (from > to) {
            throw new IllegalArgumentException("NOOOOO");
        }
        this.from = from;
        this.to = to;
    }

    public int getFrom() {
        return from;
    }

    public int getTo() {
        return to;
    }

    public boolean contains(int n) {
        return from <= n && n <= to;
    }

    public int length() {
        return to - from;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Task10 task10 = (Task10) o;
        return from == task10.from && to == task10.to;
    }

    @Override
    public int hashCode() {
        return Objects.hash(from, to);
    }

    @Override
    public String toString() {
        return "Range{" + from + "," + to + "}";
    }
}
