package com.course.tasks;

public class Task07 {

    /**
     * Возвращает максимальный элемент массива.
     * Для пустого массива или {@code null} — IllegalArgumentException.
     * Примеры: maxArray({3,1,4,1,5,9,2,6}) == 9; maxArray({-5,-1,-10}) == -1.
     */
    public static int maxArray(int[] a) {

        if (a == null || a.length == 0) {
            throw new IllegalArgumentException("NOOO");
        }

        int max = a[0];
        for (int x : a) {
            if (x > max) {
                max = x;
            }
        }
        return max;
    }
}