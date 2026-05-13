package com.course.tasks;

public class Task23 {

    /**
     * Возвращает сумму цифр |n|.
     * Примеры: sumOfDigits(123) == 6; sumOfDigits(-405) == 9; sumOfDigits(0) == 0.
     */
    public static int sumOfDigits(int n) {
        int sum = 0;

        while (n != 0) {
            int digital = n % 10;
            if (digital < 0) {
                digital = digital * -1;
            }
            sum = sum + digital;
            n = n / 10;
        }
        return sum;
    }
}
