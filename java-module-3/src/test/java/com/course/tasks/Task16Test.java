package com.course.tasks;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Task16Test {

    @Test
    void constructor_setsAllFields() {
        Task16 t = new Task16(9, 5);
        assertEquals(9, t.getHours());
        assertEquals(5, t.getMinutes());
    }

    @Test
    void setHours_updatesValue() {
        Task16 t = new Task16(9, 5);
        t.setHours(14);
        assertEquals(14, t.getHours());
    }

    @Test
    void setMinutes_updatesValue() {
        Task16 t = new Task16(9, 5);
        t.setMinutes(40);
        assertEquals(40, t.getMinutes());
    }

    @Test
    void constructor_throwsForInvalidHours() {
        assertThrows(IllegalArgumentException.class, () -> new Task16(24, 0));
    }

    @Test
    void setMinutes_throwsForInvalid() {
        Task16 t = new Task16(9, 5);
        assertThrows(IllegalArgumentException.class, () -> t.setMinutes(60));
    }

    @Test
    void addMinutes_advancesTime() {
        Task16 t = new Task16(9, 5);
        t.addMinutes(30);
        assertEquals(9, t.getHours());
        assertEquals(35, t.getMinutes());
    }

    @Test
    void addMinutes_wrapsOverMidnight() {
        Task16 t = new Task16(23, 50);
        t.addMinutes(20);
        assertEquals(0, t.getHours());
        assertEquals(10, t.getMinutes());
    }

    @Test
    void addMinutes_handlesLargeValue() {
        Task16 t = new Task16(0, 0);
        t.addMinutes(1500); // 25 hours -> 01:00
        assertEquals(1, t.getHours());
        assertEquals(0, t.getMinutes());
    }

    @Test
    void equals_returnsTrue_forSameValues() {
        Task16 a = new Task16(9, 5);
        Task16 b = new Task16(9, 5);
        assertEquals(a, b);
        assertEquals(a.hashCode(), b.hashCode());
    }

    @Test
    void equals_returnsFalse_forDifferentValues() {
        Task16 a = new Task16(9, 5);
        Task16 b = new Task16(10, 5);
        assertNotEquals(a, b);
    }

    @Test
    void toString_returnsFormattedTime() {
        Task16 t = new Task16(9, 5);
        assertEquals("09:05", t.toString());
        assertTrue(t.toString().contains(":"));
    }
}
