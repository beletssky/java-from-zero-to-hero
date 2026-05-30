package com.course.tasks;

import java.util.Objects;

/**
 * UA: Клас моделює двовимірний вектор (Vector2D).
 * <ul>
 *   <li>Поля: {@code x}, {@code y} — обидва {@code double}, незмінні (final).</li>
 *   <li>Методи: гетери {@link #getX()}, {@link #getY()};
 *       {@link #add(Task28)} повертає НОВИЙ вектор (покомпонентна сума);
 *       {@link #length()} = {@code Math.sqrt(x*x + y*y)}.</li>
 *   <li>equals/hashCode: за x + y.</li>
 *   <li>toString: префікс "Vector2D" зі значеннями полів.</li>
 *   <li>Приклад: {@code new Task28(3, 4).length()} -> 5.0.</li>
 * </ul>
 *
 * RU: Класс моделирует двумерный вектор (Vector2D).
 * <ul>
 *   <li>Поля: {@code x}, {@code y} — оба {@code double}, неизменяемые (final).</li>
 *   <li>Методы: геттеры {@link #getX()}, {@link #getY()};
 *       {@link #add(Task28)} возвращает НОВЫЙ вектор (покомпонентная сумма);
 *       {@link #length()} = {@code Math.sqrt(x*x + y*y)}.</li>
 *   <li>equals/hashCode: по x + y.</li>
 *   <li>toString: префикс "Vector2D" со значениями полей.</li>
 *   <li>Пример: {@code new Task28(3, 4).length()} -> 5.0.</li>
 * </ul>
 */
public class Task28 {

    private final double x;
    private final double y;

    public Task28(double x, double y) {
        // TODO: реализуй
        throw new UnsupportedOperationException("TODO: реализуй");
    }

    public double getX() {
        // TODO: реализуй
        throw new UnsupportedOperationException("TODO: реализуй");
    }

    public double getY() {
        // TODO: реализуй
        throw new UnsupportedOperationException("TODO: реализуй");
    }

    public Task28 add(Task28 other) {
        // TODO: реализуй
        throw new UnsupportedOperationException("TODO: реализуй");
    }

    public double length() {
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
