package com.course.tasks;

import java.util.Objects;
/**
 * UA: Моделює коло.
 *     Поле: radius (double, незмінне). Валідація: radius > 0, інакше IllegalArgumentException.
 *     Сеттерів немає.
 *     Методи: getRadius(), area() = Math.PI * radius * radius.
 *     Формат toString містить префікс "Circle" та значення radius.
 *
 * RU: Моделирует круг.
 *     Поле: radius (double, неизменяемое). Валидация: radius > 0, иначе IllegalArgumentException.
 *     Сеттеров нет.
 *     Методы: getRadius(), area() = Math.PI * radius * radius.
 *     Формат toString содержит префикс "Circle" и значение radius.
 */
public class Task05 {

    private final double radius;

    public Task05(double radius) {
        if (radius <= 0) {
            throw new IllegalArgumentException("");
        }
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double area() {
        return Math.PI * radius * radius;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null) {
            return false;
        }
        Task05 that = (Task05) o;
        return this.radius == that.radius;
    }

    @Override
    public int hashCode() {
        return Objects.hash(radius);
    }

    @Override
    public String toString() {
        return "Circle{radius=" + radius + "}";
    }
}