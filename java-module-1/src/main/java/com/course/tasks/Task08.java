package com.course.tasks;

public class Task08 {

    /**
     * Возвращает наибольшее из трёх целых чисел.
     * Пример: maxOfThree(1, 9, 5) == 9.
     */
    public static int maxOfThree(int a, int b, int c) {
        if (a >= b && a >= c) {
            return a;
        }
        else if (b >= a && b >= c) {
            return b;
        }
        else
            return c;
    }
}
