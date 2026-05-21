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
        if (a == null || b == null){
            throw new IllegalArgumentException();
        }

        if (a.isBlank() && b.isBlank()){
            return true;
        }

        char [] aArray = a.toLowerCase().replace(" ", "").toCharArray();
        char [] bArray = b.toLowerCase().replace(" ", "").toCharArray();

        if (aArray.length != bArray.length){
            return false;
        }

        Arrays.sort(aArray);
        Arrays.sort(bArray);


        return Arrays.equals(aArray, bArray);




    }
}
