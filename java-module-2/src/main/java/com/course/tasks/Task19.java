package com.course.tasks;

public class Task19 {

    /**
     * Возвращает строку, перевёрнутую посимвольно. Использовать StringBuilder или цикл.
     * Для {@code null} — IllegalArgumentException.
     * Примеры: reverseString("hello") == "olleh"; reverseString("") == "".
     */
    public static String reverseString(String s) {
        // TODO: реализуй
        if (s == null) {
            throw new IllegalArgumentException();
        }
        StringBuilder reversedString = new StringBuilder(s);
        return reversedString.reverse().toString();
    }
}
