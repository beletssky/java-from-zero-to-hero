package com.course.tasks;

public class Task06 {
    /**
     * Возвращает сумму всех элементов массива.
     * Для пустого массива возвращает 0. Для {@code null} —
     * IllegalArgumentException.
     * Примеры: sumArray({1,2,3}) == 6; sumArray({}) == 0.
     */
    public static int sumArray(int[] a) {
        if (a == null) {
            throw new IllegalArgumentException("ты null - ноль в математике");
        }
        int sum = 0;
        for (int i : a) {
            sum += i;
        }
        return sum;
    }
}