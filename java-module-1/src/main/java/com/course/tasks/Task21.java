package com.course.tasks;

public class Task21 {

    /**
     * Возвращает n-е число Фибоначчи. fib(0) == 0, fib(1) == 1, fib(2) == 1, fib(10) == 55.
     * Для n &lt; 0 — IllegalArgumentException.
     */
    public static long fibonacci(int n) {
        if(n<0) {
            throw new IllegalArgumentException();
        }
        if (n==0){
            return 0L;
        }
        if (n==1){
            return 1L;
        }
        long a=0L;
        long b=1L;
        long result = 0L;
        for (int i = 1; i<n; i++){
            result = b + a;
            a = b;
            b = result;

        }
        return result;
    }
}
