package com.course.tasks;

public class Task27 {

    /**
     * НОД (алгоритм Евклида) для |a| и |b|.
     * Примеры: gcd(12, 18) == 6; gcd(7, 13) == 1; gcd(0, 5) == 5; gcd(0, 0) == 0.
     */
    public static int gcd(int a, int b) {
        // TODO: реализуй
        a = Math.abs(a);
        b = Math.abs(b);

        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
}