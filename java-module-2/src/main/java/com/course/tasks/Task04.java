package com.course.tasks;

public class Task04 {

    /**
     * Возвращает максимум из трёх чисел.
     * Реализовать через вызов вспомогательного {@code max2}.
     * Пример: max3(1, 9, 5) == 9.
     */
    public static int max3(int a, int b, int c) {
        // TODO: реализуй (через max2)
        //return c > max2(a, b) ? c : max2(a, b);
        return Math.max(c, max2(a, b));
    }

    private static int max2(int a, int b) {
        // TODO: реализуй
        //return a > b ? a : b;
        return Math.max(a, b);
    }
}
