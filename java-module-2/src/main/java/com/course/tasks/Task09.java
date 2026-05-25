package com.course.tasks;

public class Task09 {

    /**
     * Возвращает среднее арифметическое элементов массива (как double).
     * Для пустого массива или {@code null} — IllegalArgumentException.
     * Точность сравнения 1e-9.
     * Примеры: avgArray({1,2,3,4}) == 2.5.
     */
    public static double avgArray(int[] a) {
        if (a == null || a.length == 0) {
            throw new IllegalArgumentException("NOOO");
        }
        int sum = 0;
        for (int x : a){
            sum = sum +x;
        }
        return (double) sum / a.length;
    }
}
