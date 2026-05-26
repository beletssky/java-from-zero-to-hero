package com.course.tasks;

public class Task18 {

    /**
     * Возвращает количество вхождений символа c в строку s.
     * Для {@code null} — IllegalArgumentException.
     * Примеры: countChar("hello", 'l') == 2; countChar("", 'a') == 0.
     */
    public static int countChar(String s, char c) {
        // TODO: реализуй
        if (s == null) {
            throw new IllegalArgumentException();
        }
        char[] dividedS = s.toCharArray();
        int count = 0;
        for (int x : dividedS) {
            if (x == c) count++;
        }
        return count;
    }
}
