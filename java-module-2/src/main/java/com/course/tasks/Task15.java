package com.course.tasks;

public class Task15 {

    /**
     * Возвращает новый массив только из положительных (&gt; 0) элементов.
     * Порядок сохраняется.
     * Примеры: filterPositive({-1,2,-3,4,0}) == {2,4}; filterPositive({}) == {}.
     */
    public static int[] filterPositive(int[] a) {
        int[] copy = a.clone();
        int j = a.length - 1;
        for (int i = 0; i < copy.length; i++){
            if(a[i] > 0){
                copy[j] = a[i];
            }
            j--;
        }
        return copy;
    }
}
