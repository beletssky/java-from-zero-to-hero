package com.course.task21;

/**
 * Прямоугольник — фигура с шириной и высотой.
 */
public class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(String color, double width, double height) {
        super(color);
        // TODO: реализуй
        this.height = height;
        this.width = width;
    }

    public double getWidth() {
        // TODO: реализуй
        return width;
    }

    public double getHeight() {
        // TODO: реализуй
        return height;
    }

    @Override
    public double area() {
        // TODO: реализуй
        return width * height;
    }
}
