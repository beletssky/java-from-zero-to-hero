package com.course.task37;

/**
 * Круг с цветом и радиусом.
 * Реализует Drawable и Resizable.
 */
public class Circle extends Shape implements Drawable, Resizable {
    private double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }

    @Override
    public String draw() {
        return "drawing circle r=" + radius;
    }

    @Override
    public void resize(double k) {
        this.radius = this.radius * k;
    }

    @Override
    public String describe() {
        return "Circle color=" + getColor() + " r=" + radius;
    }
}
