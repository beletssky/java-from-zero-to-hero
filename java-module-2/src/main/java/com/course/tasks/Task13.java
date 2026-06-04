package com.course.tasks;

public class Task13 {

    /**
     * Возвращает новый массив с элементами исходного в обратном порядке.
     * Исходный массив не изменять.
     * Примеры: reverse({1,2,3}) == {3,2,1}; reverse({}) == {}; reverse({5}) == {5}.
     */


    public static int[] reverse(int[] a) {
        int[] buffer = new int[a.length];

        for (int i = 0; i < a.length; i++) {
            buffer[i] = a[a.length - 1 - i];
        }
        return buffer;
    }
}

