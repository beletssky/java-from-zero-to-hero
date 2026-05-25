package com.course.tasks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task07Test {

    @Test
    void maxArray_basic() {
        assertEquals(9, Task07.maxArray(new int[]{3, 1, 4, 1, 5, 9, 2, 6}));
    }

    @Test
    void maxArray_allNegatives() {
        assertEquals(-1, Task07.maxArray(new int[]{-5, -1, -10}));
    }

    @Test
    void maxArray_throws_forEmpty() {
        assertThrows(IllegalArgumentException.class, () -> Task07.maxArray(new int[]{}));
    }

    @Test
    void maxArray_throws_forNull() {
        assertThrows(IllegalArgumentException.class, () -> Task07.maxArray(null));
    }

    @Test
    void maxArray_singleElement() {
        assertEquals(42, Task07.maxArray(new int[]{42}));
    }
}
