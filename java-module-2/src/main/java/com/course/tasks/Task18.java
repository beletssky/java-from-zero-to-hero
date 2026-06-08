package com.course.tasks;

public class Task18 {

    /**
     * Возвращает количество вхождений символа c в строку s.
     * Для {@code null} — IllegalArgumentException.
     * Примеры: countChar("hello", 'l') == 2; countChar("", 'a') == 0.
     */
    public static int countChar(String s, char c) {
        if (s == null) {
            throw new IllegalArgumentException("NOOO");
        }
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            char currentLetter = s.charAt(i);
            if (currentLetter == c) {
                count++;
            }
        }
        return count;
    }
}
