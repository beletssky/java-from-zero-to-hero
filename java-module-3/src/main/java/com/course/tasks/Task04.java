package com.course.tasks;

import java.util.Objects;

/**
 * UA: Моделює прямокутник.
 * Поля: width (double, незмінне), height (double, незмінне).
 * Валідація: обидва значення мають бути > 0, інакше IllegalArgumentException. Сеттерів немає.
 * Методи: getWidth(), getHeight(), area() = width * height.
 * Формат toString містить префікс "Rectangle" та значення полів.
 * <p>
 * RU: Моделирует прямоугольник.
 * Поля: width (double, неизменяемое), height (double, неизменяемое).
 * Валидация: оба значения должны быть > 0, иначе IllegalArgumentException. Сеттеров нет.
 * Методы: getWidth(), getHeight(), area() = width * height.
 * Формат toString содержит префикс "Rectangle" и значения полей.
 */
public class Task04 {

    private final double width;
    private final double height;

    public Task04(double width, double height) {
        // TODO: реализуй
        validateSide(width);
        validateSide(height);
        this.width = width;
        this.height = height;
    }

    private void validateSide(double d) {
        if (d <= 0) {
            throw new IllegalArgumentException();
        }
    }

    public double getWidth() {
        // TODO: реализуй
        return width;
    }

    public double getHeight() {
        // TODO: реализуй
        return height;
    }

    public double area() {
        // TODO: реализуй
        return width * height;
    }

    @Override
    public boolean equals(Object o) {
        // TODO: реализуй
        if (!(o instanceof Task04 task04)) return false;

        return this.width == task04.width && this.height == task04.height;
    }

    @Override
    public int hashCode() {
        // TODO: реализуй
        return Objects.hash(width, height);
    }

    @Override
    public String toString() {
        // TODO: реализуй
        return "Rectangle" + width + " " + height;
    }
}
