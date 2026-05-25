package com.course.tasks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task40Test {

    @Test
    void mergeSortedArrays_basic() {
        assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6},
                Task40.mergeSortedArrays(new int[]{1, 3, 5}, new int[]{2, 4, 6}));
    }

    @Test
    void mergeSortedArrays_firstEmpty() {
        assertArrayEquals(new int[]{1, 2}, Task40.mergeSortedArrays(new int[]{}, new int[]{1, 2}));
    }

    @Test
    void mergeSortedArrays_withDuplicates() {
        assertArrayEquals(new int[]{1, 2, 2, 3, 3},
                Task40.mergeSortedArrays(new int[]{2, 3}, new int[]{1, 2, 3}));
    }

    @Test
    void mergeSortedArrays_bothEmpty() {
        assertArrayEquals(new int[]{}, Task40.mergeSortedArrays(new int[]{}, new int[]{}));
    }

    @Test
    void mergeSortedArrays_throws_forNullFirst() {
        assertThrows(IllegalArgumentException.class,
                () -> Task40.mergeSortedArrays(null, new int[]{1, 2}));
    }

    @Test
    void mergeSortedArrays_throws_forNullSecond() {
        assertThrows(IllegalArgumentException.class,
                () -> Task40.mergeSortedArrays(new int[]{1, 2}, null));
    }
}
