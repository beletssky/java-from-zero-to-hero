package com.course.tasks;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class Task06Test {

    @ParameterizedTest
    @ValueSource(ints = {0, 2, -4, 100, -100})
    void isEven_returnsTrue_forEvenNumbers(int n) {
        assertTrue(Task06.isEven(n));
    }

    @ParameterizedTest
    @ValueSource(ints = {1, -1, 7, -7, 99})
    void isEven_returnsFalse_forOddNumbers(int n) {
        assertFalse(Task06.isEven(n));
    }

    @Test
    void isEven_handlesIntegerMinValue() {
        assertTrue(Task06.isEven(Integer.MIN_VALUE));
    }

    @Test
    void isEven_handlesIntegerMaxValue() {
        assertFalse(Task06.isEven(Integer.MAX_VALUE));
    }
}
