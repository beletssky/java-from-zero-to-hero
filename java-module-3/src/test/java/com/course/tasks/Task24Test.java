package com.course.tasks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task24Test {

    @Test
    void constructorSetsAllFields() {
        Task24 v = new Task24(1, 2, 3);
        assertEquals(1, v.getMajor());
        assertEquals(2, v.getMinor());
        assertEquals(3, v.getPatch());
    }

    @Test
    void gettersReturnValues() {
        Task24 v = new Task24(10, 0, 5);
        assertEquals(10, v.getMajor());
        assertEquals(0, v.getMinor());
        assertEquals(5, v.getPatch());
    }

    @Test
    void constructorThrowsOnNegativeComponent() {
        assertThrows(IllegalArgumentException.class, () -> new Task24(-1, 0, 0));
        assertThrows(IllegalArgumentException.class, () -> new Task24(0, -1, 0));
        assertThrows(IllegalArgumentException.class, () -> new Task24(0, 0, -1));
    }

    @Test
    void isNewerThanReturnsTrueWhenGreater() {
        assertTrue(new Task24(2, 0, 0).isNewerThan(new Task24(1, 9, 9)));
        assertTrue(new Task24(1, 2, 0).isNewerThan(new Task24(1, 1, 9)));
        assertTrue(new Task24(1, 1, 2).isNewerThan(new Task24(1, 1, 1)));
    }

    @Test
    void isNewerThanReturnsFalseWhenOlderOrEqual() {
        assertFalse(new Task24(1, 1, 1).isNewerThan(new Task24(2, 0, 0)));
        assertFalse(new Task24(1, 2, 3).isNewerThan(new Task24(1, 2, 3)));
    }

    @Test
    void equalsAndHashCodeEqualForSameVersion() {
        Task24 a = new Task24(1, 2, 3);
        Task24 b = new Task24(1, 2, 3);
        assertEquals(a, b);
        assertEquals(a.hashCode(), b.hashCode());
    }

    @Test
    void equalsFalseForDifferentVersion() {
        assertNotEquals(new Task24(1, 2, 3), new Task24(1, 2, 4));
    }

    @Test
    void toStringFormatsAsDottedNumbers() {
        assertEquals("1.2.3", new Task24(1, 2, 3).toString());
    }
}
