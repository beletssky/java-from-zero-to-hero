package com.course.tasks;

public class Task13 {

    /**
     * Возвращает новый массив с элементами исходного в обратном порядке.
     * Исходный массив не изменять.
     * Примеры: reverse({1,2,3}) == {3,2,1}; reverse({}) == {}; reverse({5}) == {5}.
     */
    public static int[] reverse(int[] a) {
        // TODO: реализуй
        int[] b = new int[a.length];
        for (int bIndex = 0; bIndex < a.length; bIndex++) {
            int aIndex = a.length - bIndex - 1;
            b[bIndex] = a[aIndex];
        }
        return b;
    }
}
