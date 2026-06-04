package com.course.tasks;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class Task02Test {

    @ParameterizedTest
    @CsvSource({
        "2, 3, 5",
        "-1, 1, 0",
        "0, 0, 0",
        "100, 200, 300"
    })
    void sumTwo_returnsCorrectSum(int a, int b, int expected) {
        assertEquals(expected, Task02.sum(a, b));
    }

    @Test
    void sumTwo_handlesLargePositiveValues() {
        assertEquals(2_000_000_000, Task02.sum(1_000_000_000, 1_000_000_000));
    }

    @Test
    void sumTwo_isCommutative() {
        assertEquals(Task02.sum(7, 11), Task02.sum(11, 7));
    }
}
