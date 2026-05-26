package com.course.tasks;

public class Task15 {

    /**
     * Возвращает новый массив только из положительных (&gt; 0) элементов.
     * Порядок сохраняется.
     * Примеры: filterPositive({-1,2,-3,4,0}) == {2,4}; filterPositive({}) == {}.
     */
    public static int[] filterPositive(int[] a) {
        // TODO: реализуй
        int count = 0;
        for (int x : a) {
            if (x > 0) count++;
        }
        int[] b = new int[count];
        int bIndex = 0;
        for (int i : a) {
            if (i > 0) {
                b[bIndex] = i;
                bIndex++;
            }
        }
        return b;
    }
}
