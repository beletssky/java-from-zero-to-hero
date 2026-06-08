package com.course.tasks;

public class Task06 {

    /**
     * Возвращает сумму всех элементов массива.
     * Для пустого массива возвращает 0. Для {@code null} —
     * IllegalArgumentException.
     * Примеры: sumArray({1,2,3}) == 6; sumArray({}) == 0.
     */
    public static int sumArray(int[] a) {
        int sum = 0;
        if (a == null){
            throw new IllegalArgumentException();
        }
        if (a.length == 0) {return 0;}
        for (int i = 0; i < a.length; i++){
            sum = sum + a[i];
        }
        return sum;
    }
}
