package com.course.tasks;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class Task27Test {

    @ParameterizedTest
    @CsvSource({
        "12, 18, 6",
        "7, 13, 1",
        "0, 5, 5",
        "5, 0, 5",
        "0, 0, 0",
        "100, 75, 25",
        "-12, 18, 6",
        "-12, -18, 6"
    })
    void gcd_basic(int a, int b, int expected) {
        assertEquals(expected, Task27.gcd(a, b));
    }

    @Test
    void gcd_largeNumbers() {
        assertEquals(7, Task27.gcd(1071, 462));
    }
}
