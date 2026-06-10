package com.course.task20;

/**
 * Квадрат.
 * Вычисляет площадь как side * side.
 */
public class Square extends Shape {

    private double side;

    public Square(double side) {
        // TODO: реализуй
        this.side = side;
    }

    public double getSide() {
        // TODO: реализуй
        return side;
    }

    @Override
    public double area() {
        // TODO: реализуй
        return side * side;
    }
}
