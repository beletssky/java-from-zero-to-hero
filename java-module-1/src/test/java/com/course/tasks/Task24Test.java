package com.course.tasks;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class Task24Test {

    @ParameterizedTest
    @CsvSource({
        "0, 0",
        "1, 1",
        "12, 21",
        "123, 321",
        "-450, -54",
        "1000, 1",
        "-1, -1",
        "10, 1"
    })
    void reverseNumber_basic(int n, int expected) {
        assertEquals(expected, Task24.reverseNumber(n));
    }

    @Test
    void reverseNumber_palindrome() {
        assertEquals(121, Task24.reverseNumber(121));
    }
}
