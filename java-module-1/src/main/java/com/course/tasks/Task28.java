package com.course.tasks;

public class Task28 {
    /**
     * Возвращает количество делителей |n| для n != 0. Для n == 0 — IllegalArgumentException.
     * Примеры: countDivisors(12) == 6; countDivisors(7) == 2; countDivisors(1) == 1.
     */
    public static int countDivisors(int n) {
        if (n == 0) {
            throw new IllegalArgumentException();
        }
        n = Math.abs(n);
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                count = count + 1;
            }
        }
        return count;
    }
}