package com.course.tasks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task29Test {

    @Test
    void findMax_ignoresNulls() {
        assertEquals(Integer.valueOf(5), Task29.findMax(new Integer[]{1, null, 5, 3}));
    }

    @Test
    void findMax_allNullsReturnsNull() {
        assertNull(Task29.findMax(new Integer[]{null, null}));
    }

    @Test
    void findMax_firstNullsReturnsNumber() {
        assertEquals(Integer.valueOf(1), Task29.findMax(new Integer[]{null, 1}));
    }

    @Test
    void findMax_emptyReturnsNull() {
        assertNull(Task29.findMax(new Integer[]{}));
    }

    @Test
    void findMax_throws_forNullArray() {
        assertThrows(IllegalArgumentException.class, () -> Task29.findMax(null));
    }

    @Test
    void findMax_singleElement() {
        assertEquals(Integer.valueOf(42), Task29.findMax(new Integer[]{42}));
    }

    @Test
    void findMax_negativeValues() {
        assertEquals(Integer.valueOf(-1), Task29.findMax(new Integer[]{-5, null, -1, -3}));
    }
}
