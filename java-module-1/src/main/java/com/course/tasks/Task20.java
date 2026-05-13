package com.course.tasks;

public class Task20 {

    /**
     * Возвращает n! для n &gt;= 0. Для n &lt; 0 — IllegalArgumentException.
     * Примеры: factorial(0) == 1; factorial(5) == 120; factorial(20) == 2432902008176640000L.
     */
    public static long factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("NOOOOO");
        }
        long result = 1L;
        for (int i = 1; i <= n; i++) {
            result = result * i;
        }
        return result;
    }
}
