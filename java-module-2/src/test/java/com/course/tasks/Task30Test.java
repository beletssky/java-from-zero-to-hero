package com.course.tasks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task30Test {

    @Test
    void safeDivide_basic() {
        assertEquals(5, Task30.safeDivide(10, 2));
    }

    @Test
    void safeDivide_firstNullReturnsZero() {
        assertEquals(0, Task30.safeDivide(null, 5));
    }

    @Test
    void safeDivide_secondNullThrows() {
        ArithmeticException ex = assertThrows(ArithmeticException.class,
                () -> Task30.safeDivide(10, null));
        assertEquals("invalid divisor", ex.getMessage());
    }

    @Test
    void safeDivide_zeroDivisorThrows() {
        ArithmeticException ex = assertThrows(ArithmeticException.class,
                () -> Task30.safeDivide(10, 0));
        assertEquals("invalid divisor", ex.getMessage());
    }

    @Test
    void safeDivide_integerDivisionTruncates() {
        assertEquals(3, Task30.safeDivide(10, 3));
    }
}
