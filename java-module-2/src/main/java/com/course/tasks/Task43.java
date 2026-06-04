package com.course.tasks;

public class Task43 {

    /**
     * Дополняет строку справа символом fill до длины width.
     * Если строка уже длиннее width — обрезает её до width.
     * Если width &lt; 0 — IllegalArgumentException.
     * <p>UA: Доповнює рядок справа символом fill до довжини width.
     * Якщо рядок уже довший за width — обрізає його до width.
     * Якщо width &lt; 0 — IllegalArgumentException.
     * Примеры: alignText("hi", 5, '.') == "hi...";
     * alignText("hello world", 5, '.') == "hello".
     */
    public static String alignText(String s, int width, char fill) {
        // TODO: реализуй
        if (width < 0) {
            throw new IllegalArgumentException();
        }
        if (s.length() >= width) {
            return s.substring(0, width);
        }
        int count = width - s.length();
        StringBuilder sb = new StringBuilder(s);

        sb.repeat(String.valueOf(fill), count);
        return sb.toString();
    }
}
