package com.course.tasks;

import java.util.Arrays;

public class Task12 {

    /**
     * Возвращает количество чётных элементов массива.
     * Примеры: countEvens({1,2,3,4,5,6}) == 3; countEvens({1,3,5}) == 0;
     *          countEvens({}) == 0.
     */
    public static int countEvens(int[] a) {
        int counter = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                counter++;
            }
        }
        return counter;
    }
}
