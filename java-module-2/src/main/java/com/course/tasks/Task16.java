package com.course.tasks;

public class Task16 {
    /**
     * Возвращает второе по величине УНИКАЛЬНОЕ значение массива.
     * Если уникальных значений меньше двух, или массив длиной < 2, или {@code null} —
     * IllegalArgumentException.
     * Примеры: secondMax({1,3,5,5,4}) == 4; secondMax({1,2}) == 1.
     */
    public static int secondMax(int[] a) {
        if (a == null || a.length < 2)
            throw new IllegalArgumentException("сибись нахуй голова");
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        for (int x : a) {
            if (x > max) {
                secondMax = max;
                max = x;
            }
            else if (x > secondMax && x != max) {
                secondMax = x;
            }
        }
        if (secondMax == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("сибись нахуй голова");
        }
        return secondMax;
    }
}