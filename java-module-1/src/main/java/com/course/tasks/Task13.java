package com.course.tasks;

public class Task13 {

    /**
     * Возвращает true, если из сторон a, b, c можно построить треугольник:
     * все стороны &gt; 0 и сумма любых двух сторон больше третьей.
     * Примеры: isTriangle(3, 4, 5) == true; isTriangle(1, 1, 5) == false.
     */
    public static boolean isTriangle(int a, int b, int c) {
        // TODO: реализуй
        // Made myself
        // return a > 0 && b > 0 && c > 0 && a + b > c && a + c > b && b + c > a;
        // Ruslan shouted
        boolean abValid = a + b > c;
        boolean acValid = a + c > b;
        boolean bcValid = b + c > a;
        boolean isPositiveSides = a > 0 && b > 0 && c > 0;
        return isPositiveSides && abValid && acValid && bcValid;
    }
}
