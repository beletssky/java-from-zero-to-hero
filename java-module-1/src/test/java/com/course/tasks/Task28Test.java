package com.course.tasks;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class Task28Test {

    @ParameterizedTest
    @CsvSource({
        "1, 1",
        "7, 2",
        "12, 6",
        "100, 9",
        "-12, 6",
        "-1, 1"
    })
    void countDivisors_basic(int n, int expected) {
        assertEquals(expected, Task28.countDivisors(n));
    }

    @Test
    void countDivisors_zeroThrows() {
        assertThrows(IllegalArgumentException.class, () -> Task28.countDivisors(0));
    }

    @Test
    void countDivisors_largeNumber() {
        // 720 = 2^4 * 3^2 * 5 -> (4+1)(2+1)(1+1) = 30
        assertEquals(30, Task28.countDivisors(720));
    }
}
