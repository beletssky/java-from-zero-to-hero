package com.course.tasks;

public class Task30 {

    /**
     * Возвращает минимальную цифру в |n|.
     * Примеры: minDigit(573) == 3; minDigit(1000) == 0; minDigit(-49) == 4.
     */
    public static int minDigit(int n) {
        // TODO: реализуй
        if (n == 0) {
            return 0;
        }
        n = Math.abs(n);
        int min = 9;
        while (n > 0) {
            if (min > n % 10) {
                min = n % 10;
            }
            n /= 10;
        }
        return min;
    }
}
