package com.course.tasks;

public class Task02 {

    /**
     * Проверяет, лежит ли n в диапазоне [min, max] (включительно с обеих сторон).
     * Примеры: inRange(5, 1, 10) == true; inRange(0, 1, 10) == false;
     * inRange(10, 1, 10) == true.
     */
    public static boolean inRange(int n, int min, int max) {
        return min >= n && n <= max;
    }
}
