package com.course.tasks;

public class Task21 {

    /**
     * Возвращает строку, где каждое слово начинается с заглавной буквы,
     * а остальные буквы — строчные. Слова разделены пробелами.
     * Примеры: toTitleCase("hello world") == "Hello World";
     * toTitleCase("java is cool") == "Java Is Cool";
     * toTitleCase("") == "".
     */
    public static String toTitleCase(String s) {
        if (s == null) {
            return s;
        }
        String[] words = s.split(" ");
        StringBuilder result = new StringBuilder();
        for (String currentWord : words) {
            if (currentWord.isEmpty()) {
                continue;
            }
            String firstLetter = currentWord.substring(0, 1).toUpperCase();
            String restOfWord = currentWord.substring(1).toLowerCase();
            String capitalizedWord = firstLetter + restOfWord;
            result.append(capitalizedWord);
            result.append(" ");
        }
        return result.toString().trim();
    }
}
