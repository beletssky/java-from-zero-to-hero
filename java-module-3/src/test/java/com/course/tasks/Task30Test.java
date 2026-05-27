package com.course.tasks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task30Test {

    private static final double DELTA = 1e-9;

    @Test
    void constructorSetsAllFields() {
        Task30 m = new Task30("Matrix", 1999, 8.7, 136);
        assertEquals("Matrix", m.getTitle());
        assertEquals(1999, m.getYear());
        assertEquals(8.7, m.getRating(), DELTA);
        assertEquals(136, m.getDurationMinutes());
    }

    @Test
    void gettersReturnValues() {
        Task30 m = new Task30("Inception", 2010, 8.8, 148);
        assertEquals("Inception", m.getTitle());
        assertEquals(2010, m.getYear());
        assertEquals(8.8, m.getRating(), DELTA);
        assertEquals(148, m.getDurationMinutes());
    }

    @Test
    void constructorThrowsOnInvalidRating() {
        assertThrows(IllegalArgumentException.class, () -> new Task30("X", 2000, -0.1, 100));
        assertThrows(IllegalArgumentException.class, () -> new Task30("X", 2000, 10.1, 100));
    }

    @Test
    void constructorThrowsOnInvalidYear() {
        assertThrows(IllegalArgumentException.class, () -> new Task30("X", 1899, 5.0, 100));
        assertThrows(IllegalArgumentException.class, () -> new Task30("X", 2101, 5.0, 100));
    }

    @Test
    void constructorThrowsOnInvalidDuration() {
        assertThrows(IllegalArgumentException.class, () -> new Task30("X", 2000, 5.0, 0));
        assertThrows(IllegalArgumentException.class, () -> new Task30("X", 2000, 5.0, -10));
    }

    @Test
    void equalsAndHashCodeEqualForSameFields() {
        Task30 a = new Task30("Matrix", 1999, 8.7, 136);
        Task30 b = new Task30("Matrix", 1999, 8.7, 136);
        assertEquals(a, b);
        assertEquals(a.hashCode(), b.hashCode());
    }

    @Test
    void equalsFalseForDifferentFields() {
        Task30 a = new Task30("Matrix", 1999, 8.7, 136);
        Task30 b = new Task30("Matrix", 1999, 8.7, 137);
        assertNotEquals(a, b);
    }

    @Test
    void toStringContainsTitleYearRatingOnly() {
        Task30 m = new Task30("Matrix", 1999, 8.7, 136);
        String s = m.toString();
        assertTrue(s.contains("Movie"));
        assertTrue(s.contains("Matrix"));
        assertTrue(s.contains("1999"));
        assertTrue(s.contains("8.7"));
    }
}
