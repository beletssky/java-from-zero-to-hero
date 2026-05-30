package com.course.tasks;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Task02Test {

    @Test
    void constructor_setsAllFields() {
        Task02 c = new Task02(255, 128, 0);
        assertEquals(255, c.getR());
        assertEquals(128, c.getG());
        assertEquals(0, c.getB());
    }

    @Test
    void getters_returnValues() {
        Task02 c = new Task02(10, 20, 30);
        assertEquals(10, c.getR());
        assertEquals(20, c.getG());
        assertEquals(30, c.getB());
    }

    @Test
    void constructor_throwsForNegativeComponent() {
        assertThrows(IllegalArgumentException.class, () -> new Task02(-1, 0, 0));
    }

    @Test
    void constructor_throwsForTooLargeComponent() {
        assertThrows(IllegalArgumentException.class, () -> new Task02(0, 256, 0));
        assertThrows(IllegalArgumentException.class, () -> new Task02(0, 0, 300));
    }

    @Test
    void equals_returnsTrue_forSameValues() {
        Task02 a = new Task02(255, 128, 0);
        Task02 b = new Task02(255, 128, 0);
        assertEquals(a, b);
        assertEquals(a.hashCode(), b.hashCode());
    }

    @Test
    void equals_returnsFalse_forDifferent() {
        Task02 a = new Task02(255, 128, 0);
        Task02 b = new Task02(0, 128, 255);
        assertNotEquals(a, b);
    }

    @Test
    void toString_containsNameAndFields() {
        String s = new Task02(255, 128, 0).toString();
        assertTrue(s.contains("Color"));
        assertTrue(s.contains("255"));
        assertTrue(s.contains("128"));
        assertTrue(s.contains("0"));
    }
}
