package com.course.tasks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task21Test {

    private static final double DELTA = 1e-9;

    @Test
    void constructorSetsAllFields() {
        Task21 c = new Task21(50.45, 30.52);
        assertEquals(50.45, c.getLatitude(), DELTA);
        assertEquals(30.52, c.getLongitude(), DELTA);
    }

    @Test
    void gettersReturnValues() {
        Task21 c = new Task21(-12.34, 78.9);
        assertEquals(-12.34, c.getLatitude(), DELTA);
        assertEquals(78.9, c.getLongitude(), DELTA);
    }

    @Test
    void constructorThrowsOnInvalidLatitude() {
        assertThrows(IllegalArgumentException.class, () -> new Task21(90.0001, 0.0));
        assertThrows(IllegalArgumentException.class, () -> new Task21(-90.0001, 0.0));
    }

    @Test
    void constructorThrowsOnInvalidLongitude() {
        assertThrows(IllegalArgumentException.class, () -> new Task21(0.0, 180.0001));
        assertThrows(IllegalArgumentException.class, () -> new Task21(0.0, -180.0001));
    }

    @Test
    void equalsTrueWhenWithinEpsilon() {
        Task21 a = new Task21(50.0, 30.0);
        Task21 b = new Task21(50.0 + 1e-10, 30.0 - 1e-10);
        assertEquals(a, b);
        assertEquals(a.hashCode(), b.hashCode());
    }

    @Test
    void equalsFalseWhenBeyondEpsilon() {
        Task21 a = new Task21(50.0, 30.0);
        Task21 b = new Task21(50.0 + 1e-6, 30.0);
        assertNotEquals(a, b);
    }

    @Test
    void toStringContainsNameAndValues() {
        Task21 c = new Task21(50.45, 30.52);
        String s = c.toString();
        assertTrue(s.contains("Coordinates"));
        assertTrue(s.contains("50.45"));
        assertTrue(s.contains("30.52"));
    }
}
