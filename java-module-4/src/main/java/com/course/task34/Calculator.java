package com.course.task34;

/**
 * Калькулятор, использующий константы из интерфейса MathConstants.
 */
public class Calculator implements MathConstants {
    public double circleArea(double r) {
        return PI * r * r;
    }

    public double exp() {
        return E;
    }
}
