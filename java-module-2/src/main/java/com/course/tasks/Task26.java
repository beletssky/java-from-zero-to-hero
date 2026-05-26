package com.course.tasks;

public class Task26 {

    /**
     * Парсит строку s через Integer.parseInt. Если падает с NumberFormatException
     * (в том числе для {@code null}), возвращает defaultValue.
     * Примеры: parseOrDefault("42", 0) == 42; parseOrDefault("abc", -1) == -1;
     * parseOrDefault(null, 99) == 99.
     */
    public static int parseOrDefault(String s, int defaultValue) {
        // TODO: реализуй
        try {
            return Integer.parseInt(s);
        } catch (NumberFormatException e) {
            return defaultValue;
        }

    }
}
