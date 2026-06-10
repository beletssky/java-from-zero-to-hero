package com.course.task37;

/**
 * Абстрактная геометрическая фигура с цветом.
 * Контракт: каждая фигура умеет считать площадь.
 */
public abstract class Shape {
    protected String color;

    public Shape(String color) {
        // TODO: реализуй
        throw new UnsupportedOperationException("TODO: реализуй");
    }

    public String getColor() {
        // TODO: реализуй
        throw new UnsupportedOperationException("TODO: реализуй");
    }

    public abstract double area();
}
