package com.course.tasks;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class Task23Test {

    @ParameterizedTest
    @CsvSource({
        "0, 0",
        "5, 5",
        "123, 6",
        "-405, 9",
        "999, 27",
        "-1000, 1"
    })
    void sumOfDigits_basic(int n, int expected) {
        assertEquals(expected, Task23.sumOfDigits(n));
    }

    @Test
    void sumOfDigits_intMaxValue() {
        // 2147483647 -> 2+1+4+7+4+8+3+6+4+7 = 46
        assertEquals(46, Task23.sumOfDigits(Integer.MAX_VALUE));
    }

    @Test
    void sumOfDigits_intMinValue() {
        // |Integer.MIN_VALUE| = 2147483648 -> 2+1+4+7+4+8+3+6+4+8 = 47
        assertEquals(47, Task23.sumOfDigits(Integer.MIN_VALUE));
    }
}
