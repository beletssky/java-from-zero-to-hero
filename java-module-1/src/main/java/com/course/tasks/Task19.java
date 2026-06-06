package com.course.tasks;

public class Task19 {

    /**
     * Возвращает 1 + 2 + ... + n. Для n &lt;= 0 возвращает 0L.
     * Примеры: sumFromOneTo(5) == 15L; sumFromOneTo(100) == 5050L.
     */
    public static long sumFromOneTo(int n) {
        // TODO: реализуй
        if (n <= 0) {
            return 0;
        }

        long sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }

        return sum;
    }
}
