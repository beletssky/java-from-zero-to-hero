package com.course.tasks;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class Task01Test {

    @Test
    void helloWorld_returnsExpectedString() {
        assertEquals("Hello, World!", Task01.helloWorld());
    }

    @Test
    void helloWorld_isNotNull() {
        assertNotNull(Task01.helloWorld());
    }

    @Test
    void helloWorld_hasExactLength() {
        assertEquals(13, Task01.helloWorld().length());
    }

    @Test
    void helloWorld_endsWithExclamation() {
        assertTrue(Task01.helloWorld().endsWith("!"));
    }
}
