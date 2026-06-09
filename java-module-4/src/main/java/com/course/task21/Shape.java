package com.course.task21;

/**
 * Абстрактная геометрическая фигура.
 * Хранит цвет и определяет контракт вычисления площади.
 */
public abstract class Shape {
    protected String color;

    public Shape(String color) {
        // TODO: реализуй
        this.color = color;
    }

    public String getColor() {
        // TODO: реализуй
        return color;
    }

    public abstract double area();
}
