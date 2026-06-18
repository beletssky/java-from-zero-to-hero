package com.course.tasks;

public class Task22 {

    /**
     * Возвращает количество слов в строке (разделители — один или несколько пробелов).
     * Примеры: countWords("hello world") == 2;
     * countWords("  one  two  three  ") == 3;
     * countWords("") == 0; countWords("   ") == 0.
     */
    public static int countWords(String s) {
        if (s == null) {
            throw new IllegalArgumentException("NOOO");
        }
        String trimmed = s.trim();
        if (trimmed.isEmpty()) {
            return 0;
        }
        String[] words = trimmed.split(" ");
        int count = 0;
        for (String currentWord : words) {
            if (!currentWord.isEmpty()) {
                count++;
            }
        }
        return count;
    }
}
