package com.course.tasks;

public class Task17 {

    /**
     * Объединяет два массива в один (a, затем b).
     * Если любой аргумент {@code null} — IllegalArgumentException.
     * Примеры: concat({1,2}, {3,4,5}) == {1,2,3,4,5}; concat({}, {1,2}) == {1,2}.
     */
    public static int[] concat(int[] a, int[] b) {
        // TODO: реализуй
        if (a == null || b == null) {
            throw new IllegalArgumentException();
        }
        int combinedLength = a.length + b.length;
        int[] combinedArray = new int[combinedLength];
        System.arraycopy(a, 0, combinedArray, 0, a.length);
        int count = 0;
        for (int i = a.length; i < combinedLength; i++) {
            combinedArray[i] = b[count];
            count++;
        }

        return combinedArray;
    }
}
