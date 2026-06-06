package com.course.tasks;

public class Task26 {

    /**
     * Возводит base в степень exp без использования Math.pow.
     * Для exp &lt; 0 — IllegalArgumentException.
     * Примеры: power(2, 10) == 1024L; power(3, 0) == 1L; power(5, 1) == 5L.
     */
    public static long power(int base, int exp) {
        // TODO: реализуй
        if (exp < 0) {
            throw new IllegalArgumentException();
        }
        if (exp == 0) {
            return 1;
        }
        long number = base;
        for (int i = 0; i < exp - 1; i++) {
            number *= base;
        }
        return number;
    }
}
