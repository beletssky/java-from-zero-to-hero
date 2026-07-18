package com.course.tasks;

public class Task20 {
    public static long factorial(int n) {
        if(n<0){
            throw new IllegalArgumentException();
        }
        if (n<=1){
            return 1;
        }
        long result=1L;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}

/**
 * Возвращает n! для n >= 0. Для n < 0 — IllegalArgumentException.
 * Примеры: factorial(0) == 1; factorial(5) == 120; factorial(20) == 2432902008176640000L.
 */