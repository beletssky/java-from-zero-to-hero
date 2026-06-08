package com.course.tasks;

public class Task05 {
    /**
     * Сумма двух чисел (перегрузка с двумя аргументами).
     * Пример: sum(2, 3) == 5.
     */
    public static int sum(int a, int b) {
        return a + b;
    }

    /**
     * Сумма трёх чисел (перегрузка с тремя аргументами).
     * Пример: sum(1, 2, 3) == 6.
     */
    public static int sum(int a, int b, int c) {
        return a + b + c;
    }
}