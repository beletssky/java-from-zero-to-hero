package com.course.tasks;

public class Task12 {
    /**
     * Возвращает количество чётных элементов массива.
     * Примеры: countEvens({1,2,3,4,5,6}) == 3; countEvens({1,3,5}) == 0;
     *          countEvens({}) == 0.
     */
    public static int countEvens(int[] a) {
        int count = 0;
        for (int x : a) {
            if (x % 2 == 0) {
                count++;
            }
        }
        return count;
    }
}