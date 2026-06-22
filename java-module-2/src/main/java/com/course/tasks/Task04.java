package com.course.tasks;

public class Task04 {

    /**
     * Возвращает максимум из трёх чисел.
     * Реализовать через вызов вспомогательного {@code max2}.
     * Пример: max3(1, 9, 5) == 9.
     */
    public static int max3(int a, int b, int c) {
        int max3 = (a > b) ? a : b;
        max3 = (max3 > c) ? max3 : c;
        return max3;
    }

    private static int max2(int a, int b) {
        Task04.max3(a, b, 0);
        return max3(a, b, 0);
    }
}
