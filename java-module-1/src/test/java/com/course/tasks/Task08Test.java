package com.course.tasks;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class Task08Test {

    @ParameterizedTest
    @CsvSource({
        "1, 9, 5, 9",
        "9, 1, 5, 9",
        "1, 5, 9, 9",
        "5, 5, 5, 5",
        "-1, -2, -3, -1"
    })
    void maxOfThree_returnsMax(int a, int b, int c, int expected) {
        assertEquals(expected, Task08.maxOfThree(a, b, c));
    }

    @Test
    void maxOfThree_allEqual() {
        assertEquals(7, Task08.maxOfThree(7, 7, 7));
    }

    @Test
    void maxOfThree_extremes() {
        assertEquals(Integer.MAX_VALUE, Task08.maxOfThree(0, Integer.MAX_VALUE, Integer.MIN_VALUE));
    }
}
