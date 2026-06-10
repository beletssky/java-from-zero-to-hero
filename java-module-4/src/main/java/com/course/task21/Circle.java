package com.course.task21;

/**
 * Круг — фигура с радиусом.
 */
public class Circle extends Shape {
    private double radius;

    public Circle(String color, double radius) {
        super(color);
        // TODO: реализуй
        this.radius = radius;
    }

    public double getRadius() {
        // TODO: реализуй
        return radius;
    }

    @Override
    public double area() {
        // TODO: реализуй
        return Math.PI * radius * radius;
    }
}
