package com.course.tasks;

import java.util.Arrays;

public class Task15 {

    /**
     * Возвращает новый массив только из положительных (&gt; 0) элементов.
     * Порядок сохраняется.
     * Примеры: filterPositive({-1,2,-3,4,0}) == {2,4}; filterPositive({}) == {}.
     */
    public static int[] filterPositive(int[] a) {
        int [] positive = new int[]{};
        int j = 0;
        for (int i = 0; i < a.length; i++){
            if (a[i] > 0){
                positive = Arrays.copyOf(positive, positive.length + 1);
                positive[j] = a[i];
            j++;
            }
        }
        return positive;
    }
}
