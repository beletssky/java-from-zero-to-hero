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
        if (radius <= 0) {
            throw new IllegalArgumentException("NOOOOO");
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
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Task05 task05 = (Task05) o;
        return Double.compare(radius, task05.radius) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(radius);
    }

    @Override
    public String toString() {
        return "Circle{" + radius + "}";
    }
}
