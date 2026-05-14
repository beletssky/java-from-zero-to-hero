package com.course.tasks;

public class Task15 {

    /**
     * Возвращает количество дней в месяце (1..12).
     * Февраль: leap == true → 29, иначе 28. Невалидный месяц — -1.
     * Реализовать через switch.
     */
    public static int daysInMonth(int month, boolean leap) {
        switch (month){
            case 1:
                return 31;
            case 2:
                if (leap==true){
                    return 29;
                }
                return 28;
            case 3:
                return 31;
            case 4:
                return 30;
            case 5:
                return 31;
            case 6:
                return 30;
            case 7:
                return 31;
            case 8:
                return 31;
            case 9:
                return 30;
            case 10:
                return 31;
            case 11:
                return 30;
            case 12:
                return 31;
            default:
                return -1;
    }
}
}