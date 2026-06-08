package com.course.tasks;

public class Task29 {

    /**
     * Возвращает максимальный элемент массива Integer, игнорируя {@code null}-элементы.
     * Если массив пуст или содержит только {@code null}-ы — возвращает {@code null}.
     * Если сам массив {@code null} — IllegalArgumentException.
     * Примеры: findMax({1, null, 5, 3}) == 5; findMax({null, null}) == null;
     * findMax({}) == null.
     */
    public static Integer findMax(Integer[] a) {

        if (!isInputValid(a)) {
            return null;
        }

        int max = Integer.MIN_VALUE;

        for (int i = 0; i < a.length; i++) {

            if (a[i] != null && max < a[i]) {
                max = a[i];
            }

        }

        return max;
    }

    private static boolean isInputValid(Integer[] input) {
        if (input == null) {
            throw new IllegalArgumentException();
        }

        if (input.length == 0) {
            return false;
        }

        for (int i = 0; i < input.length; i++) {

            if (input[i] != null) {
                break;
            }

            if (i == input.length - 1) {
                return false;
            }
        }

        return true;
    }
}
