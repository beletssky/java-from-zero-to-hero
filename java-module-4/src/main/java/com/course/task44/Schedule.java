package com.course.task44;

/**
 * Рабочее расписание недели.
 * Определяет выходные и количество рабочих часов по дню.
 */
public class Schedule {

    public boolean isWeekend(Day d) {
        // TODO: реализуй
        return d == Day.SAT || d == Day.SUN;
    }

    public int workHours(Day d) {
        // TODO: реализуй
        return switch (d) {
            case SAT -> 4;
            case SUN -> 0;
            default -> 8;
        };
    }
}
