package com.course.tasks;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class Task05Test {

    @Test
    void unboxAndAdd_basicCase() {
        assertEquals(10, Task05.unboxAndAdd(Integer.valueOf(7), 3));
    }

    @Test
    void unboxAndAdd_zeroAndNegative() {
        assertEquals(-5, Task05.unboxAndAdd(Integer.valueOf(0), -5));
    }

    @Test
    void unboxAndAdd_throwsOnNullA() {
        NullPointerException ex = assertThrows(NullPointerException.class,
            () -> Task05.unboxAndAdd(null, 5));
        assertEquals("a is null", ex.getMessage());
    }

    @Test
    void unboxAndAdd_largeValues() {
        assertEquals(2_000_000_000, Task05.unboxAndAdd(Integer.valueOf(1_000_000_000), 1_000_000_000));
    }
}
