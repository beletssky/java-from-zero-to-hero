package com.course.task04;

/**
 * Прямоугольник — подкласс Shape.
 * Считает площадь как произведение ширины на высоту.
 */
public class Rectangle extends Shape {

    private double width;
    private double height;

    public Rectangle(String color, double width, double height) {
        super(color);
        // TODO: реализуй
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        // TODO: реализуй
        return this.width;
    }

    public double getHeight() {
        // TODO: реализуй
        return this.height;
    }

    @Override
    public double area() {
        // TODO: реализуй
        return width * height;
    }
}
