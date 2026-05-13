package com.course.tasks;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class Task30Test {

    @ParameterizedTest
    @CsvSource({
        "573, 3",
        "1000, 0",
        "-49, 4",
        "9, 9",
        "0, 0",
        "111, 1",
        "987654321, 1"
    })
    void minDigit_basic(int n, int expected) {
        assertEquals(expected, Task30.minDigit(n));
    }

    @Test
    void minDigit_intMaxValue() {
        // 2147483647 -> min digit is 1
        assertEquals(1, Task30.minDigit(Integer.MAX_VALUE));
    }
}
