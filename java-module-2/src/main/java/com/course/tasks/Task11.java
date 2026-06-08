package com.course.tasks;

public class Task11 {

    /**
     * Проверяет, содержится ли target в массиве a.
     * Для {@code null} — IllegalArgumentException.
     * Примеры: contains({1,2,3}, 2) == true; contains({}, 5) == false.
     */
    public static boolean contains(int[] a, int target) {
        if (a == null){
            throw new IllegalArgumentException();
        }
        int idx = 0;
        for (int i = 0; i < a.length; i++)
            if (a[i] == target) {
                idx = i;
                return true;
            }
        return false;
    }
}
