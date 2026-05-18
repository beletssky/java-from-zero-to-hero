package com.course.tasks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task26Test {

    @Test
    void parseOrDefault_validInteger() {
        assertEquals(42, Task26.parseOrDefault("42", 0));
    }

    @Test
    void parseOrDefault_invalidReturnsDefault() {
        assertEquals(-1, Task26.parseOrDefault("abc", -1));
    }

    @Test
    void parseOrDefault_nullReturnsDefault() {
        assertEquals(99, Task26.parseOrDefault(null, 99));
    }

    @Test
    void parseOrDefault_emptyReturnsDefault() {
        assertEquals(7, Task26.parseOrDefault("", 7));
    }

    @Test
    void parseOrDefault_negativeNumber() {
        assertEquals(-123, Task26.parseOrDefault("-123", 0));
    }
}
