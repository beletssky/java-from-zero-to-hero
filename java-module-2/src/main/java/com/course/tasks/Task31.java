package com.course.tasks;

public class Task31 {

    /**
     * Возвращает новый массив, отсортированный по возрастанию.
     * НЕЛЬЗЯ использовать Arrays.sort. Реализовать вручную (bubble sort или selection sort).
     * Исходный массив не изменять.
     * Примеры: sortAsc({3,1,4,1,5}) == {1,1,3,4,5}; sortAsc({}) == {}.
     */
    public static int[] sortAsc(int[] a) {
        // TODO: реализуй
        int[] result = a.clone();
        boolean swapped;
        for (int i = 0; i < result.length - 1; i++) {
            swapped = false;
            for (int j = 0; j < result.length - 1 - i; j++) {
                if (result[j] > result[j + 1]) {
                    int temp = result[j];
                    result[j] = result[j + 1];
                    result[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }
        return result;
    }

}
