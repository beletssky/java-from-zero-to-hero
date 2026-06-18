package com.course.tasks;

public class Task16 {

    /**
     * Возвращает второе по величине УНИКАЛЬНОЕ значение массива.
     * Если уникальных значений меньше двух, или массив длиной &lt; 2, или {@code null} —
     * IllegalArgumentException.
     * Примеры: secondMax({1,3,5,5,4}) == 4; secondMax({1,2}) == 1.
     */
    public static int secondMax(int[] a) {
        if (a == null || a.length < 2) {
            throw new IllegalArgumentException("NOOO");
        }
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        for (int i = 0; i < a.length; i++) {
            int num = a[i];
            if (num > max) {
                secondMax = max;
                max = num;
            } else if (num > secondMax && num < max) {
                secondMax = num;
            }
        }
        if (secondMax == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("NOOO");
        }
        return secondMax;
    }
}
