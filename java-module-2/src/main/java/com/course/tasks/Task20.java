package com.course.tasks;

public class Task20 {

    /**
     * Проверяет, является ли строка палиндромом (с учётом регистра, без пробелов).
     * Пустая строка и строка из одного символа — палиндром.
     * Примеры: isPalindromeString("level") == true; isPalindromeString("hello") == false;
     *          isPalindromeString("") == true; isPalindromeString("a") == true.
     */
    public static boolean isPalindromeString(String s) {
        if (s.length() <= 1){
            return true;
        }
        char[] palindrom = s.toCharArray();
        int j = palindrom.length - 1;
        for (int i = 0; i < j; i++){
            if (palindrom[i] != palindrom[j]){
                return false;
            }
            j--;
        }
        return true;
    }
}
