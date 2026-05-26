package com.course.tasks;

public class Task16 {

    /**
     * Возвращает второе по величине УНИКАЛЬНОЕ значение массива.
     * Если уникальных значений меньше двух, или массив длиной &lt; 2, или {@code null} —
     * IllegalArgumentException.
     * Примеры: secondMax({1,3,5,5,4}) == 4; secondMax({1,2}) == 1.
     */
    public static int secondMax(int[] a) {
        // TODO: реализуй
        if (a == null || a.length < 2) {
            throw new IllegalArgumentException();
        }
        Integer max = null;
        Integer secondMax = null;
        for (int x : a) {
            if (max == null) {
                max = x;
            } else if (x > max) {
                secondMax = max;
                max = x;

            } else if (x < max) {
                if (secondMax == null || x > secondMax) {
                    secondMax = x;
                }
            }
        }
        if (secondMax == null) {
            throw new IllegalArgumentException();
        }
        return secondMax;
    }
}
