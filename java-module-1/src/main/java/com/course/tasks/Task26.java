package com.course.tasks;

public class Task26 {
    public static long power(int base, int exp) {
        if (exp < 0) {
            throw new IllegalArgumentException("Число не может быть меньше 0");
        }
        long result = 1;
        for (int i = 0; i < exp; i++) {
            result = result * base;
        }
        return result;
    }
}

/**
 * Возводит base в степень exp без использования Math.pow.
 * Для exp < 0 — IllegalArgumentException.
 * Примеры: power(2, 10) == 1024L; power(3, 0) == 1L; power(5, 1) == 5L.
 */