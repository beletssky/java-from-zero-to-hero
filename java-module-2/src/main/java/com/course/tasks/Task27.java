package com.course.tasks;

public class Task27 {

    /**
     * Сумма двух Integer. Если любой аргумент {@code null} — считать его как 0.
     * Примеры: sumOrZero(3, 5) == 8; sumOrZero(null, 5) == 5;
     * sumOrZero(null, null) == 0.
     */
    public static int sumOrZero(Integer a, Integer b) {
        int safeA;
        int safeB;
        if (a == null) {
            safeA = 0;
        } else {
            safeA = a;
        }
        if (b == null) {
            safeB = 0;
        } else {
            safeB = b;
        }
        return safeA + safeB;
    }
}
