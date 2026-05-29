package com.course.tasks;

import java.util.Objects;

/**
 * UA: Моделює колір у форматі RGB.
 * Поля: r, g, b (int, незмінні). Кожне значення має бути в діапазоні 0..255,
 * інакше конструктор кидає IllegalArgumentException.
 * Методи: getR(), getG(), getB().
 * Формат toString: "Color{r=255, g=128, b=0}".
 * <p>
 * RU: Моделирует цвет в формате RGB.
 * Поля: r, g, b (int, неизменяемые). Каждое значение должно быть в диапазоне 0..255,
 * иначе конструктор бросает IllegalArgumentException.
 * Методы: getR(), getG(), getB().
 * Формат toString: "Color{r=255, g=128, b=0}".
 */
public class Task02 {

    private final int r;
    private final int g;
    private final int b;

    public Task02(int r, int g, int b) {
        // TODO: реализуй
        validateColourValue(r);
        validateColourValue(g);
        validateColourValue(b);
        this.r = r;
        this.g = g;
        this.b = b;
    }

    private void validateColourValue(int colour) {
        if (colour < 0 || colour > 255) {
            throw new IllegalArgumentException();
        }
    }

    public int getR() {
        // TODO: реализуй
        return r;
    }

    public int getG() {
        // TODO: реализуй
        return g;
    }

    public int getB() {
        // TODO: реализуй
        return b;
    }

    @Override
    public boolean equals(Object o) {
        // TODO: реализуй
        if (!(o instanceof Task02 task02)) return false;
        return this.r == task02.r &&
                this.g == task02.g &&
                this.b == task02.b;
    }

    @Override
    public int hashCode() {
        // TODO: реализуй
        return Objects.hash(r, g, b);
    }

    @Override
    public String toString() {
        // TODO: реализуй
        return "Color{r=" + r + ", g=" + g + ", b=" + b + "}";
    }
}
