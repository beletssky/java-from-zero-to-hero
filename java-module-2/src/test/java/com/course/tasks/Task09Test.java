package com.course.tasks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task09Test {

    private static final double EPS = 1e-9;

    @Test
    void avgArray_basic() {
        assertEquals(2.5, Task09.avgArray(new int[]{1, 2, 3, 4}), EPS);
    }

    @Test
    void avgArray_singleElement() {
        assertEquals(7.0, Task09.avgArray(new int[]{7}), EPS);
    }

    @Test
    void avgArray_throws_forEmpty() {
        assertThrows(IllegalArgumentException.class, () -> Task09.avgArray(new int[]{}));
    }

    @Test
    void avgArray_throws_forNull() {
        assertThrows(IllegalArgumentException.class, () -> Task09.avgArray(null));
    }

    @Test
    void avgArray_negativeAndPositiveCancel() {
        assertEquals(0.0, Task09.avgArray(new int[]{-3, -1, 1, 3}), EPS);
    }
}
