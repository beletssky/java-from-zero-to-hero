package com.course.tasks;

public class Task04 {

    /**
     * Возвращает максимум из трёх чисел.
     * Реализовать через вызов вспомогательного {@code max2}.
     * Пример: max3(1, 9, 5) == 9.
     */
    public static int max3(int a, int b, int c) {
        return max2(max2(a, b), c);
    }

    private static int max2(int a, int b) {
        return a > b ? a : b;
    }
}
