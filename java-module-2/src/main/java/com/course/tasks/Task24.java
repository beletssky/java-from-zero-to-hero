package com.course.tasks;

import java.util.Arrays;

public class Task24 {
    /**
     * Проверяет, являются ли две строки анаграммами (одинаковый набор букв).
     * Регистр не важен. Пробелы игнорировать.
     * Для любого {@code null} — IllegalArgumentException.
     * Примеры: isAnagram("listen", "silent") == true;
     *          isAnagram("hello", "world") == false.
     */
    public static boolean isAnagram(String a, String b) {
        if (a == null || b == null) {
            throw new IllegalArgumentException("");
        }

        String cleanA = a.toLowerCase().replace(" ", "");
        String cleanB = b.toLowerCase().replace(" ", "");

        char[] arrA = cleanA.toCharArray();
        char[] arrB = cleanB.toCharArray();
        Arrays.sort(arrA);
        Arrays.sort(arrB);

        return Arrays.equals(arrA, arrB);
    }
}