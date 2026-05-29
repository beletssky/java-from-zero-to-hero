package com.course.tasks;

public class Task19 {
    /**
     * Возвращает строку, перевёрнутую посимвольно. Использовать StringBuilder или цикл.
     * Для {@code null} — IllegalArgumentException.
     * Примеры: reverseString("hello") == "olleh"; reverseString("") == "".
     */
    public static String reverseString(String s) {
        if (s == null) {
            throw new IllegalArgumentException("Кола Зиро а ты далбае");
        }

        StringBuilder sb = new StringBuilder();

        for (int i = s.length() - 1; i >= 0; i--) {
            sb.append(s.charAt(i));
        }

        return sb.toString();
    }
}