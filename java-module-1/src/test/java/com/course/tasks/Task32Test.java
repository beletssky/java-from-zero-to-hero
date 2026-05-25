package com.course.tasks;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class Task32Test {

    @Test
    void fizzBuzz_classicCase() {
        String expected = "1\n2\nFizz\n4\nBuzz\nFizz\n7\n8\nFizz\nBuzz\n11\nFizz\n13\n14\nFizzBuzz";
        assertEquals(expected, Task32.fizzBuzz(15));
    }

    @Test
    void fizzBuzz_oneOnly() {
        assertEquals("1", Task32.fizzBuzz(1));
    }

    @Test
    void fizzBuzz_three() {
        assertEquals("1\n2\nFizz", Task32.fizzBuzz(3));
    }

    @ParameterizedTest
    @ValueSource(ints = {0, -1, -100})
    void fizzBuzz_nonPositiveReturnsEmpty(int n) {
        assertEquals("", Task32.fizzBuzz(n));
    }

    @Test
    void fizzBuzz_lastLineHasNoTrailingNewline() {
        String r = Task32.fizzBuzz(20);
        assertFalse(r.endsWith("\n"));
    }
}
