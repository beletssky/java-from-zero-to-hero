package com.course.tasks;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Task32Test {

    @Test
    void constructorSetsDay() {
        Task32 t = new Task32(Task32.Day.MON);
        assertEquals(Task32.Day.MON, t.getDay());
    }

    @Test
    void getterReturnsDay() {
        Task32 t = new Task32(Task32.Day.FRI);
        assertEquals(Task32.Day.FRI, t.getDay());
    }

    @Test
    void isWeekendTrueForSaturday() {
        assertTrue(new Task32(Task32.Day.SAT).isWeekend());
    }

    @Test
    void isWeekendTrueForSunday() {
        assertTrue(new Task32(Task32.Day.SUN).isWeekend());
    }

    @Test
    void isWeekendFalseForWeekdays() {
        assertFalse(new Task32(Task32.Day.MON).isWeekend());
        assertFalse(new Task32(Task32.Day.WED).isWeekend());
        assertFalse(new Task32(Task32.Day.FRI).isWeekend());
    }

    @Test
    void equalsAndNotEquals() {
        Task32 a = new Task32(Task32.Day.SAT);
        Task32 b = new Task32(Task32.Day.SAT);
        Task32 c = new Task32(Task32.Day.MON);
        assertEquals(a, b);
        assertNotEquals(a, c);
    }

    @Test
    void toStringContainsPrefixAndDay() {
        String s = new Task32(Task32.Day.SAT).toString();
        assertTrue(s.contains("Task32"));
        assertTrue(s.contains("SAT"));
    }
}
