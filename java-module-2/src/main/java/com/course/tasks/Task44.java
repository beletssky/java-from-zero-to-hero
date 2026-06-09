package com.course.tasks;

public class Task44 {

    /**
     * Сжатие повторов (run-length encoding). Возвращает массив, в котором
     * каждой группе подряд идущих одинаковых значений соответствует пара
     * (значение, количество).
     * <p>UA: Стиснення повторів (run-length encoding). Повертає масив, у якому
     * кожній групі однакових значень, що йдуть підряд, відповідає пара
     * (значення, кількість).
     * Примеры: runLengthEncode({1,1,2,3,3,3}) == {1,2,2,1,3,3};
     * runLengthEncode({}) == {}; runLengthEncode({5}) == {5,1}.
     */
    public static int[] runLengthEncode(int[] a) {
        // TODO: реализуй
        if (a == null) {
            throw new IllegalArgumentException();
        }
        if (a.length == 0) {
            return new int[0];
        }
        int countCouple = 1;
        for (int i = 1; i < a.length; i++) {
            if (a[i] != a[i - 1]) {
                countCouple++;
            }
        }
        countCouple *= 2;
        int[] result = new int[countCouple];
        int currentValue = a[0];
        int count = 1;
        int resultIndex = 0;
        for (int i = 1; i < a.length; i++) {
            if (currentValue == a[i]) {
                count++;
            }
            if (currentValue != a[i]) {
                result[resultIndex] = currentValue;
                result[resultIndex + 1] = count;
                resultIndex += 2;
                currentValue = a[i];
                count = 1;
            }
        }
        result[resultIndex] = currentValue;
        result[resultIndex + 1] = count;

        return result;

    }
}
