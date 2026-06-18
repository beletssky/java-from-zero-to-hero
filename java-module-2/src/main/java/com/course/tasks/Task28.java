package com.course.tasks;

public class Task28 {

    /**
     * Проверяет, что все символы в строке — цифры. Использовать Character.isDigit().
     * Пустая строка и {@code null} — false.
     * Примеры: isDigitOnly("12345") == true; isDigitOnly("12a4") == false;
     *          isDigitOnly("") == false; isDigitOnly(null) == false.
     */
    public static boolean isDigitOnly(String s) {
        if (s == null || s.isEmpty()) {
            return false;
        }
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (!Character.isDigit(c)) {
                return false;
            }
        }
        return true;
    }
}
