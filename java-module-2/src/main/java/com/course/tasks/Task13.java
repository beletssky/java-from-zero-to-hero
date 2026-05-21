package com.course.tasks;

public class Task13 {

    /**
     * Возвращает новый массив с элементами исходного в обратном порядке.
     * Исходный массив не изменять.
     * Примеры: reverse({1,2,3}) == {3,2,1}; reverse({}) == {}; reverse({5}) == {5}.
     */
    public static int[] reverse(int[] a) {
        int[] copy = a.clone();
        int j = a.length - 1;
        for (int i = 0; i < copy.length; i++){
            copy[j] = a[i];
            j--;
        }
        return copy;
    }
}
