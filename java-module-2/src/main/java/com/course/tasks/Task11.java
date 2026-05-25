package com.course.tasks;

public class Task11 {

    /**
     * Проверяет, содержится ли target в массиве a.
     * Для {@code null} — IllegalArgumentException.
     * Примеры: contains({1,2,3}, 2) == true; contains({}, 5) == false.
     */
    public static boolean contains(int[] a, int target) {
        if (a == null) {
            throw new IllegalArgumentException("NOOO");
        }
        for (int x : a) {
            if (x == target) {
                return true;
            }
        }
        return false;
    }
}
