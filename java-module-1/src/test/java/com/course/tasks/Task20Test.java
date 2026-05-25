package com.course.tasks;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class Task20Test {

    @ParameterizedTest
    @CsvSource({
        "0, 1",
        "1, 1",
        "5, 120",
        "10, 3628800",
        "20, 2432902008176640000"
    })
    void factorial_basic(int n, long expected) {
        assertEquals(expected, Task20.factorial(n));
    }

    @Test
    void factorial_negativeThrows() {
        assertThrows(IllegalArgumentException.class, () -> Task20.factorial(-1));
    }

    @Test
    void factorial_two() {
        assertEquals(2L, Task20.factorial(2));
    }
}
