package com.course.tasks;

public class Task21 {

    /**
     * Возвращает n-е число Фибоначчи. fib(0) == 0, fib(1) == 1, fib(2) == 1, fib(10) == 55.
     * Для n &lt; 0 — IllegalArgumentException.
     */
    public static long fibonacci(int n) {
        // TODO: реализуй
        if (n < 0) {
            throw new IllegalArgumentException();
        } else if (n <= 1) {
            return n;
        }
        long n1 = 0, n2 = 1;

        for (int i = 1; i < n; i++) {
            long n3 = n2 + n1;
            n1 = n2;
            n2 = n3;
        }
        return n2;
    }
}
