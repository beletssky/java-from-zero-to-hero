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
            throw new IllegalArgumentException();
        }
        int max = a[0];
        int secondMax = a[1];
        if (max < secondMax) {
            max = a[1];
            secondMax = a[0];
        }
        for (int i = 2; i < a.length; i++) {
            if (max < a[i]) {
                max = a[i];
            }
            if (secondMax < max && secondMax < a[i] && max != a[i]) {
                secondMax = a[i];
            }
        }
        if (max == secondMax) {
            throw new IllegalArgumentException();
        }
        return secondMax;
    }
}
