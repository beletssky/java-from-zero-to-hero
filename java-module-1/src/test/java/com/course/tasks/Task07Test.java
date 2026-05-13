package com.course.tasks;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class Task07Test {

    @ParameterizedTest
    @CsvSource({
        "3, 7, 7",
        "7, 3, 7",
        "5, 5, 5",
        "-3, -7, -3"
    })
    void max_returnsLarger(int a, int b, int expected) {
        assertEquals(expected, Task07.max(a, b));
    }

    @Test
    void max_handlesZero() {
        assertEquals(0, Task07.max(0, 0));
        assertEquals(1, Task07.max(0, 1));
        assertEquals(0, Task07.max(0, -1));
    }

    @Test
    void max_handlesIntegerExtremes() {
        assertEquals(Integer.MAX_VALUE, Task07.max(Integer.MIN_VALUE, Integer.MAX_VALUE));
    }
}
