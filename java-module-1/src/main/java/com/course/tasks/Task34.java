package com.course.tasks;

public class Task34 {

    /**
     * Возвращает количество простых чисел в диапазоне [2..n].
     * Примеры: countPrimesUpTo(10) == 4 (2,3,5,7); countPrimesUpTo(1) == 0.
     */
    public static int countPrimesUpTo(int n) {
        int count = 0;
        for (int i = 2; i <= n; i++) {
            boolean isPrime = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                count++;
            }
        }
        return count;
    }
}
