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
 * <p>
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
        this.x = x;
        this.y = y;
    }

    public double getX() {
        // TODO: реализуй
        return x;
    }

    public double getY() {
        // TODO: реализуй
        return y;
    }

    public Task28 add(Task28 other) {
        // TODO: реализуй
        return new Task28((x + other.x), (y + other.y));
    }

    public double length() {
        // TODO: реализуй
        return Math.sqrt(x * x + y * y);
    }

    @Override
    public boolean equals(Object o) {
        // TODO: реализуй
        if (!(o instanceof Task28 task28)) return false;
        return this.x == task28.x && this.y == task28.y;
    }

    @Override
    public int hashCode() {
        // TODO: реализуй
        return Objects.hash(x, y);
    }

    @Override
    public String toString() {
        // TODO: реализуй
        return "Vector2D" + x + y;
    }
}
