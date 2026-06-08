package com.course.tasks;

public class Task08 {

    /**
     * Возвращает минимальный элемент массива.
     * Для пустого массива или {@code null} — IllegalArgumentException.
     * Примеры: minArray({3,1,4,1,5}) == 1.
     */
    public static int minArray(int[] a) {
        if (a == null){
            throw new IllegalArgumentException();
        }
        int min = a[0];
        for (int x : a) {
            if (x < min) min = x;
        }
        return min;
    }
}
