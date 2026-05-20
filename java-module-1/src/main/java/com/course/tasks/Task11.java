package com.course.tasks;

public class Task11 {

    /**
     * По баллу 0..100 возвращает букву оценки:
     * 90+ → 'A', 75+ → 'B', 60+ → 'C', 50+ → 'D', меньше — 'F'.
     * Если score &lt; 0 или &gt; 100 — IllegalArgumentException.
     */
    public static char gradeLetter(int score) {
        if (score < 0 || score > 100) {
            throw new IllegalArgumentException("Хто здох той лох");
        }


        if (score >= 90) {
            return ('A');
        } else if (score >= 75) {
            return ('B');
        } else if (score >= 60) {
            return ('C');
        } else if (score >= 50) {
            return ('D');
        } else {
            return ('F');
        }
    }
}