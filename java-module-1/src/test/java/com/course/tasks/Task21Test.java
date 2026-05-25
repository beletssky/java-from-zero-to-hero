package com.course.tasks;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class Task21Test {

    @ParameterizedTest
    @CsvSource({
        "0, 0",
        "1, 1",
        "2, 1",
        "3, 2",
        "10, 55",
        "20, 6765",
        "50, 12586269025"
    })
    void fibonacci_basic(int n, long expected) {
        assertEquals(expected, Task21.fibonacci(n));
    }

    @Test
    void fibonacci_negativeThrows() {
        assertThrows(IllegalArgumentException.class, () -> Task21.fibonacci(-1));
    }

    @Test
    void fibonacci_largeN_doesNotOverflow() {
        // fib(70) = 190392490709135
        assertEquals(190392490709135L, Task21.fibonacci(70));
    }
}
