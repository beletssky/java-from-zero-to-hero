package com.course.tasks;

public class Task15 {

    /**
     * Возвращает новый массив только из положительных (&gt; 0) элементов.
     * Порядок сохраняется.
     * Примеры: filterPositive({-1,2,-3,4,0}) == {2,4}; filterPositive({}) == {}.
     */
    public static int[] filterPositive(int[] a) {
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > 0) {
                count++;
            }
        }
        int[] result = new int[count];
        int j = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > 0) {
                result[j] = a[i];
                j++;
            }
        }
        return result;
        }
    }
