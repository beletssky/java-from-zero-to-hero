package com.course.tasks;

public class Task10 {

    /**
     * Возвращает первый индекс элемента target в массиве a или -1, если не найден.
     * Для {@code null} — IllegalArgumentException.
     * Примеры: indexOf({5,7,9,7}, 7) == 1; indexOf({1,2}, 99) == -1.
     */
    public static int indexOf(int[] a, int target) {
        if (a == null) {
            throw new IllegalArgumentException("NOOO");
        }
        for (int i = 0; i < a.length; i++) {
            if (a[i] == target) {
                return i;
            }
        }
        return -1;
    }
}