package com.course.tasks;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class Task22Test {

    @ParameterizedTest
    @CsvSource({
        "0, 1",
        "1, 1",
        "9, 1",
        "10, 2",
        "123, 3",
        "-45, 2",
        "1000, 4",
        "-1, 1"
    })
    void countDigits_basic(int n, int expected) {
        assertEquals(expected, Task22.countDigits(n));
    }

    @Test
    void countDigits_intMaxValue() {
        assertEquals(10, Task22.countDigits(Integer.MAX_VALUE));
    }

    @Test
    void countDigits_intMinValue() {
        assertEquals(10, Task22.countDigits(Integer.MIN_VALUE));
    }
}
