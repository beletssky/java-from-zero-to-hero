package com.course.tasks;

public class Task23 {

    /**
     * Возвращает строку без гласных латинских букв (a, e, i, o, u — в любом регистре).
     * Примеры: removeVowels("Hello World") == "Hll Wrld";
     * removeVowels("AEIOU") == "".
     */
    public static String removeVowels(String s) {
        if (s == null) {
            throw new IllegalArgumentException("NOOO");
        }
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);
            if (currentChar != 'a' && currentChar != 'e' && currentChar != 'i' && currentChar != 'o' && currentChar != 'u' &&currentChar != 'A' && currentChar != 'E' && currentChar != 'I' && currentChar != 'O' && currentChar != 'U'){
            result.append(currentChar);
            }
        }
        return result.toString();
    }
}
