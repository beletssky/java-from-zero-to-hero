package com.course.tasks;

import java.util.Objects;
/**
 * UA: Моделює точку на площині з цілочисельними координатами.
 *     Поля: x (int, незмінне), y (int, незмінне). Сеттерів немає, валідації немає.
 *     Методи: getX(), getY().
 *     Формат toString: "Point{x=3, y=4}".
 *     Приклад: new Task01(3, 4) -> "Point{x=3, y=4}".
 *
 * RU: Моделирует точку на плоскости с целочисленными координатами.
 *     Поля: x (int, неизменяемое), y (int, неизменяемое). Сеттеров нет, валидации нет.
 *     Методы: getX(), getY().
 *     Формат toString: "Point{x=3, y=4}".
 *     Пример: new Task01(3, 4) -> "Point{x=3, y=4}".
 */
public class Task01 {

    private final int x;
    private final int y;

    public Task01(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null) {
            return false;
        }
        if (this.getClass() != o.getClass()) {
            return false;
        }
        Task01 that = (Task01) o;
        return this.x == that.x && this.y == that.y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }

    @Override
    public String toString() {
        return "Point{x=" + x + ", y=" + y + "}";
    }
}