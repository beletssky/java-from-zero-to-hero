package com.course.task37;

/**
 * Круг с цветом и радиусом.
 * Реализует Drawable и Resizable.
 */
public class Circle extends Shape implements Drawable, Resizable {
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

    @Override
    public String draw() {
        // TODO: реализуй
        return "drawing circle r=" + radius;
    }

    @Override
    public void resize(double k) {
        // TODO: реализуй
        radius *= k;
    }

    @Override
    public String describe() {
        // TODO: реализуй
        return "Circle color=" + color + " r=" + radius;
    }
}
