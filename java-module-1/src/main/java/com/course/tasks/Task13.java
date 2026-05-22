package com.course.tasks;

public class Task13 {

    /**
     * Возвращает true, если из сторон a, b, c можно построить треугольник:
     * все стороны &gt; 0 и сумма любых двух сторон больше третьей.
     * Примеры: isTriangle(3, 4, 5) == true; isTriangle(1, 1, 5) == false.
     */
    public static boolean isTriangle(int a, int b, int c) {
        return (a > 0 && b > 0 && c > 0) && (a + b > c && a + c > b && c + b > a);
    }
}
