package com.course.tasks;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class Task13Test {

    @ParameterizedTest
    @CsvSource({
        "3, 4, 5, true",
        "5, 5, 5, true",
        "1, 1, 5, false",
        "0, 4, 5, false",
        "-1, 4, 5, false",
        "1, 2, 3, false"
    })
    void isTriangle_variousCases(int a, int b, int c, boolean expected) {
        assertEquals(expected, Task13.isTriangle(a, b, c));
    }

    @Test
    void isTriangle_isOrderIndependent() {
        assertEquals(Task13.isTriangle(3, 4, 5), Task13.isTriangle(5, 4, 3));
    }

    @Test
    void isTriangle_allZerosFalse() {
        assertFalse(Task13.isTriangle(0, 0, 0));
    }
}
