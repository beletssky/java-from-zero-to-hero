package com.course.tasks;

import java.util.Objects;

/**
 * UA: Моделює коло.
 * Поле: radius (double, незмінне). Валідація: radius > 0, інакше IllegalArgumentException.
 * Сеттерів немає.
 * Методи: getRadius(), area() = Math.PI * radius * radius.
 * Формат toString містить префікс "Circle" та значення radius.
 * <p>
 * RU: Моделирует круг.
 * Поле: radius (double, неизменяемое). Валидация: radius > 0, иначе IllegalArgumentException.
 * Сеттеров нет.
 * Методы: getRadius(), area() = Math.PI * radius * radius.
 * Формат toString содержит префикс "Circle" и значение radius.
 */
public class Task05 {

    private final double radius;

    public Task05(double radius) {
        // TODO: реализуй
        if (radius <= 0) {
            throw new IllegalArgumentException();
        }
        this.radius = radius;
    }

    public double getRadius() {
        // TODO: реализуй
        return radius;
    }

    public double area() {
        // TODO: реализуй
        return Math.PI * radius * radius;
    }

    @Override
    public boolean equals(Object o) {
        // TODO: реализуй
        if (!(o instanceof Task05 task05)) return false;

        return this.radius == task05.radius;
    }

    @Override
    public int hashCode() {
        // TODO: реализуй
        return Objects.hash(radius);
    }

    @Override
    public String toString() {
        // TODO: реализуй
        return "Circle" + radius;
    }
}
