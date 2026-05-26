package com.course.tasks;

public class Task25 {

    /**
     * Возвращает строку s, повторённую n раз. Использовать StringBuilder.
     * Для n &lt; 0 — IllegalArgumentException.
     * Примеры: repeat("ab", 3) == "ababab"; repeat("x", 0) == "".
     */
    public static String repeat(String s, int n) {
        // TODO: реализуй
        if (n < 0) {
            throw new IllegalArgumentException();
        }
        StringBuilder repeatedString = new StringBuilder();
        return repeatedString.repeat(String.valueOf(s), n).toString();
    }
}
