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
    private final double area;

    public Task04(double width, double height) {
        if (width < 0.0 || height < 0.0){
            throw new IllegalArgumentException();
        }

        this.width = width;
        this.height = height;
        this.area = width * height;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public double area() {
        return area;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null){
            return false;
        }

        if(!(o instanceof Task04)) {
            return false;
        }

        boolean isFirstParamSame = height == ((Task04) o).getHeight();
        boolean isSecondParamSame = width == ((Task04) o).getWidth();

        return isFirstParamSame && isSecondParamSame;
    }

    @Override
    public int hashCode() {
        // TODO: реализуй
        throw new UnsupportedOperationException("TODO: реализуй");
    }

    @Override
    public String toString() {
        return "Rectangle" + height + width + area;
    }
}
