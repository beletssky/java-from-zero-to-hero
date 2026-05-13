package com.course.tasks;

public class Task24 {

    /**
     * Возвращает число, у которого цифры идут в обратном порядке. Знак сохраняется.
     * Примеры: reverseNumber(123) == 321; reverseNumber(-450) == -54; reverseNumber(0) == 0.
     */
    public static int reverseNumber(int n) {
        int reverse = 0;
        while (n != 0){
            reverse = n % 10;
            n = n / 10;
        }
        return reverse;

    }
}
