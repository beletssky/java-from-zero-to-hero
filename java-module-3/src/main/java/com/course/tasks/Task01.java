package com.course.tasks;

import java.util.Objects;

/**
 * UA: Моделює точку на площині з цілочисельними координатами.
 * Поля: x (int, незмінне), y (int, незмінне). Сеттерів немає, валідації немає.
 * Методи: getX(), getY().
 * Формат toString: "Point{x=3, y=4}".
 * Приклад: new Task01(3, 4) -> "Point{x=3, y=4}".
 * <p>
 * RU: Моделирует точку на плоскости с целочисленными координатами.
 * Поля: x (int, неизменяемое), y (int, неизменяемое). Сеттеров нет, валидации нет.
 * Методы: getX(), getY().
 * Формат toString: "Point{x=3, y=4}".
 * Пример: new Task01(3, 4) -> "Point{x=3, y=4}".
 */
public class Task01 {

    private final int x;
    private final int y;

    public Task01(int x, int y) {
        // TODO: реализуй
        this.x = x;
        this.y = y;
    }

    public int getX() {
        // TODO: реализуй
        return x;
    }

    public int getY() {
        // TODO: реализуй
        return y;
    }

    public final boolean equals(Object object) {
        if (!(object instanceof Task01 task01)) return false;

        return this.x == task01.x && this.y == task01.y;
    }

    public int hashCode() {
        return Objects.hash(x, y);
    }

    @Override
    public String toString() {
        // TODO: реализуй
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
