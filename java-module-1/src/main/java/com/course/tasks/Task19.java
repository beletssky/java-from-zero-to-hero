package com.course.tasks;

public class Task19 {

    /**
     * Возвращает 1 + 2 + ... + n. Для n &lt;= 0 возвращает 0L.
     * Примеры: sumFromOneTo(5) == 15L; sumFromOneTo(100) == 5050L.
     */
    public static long sumFromOneTo(int n) {
        if (n <= 0) {
            return 0L;
        }
        return (long) n * (n + 1) / 2;
    }
}
