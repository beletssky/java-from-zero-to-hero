package com.course.tasks;

public class Task10 {

    /**
     * Возвращает true, если год високосный.
     * Год високосный, если делится на 4 и (не делится на 100, или делится на 400).
     * Примеры: isLeapYear(2000) == true; isLeapYear(1900) == false.
     */
    public static boolean isLeapYear(int year) {
        return (year % 4 == 0) && (year % 100 != 0) || ( year % 400 == 0);
    }
}
