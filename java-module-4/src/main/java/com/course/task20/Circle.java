package com.course.task20;

/**
 * Круг.
 * Вычисляет площадь по формуле PI * r * r.
 */
public class Circle extends Shape {

    private double radius;

    public Circle(double radius) {
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
