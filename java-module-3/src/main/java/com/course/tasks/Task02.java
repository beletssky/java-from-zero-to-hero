package com.course.tasks;

import java.util.Objects;

/**
 * UA: Моделює колір у форматі RGB.
 *     Поля: r, g, b (int, незмінні). Кожне значення має бути в діапазоні 0..255,
 *     інакше конструктор кидає IllegalArgumentException.
 *     Методи: getR(), getG(), getB().
 *     Формат toString: "Color{r=255, g=128, b=0}".
 *
 * RU: Моделирует цвет в формате RGB.
 *     Поля: r, g, b (int, неизменяемые). Каждое значение должно быть в диапазоне 0..255,
 *     иначе конструктор бросает IllegalArgumentException.
 *     Методы: getR(), getG(), getB().
 *     Формат toString: "Color{r=255, g=128, b=0}".
 */
public class Task02 {

    private final int r;
    private final int g;
    private final int b;

    public Task02(int r, int g, int b) {
        if (r < 0 || r > 255){
            throw new IllegalArgumentException();
        }
        if (g < 0 || g > 255){
            throw new IllegalArgumentException();
        }
        if (b < 0 || b > 255){
            throw new IllegalArgumentException();
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
        if (o == null){
            return false;
        }

        if(!(o instanceof Task02)) {
            return false;
        }

        if(this == o) {
            return true;
        }

        boolean isFirstParamSame = r == ((Task02) o).getR();
        boolean isSecondParamSame = g == ((Task02) o).getG();
        boolean isThirdParamSame = b == ((Task02) o).getB();


        return isFirstParamSame && isSecondParamSame && isThirdParamSame;
    }

    @Override
    public int hashCode() {
        return r * 3 + g * 5 + b *7;
    }

    @Override
    public String toString() {
        return "Color{r=" + r + ", g=" + g + ", b=" + b;
    }
}
