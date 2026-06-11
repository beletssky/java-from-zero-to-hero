package com.course.tasks;

public class Task27 {

    /**
     * НОД (алгоритм Евклида) для |a| и |b|.
     * Примеры: gcd(12, 18) == 6; gcd(7, 13) == 1; gcd(0, 5) == 5; gcd(0, 0) == 0.
     */
    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = a % b;
            a = b;
            b = temp;
        }
        return Math.abs(a);
    }
}
