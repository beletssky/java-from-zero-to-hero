package com.course.tasks;

import java.util.Arrays;

public class Task32 {

    /**
     * Возвращает новый массив без дубликатов. Порядок сохраняется (по первому вхождению).
     * Примеры: removeDuplicates({1,2,1,3,2,4}) == {1,2,3,4};
     * removeDuplicates({}) == {}.
     */
    public static int[] removeDuplicates(int[] a) {

        int[] result = new int[]{};

        if (a.length == 0) {
            return result;
        }

        for (int i = 0; i < a.length; i++) {

            if (i == 0) {
                result = Arrays.copyOf(result, result.length + 1);
                result[0] = a[0];
            }

            for (int j = 0; j < result.length; j++) {

                if (a[i] == result[j]) {
                    break;
                }

                if (j == result.length - 1) {
                    result = Arrays.copyOf(result, result.length + 1);
                    result[result.length - 1] = a[i];
                    break;
                }
            }
        }

        return result;
    }
}
