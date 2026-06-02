package com.course.tasks;

public class Task34 {

    /**
     * Возвращает количество простых чисел в диапазоне [2..n].
     * Примеры: countPrimesUpTo(10) == 4 (2,3,5,7); countPrimesUpTo(1) == 0.
     */
    public static int countPrimesUpTo(int n) {
        // TODO: реализуй
        if (n < 2) {
            return 0;
        }
        boolean[] isComposite = new boolean[n + 1];

        for (int i = 2; i * i <= n; i++) {
            if (!isComposite[i]) {
                for (int j = i * i; j <= n; j += i) {
                    isComposite[j] = true;
                }
            }
        }

        int count = 0;
        for (int i = 2; i <= n; i++) {
            if (!isComposite[i]) {
                count++;
            }
        }

        return count;
    }
}
