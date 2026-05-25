package com.course.tasks;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class Task18Test {

    @ParameterizedTest
    @CsvSource({
            "hello, l, 2",
            "'', a, 0",
            "banana, a, 3",
            "abc, x, 0"
    })
    void countChar_variousCases(String s, char c, int expected) {
        assertEquals(expected, Task18.countChar(s, c));
    }

    @Test
    void countChar_empty_returnsZero() {
        assertEquals(0, Task18.countChar("", 'a'));
    }

    @Test
    void countChar_throws_forNull() {
        assertThrows(IllegalArgumentException.class, () -> Task18.countChar(null, 'x'));
    }

    @Test
    void countChar_caseSensitive() {
        assertEquals(1, Task18.countChar("Abba", 'A'));
        assertEquals(2, Task18.countChar("Abba", 'b'));
    }
}
