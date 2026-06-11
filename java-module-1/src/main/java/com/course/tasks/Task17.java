package com.course.tasks;

public class Task17 {

    /**
     * Возвращает сезон по номеру месяца:
     * 12,1,2 → "winter"; 3,4,5 → "spring"; 6,7,8 → "summer"; 9,10,11 → "autumn".
     * Иначе — IllegalArgumentException. Реализовать через switch.
     */
    public static String seasonByMonth(int month) {
        return switch (month) {
            case 12, 1, 2 -> "winter";
            case 3, 4, 5 -> "spring";
            case 6, 7, 8 -> "summer";
            case 9, 10, 11 -> "autumn";
            default -> throw new IllegalArgumentException("pup");
        };
    }
}
