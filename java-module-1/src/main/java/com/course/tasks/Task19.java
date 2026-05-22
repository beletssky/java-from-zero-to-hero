package com.course.tasks;

public class Task19 {
    public static long sumFromOneTo(int n) {
        long s = (long) (1 + n) * n / 2;
        if (n <= 0){
            return 0L;
        }
        return s;
    }
}

/**
 * Возвращает 1 + 2 + ... + n. Для n <= 0 возвращает 0L.
 * Примеры: sumFromOneTo(5) == 15L; sumFromOneTo(100) == 5050L.
 */