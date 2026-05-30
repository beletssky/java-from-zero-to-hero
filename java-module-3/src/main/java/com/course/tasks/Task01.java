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
        if (o == null){
            return false;
        }

        if(!(o instanceof Task01)) {
            return false;
        }

        if(this == o) {
            return true;
        }

        boolean isFirstParamSame = x == ((Task01) o).getX();
        boolean isSecondParamSame = y == ((Task01) o).getY();

        return isFirstParamSame && isSecondParamSame;
    }

    @Override
    public int hashCode() {
        return this.x * 25 + this.y * 13;
    }

    @Override
    public String toString() {
        return "Point{x=" + x + ", y=" + y + "}";
    }
}