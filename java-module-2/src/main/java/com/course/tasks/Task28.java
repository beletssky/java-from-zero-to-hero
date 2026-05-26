package com.course.tasks;

public class Task28 {

    /**
     * Проверяет, что все символы в строке — цифры. Использовать Character.isDigit().
     * Пустая строка и {@code null} — false.
     * Примеры: isDigitOnly("12345") == true; isDigitOnly("12a4") == false;
     *          isDigitOnly("") == false; isDigitOnly(null) == false.
     */
    public static boolean isDigitOnly(String s) {
        boolean digits = true;
        try {

            Integer.parseInt(s);

        } catch (NumberFormatException exception) {

            System.out.println("exception caught");

            return false;
        }

        return  digits;
    }
}
