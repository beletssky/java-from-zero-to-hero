package com.course.tasks;

public class Task25 {

    /**
     * Возвращает строку s, повторённую n раз. Использовать StringBuilder.
     * Для n &lt; 0 — IllegalArgumentException.
     * Примеры: repeat("ab", 3) == "ababab"; repeat("x", 0) == "".
     */
    public static String repeat(String s, int n) {
        if (n < 0) {
            throw new IllegalArgumentException("NOOO");
        }
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < n; i++) {
            result.append(s);
        }
        return result.toString();
    }
}
