package com.course.tasks;

public class Task23 {

    /**
     * Возвращает строку без гласных латинских букв (a, e, i, o, u — в любом регистре).
     * Примеры: removeVowels("Hello World") == "Hll Wrld";
     * removeVowels("AEIOU") == "".
     */
    public static String removeVowels(String s) {
        // TODO: реализуй
        if (s == null) {
            return "";
        }
//        StringBuilder result = new StringBuilder();
//        String vowels = "aeiouAEIOU";
//        for (int i = 0; i < s.length(); i++) {
//            char currentChar = s.charAt(i);
//            if (vowels.indexOf(currentChar) == -1) {
//                result.append(currentChar);
//            }
//        }
//        return result.toString();
        s = s.replaceAll("(?i)[aeiou]", "");
        return s;

    }

}

