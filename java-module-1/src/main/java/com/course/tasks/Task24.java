package com.course.tasks;

public class Task24 {
    /**
     * Возвращает число, у которого цифры идут в обратном порядке. Знак сохраняется.
     * Примеры: reverseNumber(123) == 321; reverseNumber(-450) == -54; reverseNumber(0) == 0.
     */
    public static int reverseNumber(int n) {
        boolean negative = n < 0;
        if (n < 0) {
            n = -n;
        }
        int result = 0;
        while (n > 0) {
            result = result * 10 + n % 10;
            n = n / 10;
        }
        if (negative) result = -result;
        return result;
    }
}