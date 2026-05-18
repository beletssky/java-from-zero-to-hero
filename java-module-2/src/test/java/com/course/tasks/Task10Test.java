package com.course.tasks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task10Test {

    @Test
    void indexOf_returnsFirstOccurrence() {
        assertEquals(1, Task10.indexOf(new int[]{5, 7, 9, 7}, 7));
    }

    @Test
    void indexOf_returnsMinusOne_whenNotFound() {
        assertEquals(-1, Task10.indexOf(new int[]{1, 2}, 99));
    }

    @Test
    void indexOf_emptyArray_returnsMinusOne() {
        assertEquals(-1, Task10.indexOf(new int[]{}, 0));
    }

    @Test
    void indexOf_throws_forNull() {
        assertThrows(IllegalArgumentException.class, () -> Task10.indexOf(null, 1));
    }

    @Test
    void indexOf_atZeroIndex() {
        assertEquals(0, Task10.indexOf(new int[]{4, 5, 6}, 4));
    }
}
