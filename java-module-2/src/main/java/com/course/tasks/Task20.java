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
            throw new IllegalArgumentException("NOOO");
        }
        StringBuilder sb = new StringBuilder();
        for (int i = s.length() - 1; i >= 0; i--) {
            char currentLetter = s.charAt(i);
            sb.append(currentLetter);
        }
        String reversedString = sb.toString();
        if (s.equals(reversedString))
        {
            return true;
        }else{
            return false;
        }

    }
}
