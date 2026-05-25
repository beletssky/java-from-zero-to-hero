package com.course.tasks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task06Test {

    @Test
    void sumArray_basic() {
        assertEquals(6, Task06.sumArray(new int[]{1, 2, 3}));
    }

    @Test
    void sumArray_returnsZero_forEmptyArray() {
        assertEquals(0, Task06.sumArray(new int[]{}));
    }

    @Test
    void sumArray_throws_forNull() {
        assertThrows(IllegalArgumentException.class, () -> Task06.sumArray(null));
    }

    @Test
    void sumArray_withNegatives() {
        assertEquals(-1, Task06.sumArray(new int[]{-5, 2, 2}));
    }

    @Test
    void sumArray_singleElement() {
        assertEquals(42, Task06.sumArray(new int[]{42}));
    }
}
