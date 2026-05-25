package com.course.tasks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task08Test {

    @Test
    void minArray_basic() {
        assertEquals(1, Task08.minArray(new int[]{3, 1, 4, 1, 5}));
    }

    @Test
    void minArray_allPositives() {
        assertEquals(2, Task08.minArray(new int[]{7, 2, 5, 9}));
    }

    @Test
    void minArray_throws_forEmpty() {
        assertThrows(IllegalArgumentException.class, () -> Task08.minArray(new int[]{}));
    }

    @Test
    void minArray_throws_forNull() {
        assertThrows(IllegalArgumentException.class, () -> Task08.minArray(null));
    }

    @Test
    void minArray_withNegatives() {
        assertEquals(-10, Task08.minArray(new int[]{-5, -1, -10, 0, 4}));
    }
}
