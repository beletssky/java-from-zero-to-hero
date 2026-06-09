package com.course.tasks;

public class Task34 {

    /**
     * Сдвиг массива вправо на k позиций. k может быть больше длины массива
     * или отрицательным (отрицательный k = сдвиг влево).
     * Исходный массив не изменять — возвращать новый.
     * Примеры: rotateRight({1,2,3,4,5}, 2) == {4,5,1,2,3};
     * rotateRight({1,2,3}, 5) == {2,3,1};
     * rotateRight({}, 3) == {}.
     */
    public static int[] rotateRight(int[] a, int k) {
        // TODO: реализуй
        if (a.length == 0) {
            return new int[0];
        }
        if (k == 0) {
            return a.clone();
        }
        int n = a.length;
        if (k > 0) {
            k %= n;
        }
        if (k < 0) {
            k = (k + n) % n;
        }
        int[] result = new int[n];
        for (int i = 0; i < n; i++) {
            int resultIndex = (i + k) % n;
            result[resultIndex] = a[i];
        }
        return result;
    }
}
