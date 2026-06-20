package com.course.task08;

/**
 * Точка на координатной плоскости.
 * Поддерживает сдвиг и строковое представление.
 */
public class Point {

    protected int x;
    protected int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void move(int dx, int dy) {
        this.x = this.x + dx;
        this.y = this.y + dy;
    }

    @Override
    public String toString() {
        return "(" + x + "," + y + ")";
    }
}
