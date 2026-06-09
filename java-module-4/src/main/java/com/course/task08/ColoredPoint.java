package com.course.task08;

/**
 * Цветная точка — подкласс Point.
 * Дополнительно содержит цвет.
 */
public class ColoredPoint extends Point {

    private String color;

    public ColoredPoint(int x, int y, String color) {
        super(x, y);
        // TODO: реализуй
        this.color = color;
    }

    public String getColor() {
        // TODO: реализуй
        return color;
    }

    @Override
    public String toString() {
        // TODO: реализуй
        return "(" + x + "," + y + "," + color + ")";
    }
}
