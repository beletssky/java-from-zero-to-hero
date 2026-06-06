package com.course.tasks;

public class Task08 {

    /**
     * Возвращает наибольшее из трёх целых чисел.
     * Пример: maxOfThree(1, 9, 5) == 9.
     */
    public static int maxOfThree(int a, int b, int c) {
        // TODO: реализуй
        //  return a > b ? a : b > c ? b : c;
        return Math.max(a, Math.max(b, c));
    }
}
