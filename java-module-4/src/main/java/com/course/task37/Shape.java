package com.course.task37;

/**
 * Абстрактная геометрическая фигура с цветом.
 * Контракт: каждая фигура умеет считать площадь.
 */
public abstract class Shape {
    protected String color;

    public Shape(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public abstract double area();
}
