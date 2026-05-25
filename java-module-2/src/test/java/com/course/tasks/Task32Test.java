package com.course.tasks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task32Test {

    @Test
    void removeDuplicates_basic() {
        assertArrayEquals(new int[]{1, 2, 3, 4},
                Task32.removeDuplicates(new int[]{1, 2, 1, 3, 2, 4}));
    }

    @Test
    void removeDuplicates_empty() {
        assertArrayEquals(new int[]{}, Task32.removeDuplicates(new int[]{}));
    }

    @Test
    void removeDuplicates_allUnique() {
        assertArrayEquals(new int[]{1, 2, 3}, Task32.removeDuplicates(new int[]{1, 2, 3}));
    }

    @Test
    void removeDuplicates_allSame() {
        assertArrayEquals(new int[]{7}, Task32.removeDuplicates(new int[]{7, 7, 7, 7}));
    }

    @Test
    void removeDuplicates_preservesFirstOccurrenceOrder() {
        assertArrayEquals(new int[]{5, 1, 2, 3},
                Task32.removeDuplicates(new int[]{5, 1, 5, 2, 1, 3, 2}));
    }
}
