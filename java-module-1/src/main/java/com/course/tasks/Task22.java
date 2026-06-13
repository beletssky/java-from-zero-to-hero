package com.course.tasks;

public class Task22 {
    /**
     * Возвращает количество цифр в |n|.
     * Примеры: countDigits(0) == 1; countDigits(123) == 3; countDigits(-45) == 2.
     */
    public static int countDigits(int n) {
        if (n == 0) {
            return 1;
        }
        if (n < 0) {
            n = -n;
        }
        long num = Math.abs((long) n);
        int count = 0;
        while (num > 0) {
            num = num / 10;
            count = count + 1;
        }
        return count;
    }
}