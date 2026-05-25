package com.course.tasks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task16Test {

    @Test
    void secondMax_withDuplicateMax() {
        assertEquals(4, Task16.secondMax(new int[]{1, 3, 5, 5, 4}));
    }

    @Test
    void secondMax_twoElements() {
        assertEquals(1, Task16.secondMax(new int[]{1, 2}));
    }

    @Test
    void secondMax_throws_whenAllSame() {
        assertThrows(IllegalArgumentException.class, () -> Task16.secondMax(new int[]{7, 7, 7}));
    }

    @Test
    void secondMax_throws_forTooShort() {
        assertThrows(IllegalArgumentException.class, () -> Task16.secondMax(new int[]{1}));
    }

    @Test
    void secondMax_throws_forNull() {
        assertThrows(IllegalArgumentException.class, () -> Task16.secondMax(null));
    }

    @Test
    void secondMax_negativeValues() {
        assertEquals(-3, Task16.secondMax(new int[]{-1, -3, -1, -5}));
    }
}
