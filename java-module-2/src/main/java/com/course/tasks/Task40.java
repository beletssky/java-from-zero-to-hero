package com.course.tasks;

public class Task40 {

    /**
     * Объединяет два уже отсортированных по возрастанию массива в один
     * отсортированный массив. Реализовать линейным проходом по обоим массивам,
     * без Arrays.sort. Если любой из массивов {@code null} — IllegalArgumentException.
     * <p>UA: Об'єднує два вже відсортованих за зростанням масиви в один
     * відсортований масив. Реалізувати лінійним проходом по обох масивах,
     * без Arrays.sort. Якщо будь-який із масивів {@code null} — IllegalArgumentException.
     * Примеры: mergeSortedArrays({1,3,5}, {2,4,6}) == {1,2,3,4,5,6};
     * mergeSortedArrays({}, {1,2}) == {1,2}.
     */
    public static int[] mergeSortedArrays(int[] a, int[] b) {
        // TODO: реализуй
        if (a == null || b == null) {
            throw new IllegalArgumentException();
        }
        int[] result = new int[a.length + b.length];
        int i = 0;
        int j = 0;
        int k = 0;

        while (i < a.length && j < b.length) {
            if (a[i] <= b[j]) {
                result[k] = a[i];
                i++;
            } else {
                result[k] = b[j];
                j++;
            }
            k++;
        }

        while (i < a.length) {
            result[k] = a[i];
            i++;
            k++;
        }

        while (j < b.length) {
            result[k] = b[j];
            j++;
            k++;
        }
        return result;
    }


}
