package com.course.tasks;

public class Task28 {

    /**
     * Проверяет, что все символы в строке — цифры. Использовать Character.isDigit().
     * Пустая строка и {@code null} — false.
     * Примеры: isDigitOnly("12345") == true; isDigitOnly("12a4") == false;
     * isDigitOnly("") == false; isDigitOnly(null) == false.
     */
    public static boolean isDigitOnly(String s) {
        // TODO: реализуй
        if (s == null || s.isEmpty()) {
            return false;
        }
        char[] a = s.toCharArray();
        for (char x : a) {
            if (!Character.isDigit(x)) {
                return false;
            }
        }
        return true;

    }
}
