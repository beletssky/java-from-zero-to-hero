package com.course.tasks;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class Task03Test {

    @Test
    void averageOfThree_basicCase() {
        assertEquals(2.0, Task03.averageOfThree(1, 2, 3), 1e-9);
    }

    @Test
    void averageOfThree_nonIntegerResult() {
        assertEquals(1.0 + 1.0/3.0, Task03.averageOfThree(1, 1, 2), 1e-9);
    }

    @Test
    void averageOfThree_zeros() {
        assertEquals(0.0, Task03.averageOfThree(0, 0, 0), 1e-9);
    }

    @Test
    void averageOfThree_negativeNumbers() {
        assertEquals(-2.0, Task03.averageOfThree(-1, -2, -3), 1e-9);
    }

    @Test
    void averageOfThree_largeNumbers() {
        assertEquals(1_000_000.0, Task03.averageOfThree(1_000_000, 1_000_000, 1_000_000), 1e-9);
    }
}
