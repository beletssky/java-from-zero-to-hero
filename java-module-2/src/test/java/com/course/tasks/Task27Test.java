package com.course.tasks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task27Test {

    @Test
    void sumOrZero_bothPresent() {
        assertEquals(8, Task27.sumOrZero(3, 5));
    }

    @Test
    void sumOrZero_firstNull() {
        assertEquals(5, Task27.sumOrZero(null, 5));
    }

    @Test
    void sumOrZero_secondNull() {
        assertEquals(3, Task27.sumOrZero(3, null));
    }

    @Test
    void sumOrZero_bothNull() {
        assertEquals(0, Task27.sumOrZero(null, null));
    }

    @Test
    void sumOrZero_negativeValues() {
        assertEquals(-7, Task27.sumOrZero(-3, -4));
    }
}
