package com.course.tasks;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Task04Test {

    @Test
    void constructor_setsAllFields() {
        Task04 r = new Task04(3.0, 4.0);
        assertEquals(3.0, r.getWidth(), 1e-9);
        assertEquals(4.0, r.getHeight(), 1e-9);
    }

    @Test
    void getters_returnValues() {
        Task04 r = new Task04(2.5, 5.0);
        assertEquals(2.5, r.getWidth(), 1e-9);
        assertEquals(5.0, r.getHeight(), 1e-9);
    }

    @Test
    void area_returnsWidthTimesHeight() {
        Task04 r = new Task04(3.0, 4.0);
        assertEquals(12.0, r.area(), 1e-9);
    }

    @Test
    void constructor_throwsForNonPositiveWidth() {
        assertThrows(IllegalArgumentException.class, () -> new Task04(0.0, 4.0));
    }

    @Test
    void constructor_throwsForNonPositiveHeight() {
        assertThrows(IllegalArgumentException.class, () -> new Task04(3.0, -1.0));
    }

    @Test
    void equals_returnsTrue_forSameValues() {
        Task04 a = new Task04(3.0, 4.0);
        Task04 b = new Task04(3.0, 4.0);
        assertEquals(a, b);
        assertEquals(a.hashCode(), b.hashCode());
    }

    @Test
    void equals_returnsFalse_forDifferent() {
        Task04 a = new Task04(3.0, 4.0);
        Task04 b = new Task04(4.0, 3.0);
        assertNotEquals(a, b);
    }

    @Test
    void toString_containsNameAndFields() {
        String s = new Task04(3.0, 4.0).toString();
        assertTrue(s.contains("Rectangle"));
        assertTrue(s.contains("3"));
        assertTrue(s.contains("4"));
    }
}
