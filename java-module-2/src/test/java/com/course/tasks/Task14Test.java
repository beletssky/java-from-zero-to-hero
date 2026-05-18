package com.course.tasks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task14Test {

    @Test
    void doubleEach_basic() {
        assertArrayEquals(new int[]{2, 4, 6}, Task14.doubleEach(new int[]{1, 2, 3}));
    }

    @Test
    void doubleEach_empty() {
        assertArrayEquals(new int[]{}, Task14.doubleEach(new int[]{}));
    }

    @Test
    void doubleEach_negatives() {
        assertArrayEquals(new int[]{-2, -4, 0}, Task14.doubleEach(new int[]{-1, -2, 0}));
    }

    @Test
    void doubleEach_singleElement() {
        assertArrayEquals(new int[]{20}, Task14.doubleEach(new int[]{10}));
    }
}
