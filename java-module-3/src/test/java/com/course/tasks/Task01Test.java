package com.course.tasks;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Task01Test {

    @Test
    void constructor_setsAllFields() {
        Task01 p = new Task01(3, 4);
        assertEquals(3, p.getX());
        assertEquals(4, p.getY());
    }

    @Test
    void getters_returnValues() {
        Task01 p = new Task01(-5, 10);
        assertEquals(-5, p.getX());
        assertEquals(10, p.getY());
    }

    @Test
    void equals_returnsTrue_forSameValues() {
        Task01 a = new Task01(3, 4);
        Task01 b = new Task01(3, 4);
        assertEquals(a, b);
        assertEquals(a.hashCode(), b.hashCode());
    }

    @Test
    void equals_returnsFalse_forDifferent() {
        Task01 a = new Task01(3, 4);
        Task01 b = new Task01(4, 3);
        assertNotEquals(a, b);
    }

    @Test
    void differentPoints_areNotEqual() {
        Task01 a = new Task01(0, 0);
        Task01 b = new Task01(1, 1);
        assertNotEquals(a, b);
    }

    @Test
    void toString_containsNameAndFields() {
        String s = new Task01(3, 4).toString();
        assertTrue(s.contains("Point"));
        assertTrue(s.contains("3"));
        assertTrue(s.contains("4"));
    }
}
