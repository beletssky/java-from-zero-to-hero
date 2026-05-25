package com.course.tasks;

public class Task14 {

    /**
     * Возвращает короткое название дня недели:
     * 1→"Пн", 2→"Вт", 3→"Ср", 4→"Чт", 5→"Пт", 6→"Сб", 7→"Вс".
     * Иначе — "?". Реализовать через switch.
     */
    public static String dayName(int n) {
        // TODO: реализуй
        return switch (n) {
            case 1 -> "Пн";
            case 2 -> "Вт";
            case 3 -> "Ср";
            case 4 -> "Чт";
            case 5 -> "Пт";
            case 6 -> "Сб";
            case 7 -> "Вс";
            default -> "?";
        };
    }
}
