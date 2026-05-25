package com.course.tasks;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class Task35Test {

    @ParameterizedTest
    @CsvSource({
        "1, I",
        "2, II",
        "3, III",
        "4, IV",
        "5, V",
        "6, VI",
        "9, IX",
        "10, X",
        "14, XIV",
        "19, XIX",
        "20, XX",
        "40, XL",
        "44, XLIV",
        "49, XLIX",
        "50, L"
    })
    void intToRoman_basic(int n, String expected) {
        assertEquals(expected, Task35.intToRoman(n));
    }

    @ParameterizedTest
    @ValueSource(ints = {0, -1, 51, 100})
    void intToRoman_outOfRangeThrows(int n) {
        assertThrows(IllegalArgumentException.class, () -> Task35.intToRoman(n));
    }
}
