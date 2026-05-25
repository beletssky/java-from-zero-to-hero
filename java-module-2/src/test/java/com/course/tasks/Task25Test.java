package com.course.tasks;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class Task25Test {

    @ParameterizedTest
    @CsvSource({
            "ab, 3, ababab",
            "x, 0, ''",
            "x, 1, x",
            "'', 5, ''"
    })
    void repeat_variousCases(String s, int n, String expected) {
        assertEquals(expected, Task25.repeat(s, n));
    }

    @Test
    void repeat_zeroTimes_isEmpty() {
        assertEquals("", Task25.repeat("hello", 0));
    }

    @Test
    void repeat_throws_forNegative() {
        assertThrows(IllegalArgumentException.class, () -> Task25.repeat("x", -1));
    }

    @Test
    void repeat_longString() {
        String result = Task25.repeat("ab", 100);
        assertEquals(200, result.length());
        assertTrue(result.startsWith("abab"));
        assertTrue(result.endsWith("ab"));
    }
}
