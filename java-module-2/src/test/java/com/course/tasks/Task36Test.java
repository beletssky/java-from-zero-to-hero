package com.course.tasks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task36Test {

    @Test
    void minMaxAvg_basic() {
        assertArrayEquals(new int[]{1, 5, 3}, Task36.minMaxAvg(new int[]{3, 1, 5, 2, 4}));
    }

    @Test
    void minMaxAvg_singleElement() {
        assertArrayEquals(new int[]{10, 10, 10}, Task36.minMaxAvg(new int[]{10}));
    }

    @Test
    void minMaxAvg_negativeNumbers() {
        assertArrayEquals(new int[]{-5, -1, -3}, Task36.minMaxAvg(new int[]{-5, -1, -3}));
    }

    @Test
    void minMaxAvg_avgRoundsHalfUp() {
        // sum = 10, count = 4, avg = 2.5 -> Math.round = 3
        assertArrayEquals(new int[]{1, 4, 3}, Task36.minMaxAvg(new int[]{1, 2, 3, 4}));
    }

    @Test
    void minMaxAvg_throws_forNull() {
        assertThrows(IllegalArgumentException.class, () -> Task36.minMaxAvg(null));
    }

    @Test
    void minMaxAvg_throws_forEmpty() {
        assertThrows(IllegalArgumentException.class, () -> Task36.minMaxAvg(new int[]{}));
    }
}
