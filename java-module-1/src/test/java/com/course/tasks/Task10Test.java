package com.course.tasks;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class Task10Test {

    @ParameterizedTest
    @CsvSource({
        "2000, true",
        "1900, false",
        "2024, true",
        "2023, false",
        "2400, true",
        "2100, false",
        "4, true",
        "1, false"
    })
    void isLeapYear_returnsExpected(int year, boolean expected) {
        assertEquals(expected, Task10.isLeapYear(year));
    }

    @Test
    void isLeapYear_year0_isLeap() {
        assertTrue(Task10.isLeapYear(0));
    }
}
