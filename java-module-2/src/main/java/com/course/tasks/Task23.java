package com.course.tasks;

public class Task23 {
    /**
     * Возвращает строку без гласных латинских букв (a, e, i, o, u — в любом регистре).
     * Примеры: removeVowels("Hello World") == "Hll Wrld";
     *          removeVowels("AEIOU") == "".
     */
    public static String removeVowels(String s) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if ("aeiouAEIOU".indexOf(c) == -1) {
                sb.append(c);
            }
        }
        return sb.toString();
    }
}