package com.course.tasks;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class Task19Test {

    @ParameterizedTest
    @CsvSource({
            "hello, olleh",
            "'', ''",
            "a, a",
            "ab, ba",
            "racecar, racecar"
    })
    void reverseString_variousCases(String input, String expected) {
        assertEquals(expected, Task19.reverseString(input));
    }

    @Test
    void reverseString_empty() {
        assertEquals("", Task19.reverseString(""));
    }

    @Test
    void reverseString_throws_forNull() {
        assertThrows(IllegalArgumentException.class, () -> Task19.reverseString(null));
    }

    @Test
    void reverseString_withSpaces() {
        assertEquals("cba abc", Task19.reverseString("cba abc"));
        assertEquals(" cba", Task19.reverseString("abc "));
    }
}
