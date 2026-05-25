package com.course.tasks;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class Task01Test {

    @ParameterizedTest
    @CsvSource({
            "0, 0",
            "1, 1",
            "5, 25",
            "-3, 9",
            "12, 144"
    })
    void square_returnsExpectedValue(int n, int expected) {
        assertEquals(expected, Task01.square(n));
    }

    @Test
    void square_ofZero_isZero() {
        assertEquals(0, Task01.square(0));
    }

    @Test
    void square_ofNegative_isPositive() {
        assertTrue(Task01.square(-7) > 0);
        assertEquals(49, Task01.square(-7));
    }

    @Test
    void square_largePositive() {
        assertEquals(1_000_000, Task01.square(1000));
    }
}
