package com.course.tasks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task15Test {

    @Test
    void filterPositive_basic() {
        assertArrayEquals(new int[]{2, 4}, Task15.filterPositive(new int[]{-1, 2, -3, 4, 0}));
    }

    @Test
    void filterPositive_empty() {
        assertArrayEquals(new int[]{}, Task15.filterPositive(new int[]{}));
    }

    @Test
    void filterPositive_zeroIsExcluded() {
        assertArrayEquals(new int[]{}, Task15.filterPositive(new int[]{0, 0, 0}));
    }

    @Test
    void filterPositive_allPositive() {
        assertArrayEquals(new int[]{1, 2, 3}, Task15.filterPositive(new int[]{1, 2, 3}));
    }

    @Test
    void filterPositive_allNonPositive() {
        assertArrayEquals(new int[]{}, Task15.filterPositive(new int[]{-1, -2, 0}));
    }
}
