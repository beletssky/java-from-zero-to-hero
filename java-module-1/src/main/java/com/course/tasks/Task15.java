package com.course.tasks;

public class Task15 {

    /**
     * Возвращает количество дней в месяце (1..12).
     * Февраль: leap == true → 29, иначе 28. Невалидный месяц — -1.
     * Реализовать через switch.
     */
    public static int daysInMonth(int month, boolean leap) {
        switch (month) {
            case 1, 3, 5, 7, 8, 10, 12:
                return 31;

            case 4, 6, 9, 11:
                return 30;

            case 2:
                if (leap) {
                    return 29;
                } else {
                    return 28;
                }
            default:
                return -1;
        }
    }
}
