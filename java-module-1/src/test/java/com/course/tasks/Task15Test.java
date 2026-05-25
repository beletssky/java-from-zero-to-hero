package com.course.tasks;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class Task15Test {

    @ParameterizedTest
    @CsvSource({
        "1, false, 31",
        "2, false, 28",
        "2, true, 29",
        "3, false, 31",
        "4, false, 30",
        "12, false, 31",
        "6, true, 30"
    })
    void daysInMonth_validMonth(int month, boolean leap, int expected) {
        assertEquals(expected, Task15.daysInMonth(month, leap));
    }

    @ParameterizedTest
    @ValueSource(ints = {0, 13, -1, 100})
    void daysInMonth_invalidReturnsMinusOne(int month) {
        assertEquals(-1, Task15.daysInMonth(month, false));
    }
}
