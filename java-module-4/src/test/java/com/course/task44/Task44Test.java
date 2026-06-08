package com.course.task44;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Task44Test {

    @Test
    void isWeekendFalseForWeekdays() {
        Schedule schedule = new Schedule();
        assertFalse(schedule.isWeekend(Day.MON));
        assertFalse(schedule.isWeekend(Day.TUE));
        assertFalse(schedule.isWeekend(Day.WED));
        assertFalse(schedule.isWeekend(Day.THU));
        assertFalse(schedule.isWeekend(Day.FRI));
    }

    @Test
    void isWeekendTrueForSaturdayAndSunday() {
        Schedule schedule = new Schedule();
        assertTrue(schedule.isWeekend(Day.SAT));
        assertTrue(schedule.isWeekend(Day.SUN));
    }

    @Test
    void workHoursEightForWeekdays() {
        Schedule schedule = new Schedule();
        assertEquals(8, schedule.workHours(Day.MON));
        assertEquals(8, schedule.workHours(Day.TUE));
        assertEquals(8, schedule.workHours(Day.WED));
        assertEquals(8, schedule.workHours(Day.THU));
        assertEquals(8, schedule.workHours(Day.FRI));
    }

    @Test
    void workHoursFourForSaturdayAndZeroForSunday() {
        Schedule schedule = new Schedule();
        assertEquals(4, schedule.workHours(Day.SAT));
        assertEquals(0, schedule.workHours(Day.SUN));
    }

    @Test
    void totalWorkHoursAcrossWeekIs44() {
        Schedule schedule = new Schedule();
        int total = 0;
        for (Day d : Day.values()) {
            total += schedule.workHours(d);
        }
        assertEquals(44, total);
    }
}
