package com.course.tasks;

public class Task32 {

    /**
     * Возвращает новый массив без дубликатов. Порядок сохраняется (по первому вхождению).
     * Примеры: removeDuplicates({1,2,1,3,2,4}) == {1,2,3,4};
     * removeDuplicates({}) == {}.
     */
    public static int[] removeDuplicates(int[] a) {
        if (a == null) {
            throw new IllegalArgumentException("NOOO");
        }
        if (a.length == 0) {
            return new int[0];
        }
        int[] temp = new int[a.length];
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            boolean isDuplicate = false;
            for (int j = 0; j < count; j++) {
                if (a[i] == temp[j]) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                temp[count] = a[i];
                count++;
            }
        }
        int[] result = new int[count];
        for (int i = 0; i < count; i++) {
            result[i] = temp[i];
        }
        return result;
    }
}
