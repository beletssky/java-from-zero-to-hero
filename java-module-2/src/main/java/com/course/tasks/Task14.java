package com.course.tasks;

public class Task14 {

    /**
     * Возвращает новый массив, где каждый элемент исходного умножен на 2.
     * Примеры: doubleEach({1,2,3}) == {2,4,6}; doubleEach({}) == {}.
     */
    public static int[] doubleEach(int[] a) {
        // TODO: реализуй
        int[] b = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            b[i] = a[i] * 2;
        }
        return b;
    }
}
