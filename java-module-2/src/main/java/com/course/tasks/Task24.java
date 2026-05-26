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
        // TODO: реализуй
        if (a == null || b == null) {
            throw new IllegalArgumentException();
        }
        char[] a1 = a.replaceAll("\\s+", "").toLowerCase().toCharArray();
        char[] b1 = b.replaceAll("\\s+", "").toLowerCase().toCharArray();
        Arrays.sort(a1);
        Arrays.sort(b1);
        return Arrays.equals(a1, b1);

    }
}
