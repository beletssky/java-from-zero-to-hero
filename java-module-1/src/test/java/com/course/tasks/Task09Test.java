package com.course.tasks;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class Task09Test {

    @ParameterizedTest
    @CsvSource({
        "-7, -1",
        "-1, -1",
        "0, 0",
        "1, 1",
        "100, 1"
    })
    void sign_returnsCorrectSign(int n, int expected) {
        assertEquals(expected, Task09.sign(n));
    }

    @Test
    void sign_intMinIsMinusOne() {
        assertEquals(-1, Task09.sign(Integer.MIN_VALUE));
    }

    @Test
    void sign_intMaxIsOne() {
        assertEquals(1, Task09.sign(Integer.MAX_VALUE));
    }
}
