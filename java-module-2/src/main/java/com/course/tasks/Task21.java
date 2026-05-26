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
        // TODO: реализуй
        String[] splittedString = s.split(" ");
        for (int i = 0; i < splittedString.length; i++) {
            if (!splittedString[i].isEmpty()) {
                String firstLetter = splittedString[i].substring(0, 1).toUpperCase();
                String otherLetters = splittedString[i].substring(1).toLowerCase();
                splittedString[i] = firstLetter + otherLetters;
            }
        }
        return String.join(" ", splittedString);
    }
}
