package com.course.tasks;

public class Task21 {

    /**
     * Возвращает n-е число Фибоначчи. fib(0) == 0, fib(1) == 1, fib(2) == 1, fib(10) == 55.
     * Для n &lt; 0 — IllegalArgumentException.
     */
    public static long fibonacci(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("NOOOOO");
        }
        if (n == 0) {
            return 0L;
        }
        if (n == 1) {
            return 1L;
        }
        long a = 0L;
        long b = 1L;
        for (int i = 2; i <= n; i++) {
            long next = a + b;
            a = b;
            b = next;
        }
        return b;

    }
}
