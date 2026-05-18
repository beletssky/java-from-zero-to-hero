package com.course.tasks;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class Task02Test {

    @ParameterizedTest
    @CsvSource({
            "5, 1, 10, true",
            "0, 1, 10, false",
            "10, 1, 10, true",
            "1, 1, 10, true",
            "11, 1, 10, false"
    })
    void inRange_variousCases(int n, int min, int max, boolean expected) {
        assertEquals(expected, Task02.inRange(n, min, max));
    }

    @Test
    void inRange_atLowerBoundary_isTrue() {
        assertTrue(Task02.inRange(-5, -5, -1));
    }

    @Test
    void inRange_atUpperBoundary_isTrue() {
        assertTrue(Task02.inRange(-1, -5, -1));
    }

    @Test
    void inRange_singletonRange() {
        assertTrue(Task02.inRange(7, 7, 7));
        assertFalse(Task02.inRange(8, 7, 7));
    }
}
