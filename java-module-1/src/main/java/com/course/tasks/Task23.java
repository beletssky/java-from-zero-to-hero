package com.course.tasks;

public class Task23 {
    /**
     * Возвращает сумму цифр |n|.
     * Примеры: sumOfDigits(123) == 6; sumOfDigits(-405) == 9; sumOfDigits(0) == 0.
     */
    public static int sumOfDigits(int n) {
        if (n == 0) {
            return 0;
        }
        if (n < 0) {
            n = -n;
        }
        long num = Math.abs((long) n);
        int count = 0;
        while (num > 0) {
            count = count + (int)(num % 10);
            num = num / 10;
        }
        return count;
    }
}