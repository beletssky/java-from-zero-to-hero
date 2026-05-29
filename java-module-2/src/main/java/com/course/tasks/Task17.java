package com.course.tasks;

public class Task17 {
    /**
     * Объединяет два массива в один (a, затем b).
     * Если любой аргумент {@code null} — IllegalArgumentException.
     * Примеры: concat({1,2}, {3,4,5}) == {1,2,3,4,5}; concat({}, {1,2}) == {1,2}.
     */
    public static int[] concat(int[] a, int[] b) {
        if (a == null || b == null) {
            throw new IllegalArgumentException("");
        }

        int[] result = new int[a.length + b.length];

        for (int i = 0; i < a.length; i++) {
            result[i] = a[i];
        }

        for (int i = 0; i < b.length; i++) {
            result[a.length + i] = b[i];
        }

        return result;
    }
}