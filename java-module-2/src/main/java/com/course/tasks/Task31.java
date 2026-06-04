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
        if (a == null) {
            return null;
        }
        if (a.length == 0) {
            return new int[0];
        }
        int[] sortedArray = new int[a.length];
        System.arraycopy(a, 0, sortedArray, 0, a.length);
        int n = sortedArray.length;
        for (int i = 0; i < n - 1; i++) {
            int min = i;
            for (int j = i + 1; j < n; j++) {
                if (sortedArray[j] < sortedArray[min]) {
                    min = j;
                }
            }
            int temp = sortedArray[min];
            sortedArray[min] = sortedArray[i];
            sortedArray[i] = temp;
        }
        return sortedArray;
    }
}
