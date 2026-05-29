package com.course.tasks;

public class Task21 {
    /**
     * Возвращает строку, где каждое слово начинается с заглавной буквы,
     * а остальные буквы — строчные. Слова разделены пробелами.
     * Примеры: toTitleCase("hello world") == "Hello World";
     *          toTitleCase("java is cool") == "Java Is Cool";
     *          toTitleCase("") == "".
     */
    public static String toTitleCase(String s) {
        if (s.length() == 0) {
            return "";
        }

        String[] words = s.split(" ");

        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            words[i] = Character.toUpperCase(word.charAt(0)) + word.substring(1).toLowerCase();
        }

        return String.join(" ", words);
    }
}