package com.course.tasks;

public class Task15 {

    /**
     * Возвращает количество дней в месяце (1..12).
     * Февраль: leap == true → 29, иначе 28. Невалидный месяц — -1.
     * Реализовать через switch.
     */
    public static int daysInMonth(int month, boolean leap) {
        // TODO: реализуй
        return switch (month) {
            case 1, 3, 5, 7, 8, 10, 12 -> 31;
            case 4, 6, 9, 11 -> 30;
            case 2 -> leap ? 29 : 28;
            default -> -1;
        };
    }
}
