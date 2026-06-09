package com.course.tasks;

public class Task39 {

    /**
     * Принимает строку ровно из 10 цифр и форматирует её как "(XXX) XXX-XX-XX".
     * Если строка {@code null}, её длина не равна 10 или она содержит
     * не только цифры — IllegalArgumentException.
     * <p>UA: Приймає рядок рівно з 10 цифр і форматує його як "(XXX) XXX-XX-XX".
     * Якщо рядок {@code null}, його довжина не дорівнює 10 або він містить
     * не лише цифри — IllegalArgumentException.
     * Примеры: formatPhoneNumber("0501234567") == "(050) 123-45-67";
     * formatPhoneNumber("9876543210") == "(987) 654-32-10".
     */
    public static String formatPhoneNumber(String digits) {
        // TODO: реализуй
        if (digits == null || digits.length() != 10) {
            throw new IllegalArgumentException();
        }
        for (char x : digits.toCharArray()) {
            if (!Character.isDigit(x)) {
                throw new IllegalArgumentException();
            }
        }

        return "(" +
                digits.substring(0, 3) +
                ") " +
                digits.substring(3, 6) +
                "-" +
                digits.substring(6, 8) +
                "-" +
                digits.substring(8, 10);
    }
}
