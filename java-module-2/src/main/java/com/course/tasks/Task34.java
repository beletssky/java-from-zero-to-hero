package com.course.tasks;

import java.util.Arrays;

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
        int[] result = new int[a.length];

        if (a.length == 0) {
            return new int[]{};
        }

        int x = k % a.length;

        if (x == 0) {
            return a.clone();
        }

        if (x > 0) {
            for (int i = 0; i < a.length; i++) {

                if (x == a.length) {
                    x = 0;
                }

                result[x] = a[i];

                x++;
            }
        } else {
            x = a.length - 1 + x;

            for (int i = a.length - 1; i >= 0; i--) {

                if (x == -1) {
                    x = a.length - 1;
                }

                result[x] = a[i];

                x--;
            }

        }
        return result;
    }
}
