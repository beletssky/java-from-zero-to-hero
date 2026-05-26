package com.course.tasks;

public class Task31 {

    /**
     * Возвращает новый массив, отсортированный по возрастанию.
     * НЕЛЬЗЯ использовать Arrays.sort. Реализовать вручную (bubble sort или selection sort).
     * Исходный массив не изменять.
     * Примеры: sortAsc({3,1,4,1,5}) == {1,1,3,4,5}; sortAsc({}) == {}.
     */
    public static int[] sortAsc(int[] a) {
        int[] copy = a.clone();

        for (int j = 0; j < copy.length; j++) {

            for (int i = 1; i < copy.length; i++) {

                if (copy[i - 1] > copy[i]) {
                    int x = copy[i - 1];
                    copy[i - 1] = copy[i];
                    copy[i] = x;
                }
            }
        }

        return copy;
    }
}
