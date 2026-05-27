package com.course.tasks;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Task05Test {

    @Test
    void constructor_setsAllFields() {
        Task05 c = new Task05(2.0);
        assertEquals(2.0, c.getRadius(), 1e-9);
    }

    @Test
    void getter_returnsValue() {
        Task05 c = new Task05(5.5);
        assertEquals(5.5, c.getRadius(), 1e-9);
    }

    @Test
    void area_returnsPiRadiusSquared() {
        Task05 c = new Task05(2.0);
        assertEquals(Math.PI * 4.0, c.area(), 1e-9);
    }

    @Test
    void constructor_throwsForNonPositiveRadius() {
        assertThrows(IllegalArgumentException.class, () -> new Task05(0.0));
        assertThrows(IllegalArgumentException.class, () -> new Task05(-3.0));
    }

    @Test
    void equals_returnsTrue_forSameValues() {
        Task05 a = new Task05(2.0);
        Task05 b = new Task05(2.0);
        assertEquals(a, b);
        assertEquals(a.hashCode(), b.hashCode());
    }

    @Test
    void equals_returnsFalse_forDifferent() {
        Task05 a = new Task05(2.0);
        Task05 b = new Task05(3.0);
        assertNotEquals(a, b);
    }

    @Test
    void toString_containsNameAndFields() {
        String s = new Task05(2.0).toString();
        assertTrue(s.contains("Circle"));
        assertTrue(s.contains("2"));
    }
}
