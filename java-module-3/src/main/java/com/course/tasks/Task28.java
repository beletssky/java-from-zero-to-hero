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
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public Task28 add(Task28 other) {
        return new Task28(this.x + other.x, this.y + other.y);
    }

    public double length() {
        return Math.sqrt(x * x + y * y);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null) {
            return false;
        }
        Task28 that = (Task28) o;
        return this.x == that.x && this.y == that.y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }

    @Override
    public String toString() {
        return "Vector2D{x =" + x + ", y=" + y + "}";
    }
}
