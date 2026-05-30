package com.course.tasks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task38Test {

    @Test
    void countDigitFrequency_basic() {
        assertArrayEquals(new int[]{0, 2, 2, 2, 0, 0, 0, 0, 0, 0},
                Task38.countDigitFrequency(112233));
    }

    @Test
    void countDigitFrequency_zero() {
        assertArrayEquals(new int[]{1, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                Task38.countDigitFrequency(0));
    }

    @Test
    void countDigitFrequency_ignoresSign() {
        assertArrayEquals(new int[]{0, 1, 1, 1, 0, 0, 0, 0, 0, 0},
                Task38.countDigitFrequency(-123));
    }

    @Test
    void countDigitFrequency_allDigitsOnce() {
        assertArrayEquals(new int[]{1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
                Task38.countDigitFrequency(1234567890));
    }

    @Test
    void countDigitFrequency_repeatedDigit() {
        assertArrayEquals(new int[]{0, 0, 0, 0, 0, 4, 0, 0, 0, 0},
                Task38.countDigitFrequency(5555));
    }
}
