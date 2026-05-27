package com.course.tasks;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Task35Test {

    @Test
    void winterMonths() {
        Task35 t = new Task35();
        assertEquals(Task35.Season.WINTER, t.seasonByMonth(12));
        assertEquals(Task35.Season.WINTER, t.seasonByMonth(1));
        assertEquals(Task35.Season.WINTER, t.seasonByMonth(2));
    }

    @Test
    void springMonths() {
        Task35 t = new Task35();
        assertEquals(Task35.Season.SPRING, t.seasonByMonth(3));
        assertEquals(Task35.Season.SPRING, t.seasonByMonth(4));
        assertEquals(Task35.Season.SPRING, t.seasonByMonth(5));
    }

    @Test
    void summerMonths() {
        Task35 t = new Task35();
        assertEquals(Task35.Season.SUMMER, t.seasonByMonth(6));
        assertEquals(Task35.Season.SUMMER, t.seasonByMonth(7));
        assertEquals(Task35.Season.SUMMER, t.seasonByMonth(8));
    }

    @Test
    void autumnMonths() {
        Task35 t = new Task35();
        assertEquals(Task35.Season.AUTUMN, t.seasonByMonth(9));
        assertEquals(Task35.Season.AUTUMN, t.seasonByMonth(10));
        assertEquals(Task35.Season.AUTUMN, t.seasonByMonth(11));
    }

    @Test
    void invalidMonthsThrow() {
        Task35 t = new Task35();
        assertThrows(IllegalArgumentException.class, () -> t.seasonByMonth(0));
        assertThrows(IllegalArgumentException.class, () -> t.seasonByMonth(13));
    }

    @Test
    void twoInstancesAreEqual() {
        assertEquals(new Task35(), new Task35());
    }

    @Test
    void toStringContainsPrefix() {
        assertTrue(new Task35().toString().contains("Task35"));
    }
}
