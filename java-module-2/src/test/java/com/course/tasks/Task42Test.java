package com.course.tasks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task42Test {

    @Test
    void rangeArray_ascending() {
        assertArrayEquals(new int[]{0, 2, 4, 6, 8}, Task42.rangeArray(0, 10, 2));
    }

    @Test
    void rangeArray_descending() {
        assertArrayEquals(new int[]{10, 8, 6, 4, 2}, Task42.rangeArray(10, 0, -2));
    }

    @Test
    void rangeArray_throws_forZeroStep() {
        assertThrows(IllegalArgumentException.class, () -> Task42.rangeArray(0, 10, 0));
    }

    @Test
    void rangeArray_wrongDirectionPositiveStep() {
        assertArrayEquals(new int[]{}, Task42.rangeArray(10, 0, 2));
    }

    @Test
    void rangeArray_wrongDirectionNegativeStep() {
        assertArrayEquals(new int[]{}, Task42.rangeArray(0, 10, -2));
    }

    @Test
    void rangeArray_fromEqualsTo() {
        assertArrayEquals(new int[]{}, Task42.rangeArray(5, 5, 1));
    }

    @Test
    void rangeArray_stepLargerThanRange() {
        assertArrayEquals(new int[]{0}, Task42.rangeArray(0, 3, 5));
    }
}
