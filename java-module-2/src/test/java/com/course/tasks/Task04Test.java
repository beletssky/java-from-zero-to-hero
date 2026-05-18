package com.course.tasks;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class Task04Test {

    @ParameterizedTest
    @CsvSource({
            "1, 9, 5, 9",
            "9, 1, 5, 9",
            "1, 5, 9, 9",
            "7, 7, 7, 7",
            "-1, -2, -3, -1"
    })
    void max3_returnsLargest(int a, int b, int c, int expected) {
        assertEquals(expected, Task04.max3(a, b, c));
    }

    @Test
    void max3_allEqual() {
        assertEquals(3, Task04.max3(3, 3, 3));
    }

    @Test
    void max3_mixedSigns() {
        assertEquals(0, Task04.max3(-5, 0, -1));
    }

    @Test
    void max3_largeValues() {
        assertEquals(Integer.MAX_VALUE, Task04.max3(0, Integer.MAX_VALUE, -1));
    }
}
