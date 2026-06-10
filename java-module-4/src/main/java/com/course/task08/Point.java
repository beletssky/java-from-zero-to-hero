package com.course.task08;

/**
 * Точка на координатной плоскости.
 * Поддерживает сдвиг и строковое представление.
 */
public class Point {

    protected int x;
    protected int y;

    public Point(int x, int y) {
        // TODO: реализуй
        this.x = x;
        this.y = y;
    }

    public int getX() {
        // TODO: реализуй
        return x;
    }

    public int getY() {
        // TODO: реализуй
        return y;
    }

    public void move(int dx, int dy) {
        // TODO: реализуй
        x += dx;
        y += dy;
    }

    @Override
    public String toString() {
        // TODO: реализуй
        return "(" + x + "," + y + ")";
    }
}
