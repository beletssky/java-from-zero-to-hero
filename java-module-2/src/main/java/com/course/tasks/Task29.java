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
        if (a == null) {
            throw new IllegalArgumentException("NOOO");
        }
        Integer max = null;
        for (Integer num : a) {
            if (num == null) {
                continue;
            }
            if (max == null || num > max) {
                max = num;
            }
        }
        return max;
    }
}

