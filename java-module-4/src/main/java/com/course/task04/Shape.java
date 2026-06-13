package com.course.task04;

/**
 * Базовая геометрическая фигура.
 * Хранит цвет и площадь по умолчанию.
 */
public class Shape {

    protected String color;
    protected double area;

    public Shape(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public double area() {
        return area;
    }
}
