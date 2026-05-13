package com.course.tasks;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class Task34Test {

    @ParameterizedTest
    @CsvSource({
        "10, 4",
        "1, 0",
        "0, 0",
        "-5, 0",
        "2, 1",
        "3, 2",
        "20, 8",
        "100, 25"
    })
    void countPrimesUpTo_basic(int n, int expected) {
        assertEquals(expected, Task34.countPrimesUpTo(n));
    }

    @Test
    void countPrimesUpTo_thousand() {
        assertEquals(168, Task34.countPrimesUpTo(1000));
    }
}
