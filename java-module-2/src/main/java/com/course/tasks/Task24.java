package com.course.tasks;

import java.util.Arrays;

public class Task24 {

    /**
     * Проверяет, являются ли две строки анаграммами (одинаковый набор букв).
     * Регистр не важен. Пробелы игнорировать.
     * Для любого {@code null} — IllegalArgumentException.
     * Примеры: isAnagram("listen", "silent") == true;
     * isAnagram("hello", "world") == false.
     */
    public static boolean isAnagram(String a, String b) {
        if (a == null || b == null) {
            throw new IllegalArgumentException("NOOO");
        }
        String cleanA = a.toLowerCase().replace(" ", "");
        String cleanB = b.toLowerCase().replace(" ", "");
        if (cleanA.length() != cleanB.length()){
            return false;
        }
        char[] charsA = cleanA.toCharArray();
        char[] charsB = cleanB.toCharArray();
        Arrays.sort(charsA);
        Arrays.sort(charsB);
        return Arrays.equals(charsA, charsB);
    }
}
