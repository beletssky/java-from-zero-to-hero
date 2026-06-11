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
        int count = 0;
        while (n != 0) {
            count++;
            n = n / 10;
        }
        return count;

    }
}
