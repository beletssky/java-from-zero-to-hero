package com.course.tasks;

public class Task28 {

    /**
     * Возвращает количество делителей |n| для n != 0. Для n == 0 — IllegalArgumentException.
     * Примеры: countDivisors(12) == 6; countDivisors(7) == 2; countDivisors(1) == 1.
     */
    public static int countDivisors(int n) {
        // TODO: реализуй
        if (n == 0) {
            throw new IllegalArgumentException();
        }
        int num = Math.abs(n);
        int count = 0;

        for (long i = 1; i * i <= num; i++) {
            if (num % i == 0) {
                if (i * i == num) {
                    count += 1;
                } else {
                    count += 2;
                }
            }
        }
        return count;
    }
}
