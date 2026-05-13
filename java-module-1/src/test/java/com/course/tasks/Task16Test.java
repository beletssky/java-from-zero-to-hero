package com.course.tasks;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class Task16Test {

    @Test
    void calculate_addition() {
        assertEquals(5.0, Task16.calculate(2, 3, '+'), 1e-9);
    }

    @Test
    void calculate_subtraction() {
        assertEquals(-1.0, Task16.calculate(2, 3, '-'), 1e-9);
    }

    @Test
    void calculate_multiplication() {
        assertEquals(6.0, Task16.calculate(2, 3, '*'), 1e-9);
    }

    @Test
    void calculate_division() {
        assertEquals(2.0, Task16.calculate(6, 3, '/'), 1e-9);
    }

    @Test
    void calculate_divisionByZero_throws() {
        ArithmeticException ex = assertThrows(ArithmeticException.class,
            () -> Task16.calculate(5, 0, '/'));
        assertEquals("div by zero", ex.getMessage());
    }

    @Test
    void calculate_unknownOp_throws() {
        IllegalArgumentException ex = assertThrows(IllegalArgumentException.class,
            () -> Task16.calculate(5, 3, '%'));
        assertEquals("unknown op", ex.getMessage());
    }
}
