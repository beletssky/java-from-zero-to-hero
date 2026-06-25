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
        if (r < 0 || r > 255) {
            throw new IllegalArgumentException("NOOOOO");
        }
        if (g < 0 || g > 255) {
            throw new IllegalArgumentException("NOOOOO");
        }
        if (b < 0 || b > 255) {
            throw new IllegalArgumentException("NOOOOO");
        }
        this.r = r;
        this.g = g;
        this.b = b;
    }

    public int getR() {
        return r;
    }

    public int getG() {
        return g;
    }

    public int getB() {
        return b;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Task02 task02 = (Task02) o;
        return r == task02.r && g == task02.g && b == task02.b;
    }

    @Override
    public int hashCode() {
        return Objects.hash(r, g, b);
    }

    @Override
    public String toString() {
        return "Color{" + r + "," + g + "," + b + "}";
    }
}
