package com.course.tasks;

public class Task20 {
    /**
     * Проверяет, является ли строка палиндромом (с учётом регистра, без пробелов).
     * Пустая строка и строка из одного символа — палиндром.
     * Примеры: isPalindromeString("level") == true; isPalindromeString("hello") == false;
     * isPalindromeString("") == true; isPalindromeString("a") == true.
     */
    public static boolean isPalindromeString(String s) {

        if (s == null) {
            throw new IllegalArgumentException("");
        }

        String reversed =  new StringBuilder(s).reverse().toString();

        return s.equals(reversed);
    }
}