package com.course.tasks;

public class Task21 {
    public static long fibonacci(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("n не может быть меньше 0");
        }
        if (n == 1) {
            return 1L;
        }
        if (n == 2) {
            return 1L;
        }
        long a = 0L;
        long b = 1L;
        long next = 0L;
        for (int i = 2; i <= n; ++i) {
            next = a + b;
            a = b;
            b = next;
        }
        return next;
    }
}
/**
 * Возвращает n-е число Фибоначчи. fib(0) == 0, fib(1) == 1, fib(2) == 1, fib(10) == 55.
 * Для n < 0 — IllegalArgumentException.
 */