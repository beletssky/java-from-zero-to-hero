package com.course.tasks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task44Test {

    @Test
    void runLengthEncode_basic() {
        assertArrayEquals(new int[]{1, 2, 2, 1, 3, 3},
                Task44.runLengthEncode(new int[]{1, 1, 2, 3, 3, 3}));
    }

    @Test
    void runLengthEncode_empty() {
        assertArrayEquals(new int[]{}, Task44.runLengthEncode(new int[]{}));
    }

    @Test
    void runLengthEncode_single() {
        assertArrayEquals(new int[]{5, 1}, Task44.runLengthEncode(new int[]{5}));
    }

    @Test
    void runLengthEncode_allSame() {
        assertArrayEquals(new int[]{7, 3}, Task44.runLengthEncode(new int[]{7, 7, 7}));
    }

    @Test
    void runLengthEncode_allDistinct() {
        assertArrayEquals(new int[]{1, 1, 2, 1, 3, 1},
                Task44.runLengthEncode(new int[]{1, 2, 3}));
    }
}
