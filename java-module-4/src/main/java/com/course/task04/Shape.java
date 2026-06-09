package com.course.task04;

/**
 * Базовая геометрическая фигура.
 * Хранит цвет и площадь по умолчанию.
 */
public class Shape {

    protected String color;

    public Shape(String color) {
        // TODO: реализуй
        this.color = color;
    }

    public String getColor() {
        // TODO: реализуй
        return this.color;
    }

    public double area() {
        // TODO: реализуй
        return 0;
    }
}
