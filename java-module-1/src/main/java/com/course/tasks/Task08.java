package com.course.tasks;

public class Task08 {

    /**
     * Возвращает наибольшее из трёх целых чисел.
     * Пример: maxOfThree(1, 9, 5) == 9.
     */
    public static int maxOfThree(int a, int b, int c) {
        int m1 = Math.max(a,b);
        int m2 = Math.max(m1,c);
        return m2;

    }
}
