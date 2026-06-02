package com.course.tasks;

public class Task35 {

    /**
     * Конвертирует n из 1..50 в римское число (I, V, X, L).
     * Вне диапазона — IllegalArgumentException.
     * Примеры: intToRoman(4) == "IV"; intToRoman(9) == "IX"; intToRoman(40) == "XL"; intToRoman(49) == "XLIX".
     */
    public static String intToRoman(int n) {
        // TODO: реализуй
        if (n < 1 || n > 50) {
            throw new IllegalArgumentException();
        }
        int[] values = {50, 40, 10, 9, 5, 4, 1};
        String[] romanNumerals = {"L", "XL", "X", "IX", "V", "IV", "I"};
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < values.length; i++) {
            while (n >= values[i]) {
                sb.append(romanNumerals[i]);
                n -= values[i];
            }
        }

        return sb.toString();
    }
}
