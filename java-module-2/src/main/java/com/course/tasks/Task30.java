package com.course.tasks;

public class Task30 {

    /**
     * Безопасное деление a/b.
     * Если a == null → 0. Если b == null или b == 0 →
     * ArithmeticException("invalid divisor").
     * Примеры: safeDivide(10, 2) == 5; safeDivide(null, 5) == 0;
     *          safeDivide(10, null) → throws; safeDivide(10, 0) → throws.
     */
    public static int safeDivide(Integer a, Integer b) {
        if (a == null) {
           return 0;
        }
        if (b == null || b == 0) {
            throw new ArithmeticException("invalid divisor");
        }
        return a / b;
    }
}
