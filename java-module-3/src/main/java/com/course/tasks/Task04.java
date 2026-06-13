package com.course.tasks;

import java.util.Objects;
/**
 * UA: Моделює прямокутник.
 *     Поля: width (double, незмінне), height (double, незмінне).
 *     Валідація: обидва значення мають бути > 0, інакше IllegalArgumentException. Сеттерів немає.
 *     Методи: getWidth(), getHeight(), area() = width * height.
 *     Формат toString містить префікс "Rectangle" та значення полів.
 *
 * RU: Моделирует прямоугольник.
 *     Поля: width (double, неизменяемое), height (double, неизменяемое).
 *     Валидация: оба значения должны быть > 0, иначе IllegalArgumentException. Сеттеров нет.
 *     Методы: getWidth(), getHeight(), area() = width * height.
 *     Формат toString содержит префикс "Rectangle" и значения полей.
 */
public class Task04 {

    private final double width;
    private final double height;

    public Task04(double width, double height) {
        if (width <= 0) {
            throw new IllegalArgumentException("");
        }
        if (height <= 0) {
            throw new IllegalArgumentException("");
        }
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public double area() {
        return width * height;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null) {
            return false;
        }
        Task04 that = (Task04) o;
        return this.width == that.width && this.height == that.height;
    }

    @Override
    public int hashCode() {
        return Objects.hash(width, height);
    }

    @Override
    public String toString() {
        return "Rectangle{width=" + width + ", height=" + height + "}";
    }
}