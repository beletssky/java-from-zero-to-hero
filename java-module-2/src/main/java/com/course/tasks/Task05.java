package com.course.tasks;

public class Task05 {

    public Task05(int i) {

    }

    /**
     * Сумма двух чисел (перегрузка с двумя аргументами).
     * Пример: sum(2, 3) == 5.
     */
    public static int sum(int a, int b) {
        int sum = a + b;
        return sum;
    }

    /**
     * Сумма трёх чисел (перегрузка с тремя аргументами).
     * Пример: sum(1, 2, 3) == 6.
     */
    public static Task05 sum(int a, int b, int c) {
        Task05 sum = new Task05(a + b + c);
        return sum;
    }
}
