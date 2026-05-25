package com.course.tasks;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class Task05Test {

    @ParameterizedTest
    @CsvSource({
            "2, 3, 5",
            "0, 0, 0",
            "-1, 1, 0",
            "100, 200, 300"
    })
    void sum_twoArgs(int a, int b, int expected) {
        assertEquals(expected, Task05.sum(a, b));
    }

    @ParameterizedTest
    @CsvSource({
            "1, 2, 3, 6",
            "0, 0, 0, 0",
            "-1, -2, -3, -6",
            "10, 20, 30, 60"
    })
    void sum_threeArgs(int a, int b, int c, int expected) {
        assertEquals(expected, Task05.sum(a, b, c));
    }

    @Test
    void sum_overloadResolution_twoArgs() {
        assertEquals(5, Task05.sum(2, 3));
    }

    @Test
    void sum_overloadResolution_threeArgs() {
        assertEquals(6, Task05.sum(1, 2, 3));
    }
}
