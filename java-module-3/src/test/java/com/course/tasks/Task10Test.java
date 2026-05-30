package com.course.tasks;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Task10Test {

    @Test
    void constructor_setsAllFields() {
        Task10 r = new Task10(1, 10);
        assertEquals(1, r.getFrom());
        assertEquals(10, r.getTo());
    }

    @Test
    void getters_returnValues() {
        Task10 r = new Task10(-5, 5);
        assertEquals(-5, r.getFrom());
        assertEquals(5, r.getTo());
    }

    @Test
    void contains_returnsTrueInsideAndBounds() {
        Task10 r = new Task10(1, 10);
        assertTrue(r.contains(1));
        assertTrue(r.contains(5));
        assertTrue(r.contains(10));
        assertFalse(r.contains(0));
        assertFalse(r.contains(11));
    }

    @Test
    void length_returnsToMinusFrom() {
        Task10 r = new Task10(1, 10);
        assertEquals(9, r.length());
    }

    @Test
    void constructor_throwsForFromGreaterThanTo() {
        assertThrows(IllegalArgumentException.class, () -> new Task10(10, 1));
    }

    @Test
    void equals_returnsTrue_forSameValues() {
        Task10 a = new Task10(1, 10);
        Task10 b = new Task10(1, 10);
        assertEquals(a, b);
        assertEquals(a.hashCode(), b.hashCode());
    }

    @Test
    void equals_returnsFalse_forDifferent() {
        Task10 a = new Task10(1, 10);
        Task10 b = new Task10(1, 11);
        assertNotEquals(a, b);
    }

    @Test
    void toString_containsNameAndFields() {
        String s = new Task10(1, 10).toString();
        assertTrue(s.contains("Range"));
        assertTrue(s.contains("1"));
        assertTrue(s.contains("10"));
    }
}
