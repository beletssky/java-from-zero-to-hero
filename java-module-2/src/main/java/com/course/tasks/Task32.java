package com.course.tasks;

public class Task32 {

    /**
     * Возвращает новый массив без дубликатов. Порядок сохраняется (по первому вхождению).
     * Примеры: removeDuplicates({1,2,1,3,2,4}) == {1,2,3,4};
     * removeDuplicates({}) == {}.
     */
    public static int[] removeDuplicates(int[] a) {
        // TODO: реализуй
        if (a == null) {
            return null;
        }
        if (a.length == 0) {
            return new int[0];
        }
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            boolean isDuplicate = false;
            for (int j = 0; j < i; j++) {
                if (a[i] == a[j]) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                count++;
            }
        }
        int[] result = new int[count];
        int resultIndex = 0;
        for (int i = 0; i < a.length; i++) {
            boolean isDuplicate = false;
            for (int j = 0; j < i; j++) {
                if (a[i] == a[j]) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                result[resultIndex] = a[i];
                resultIndex++;
            }
        }
        return result;
    }
}
