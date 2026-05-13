package com.course.tasks;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class Task26Test {

    @ParameterizedTest
    @CsvSource({
        "2, 10, 1024",
        "3, 0, 1",
        "5, 1, 5",
        "0, 5, 0",
        "1, 100, 1",
        "-2, 3, -8",
        "-2, 4, 16"
    })
    void power_basic(int base, int exp, long expected) {
        assertEquals(expected, Task26.power(base, exp));
    }

    @Test
    void power_negativeExpThrows() {
        assertThrows(IllegalArgumentException.class, () -> Task26.power(2, -1));
    }

    @Test
    void power_largeResult() {
        // 2^40 = 1099511627776
        assertEquals(1_099_511_627_776L, Task26.power(2, 40));
    }
}
