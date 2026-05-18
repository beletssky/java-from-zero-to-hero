package com.course.tasks;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class Task21Test {

    @ParameterizedTest
    @CsvSource({
            "'hello world', 'Hello World'",
            "'java is cool', 'Java Is Cool'",
            "'a', 'A'",
            "'HELLO', 'Hello'"
    })
    void toTitleCase_variousCases(String input, String expected) {
        assertEquals(expected, Task21.toTitleCase(input));
    }

    @Test
    void toTitleCase_empty() {
        assertEquals("", Task21.toTitleCase(""));
    }

    @Test
    void toTitleCase_singleWord() {
        assertEquals("Foo", Task21.toTitleCase("foo"));
    }

    @Test
    void toTitleCase_mixedCaseInput() {
        assertEquals("Hello World", Task21.toTitleCase("hElLo WoRLD"));
    }
}
