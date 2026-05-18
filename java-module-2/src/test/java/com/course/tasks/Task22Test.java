package com.course.tasks;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class Task22Test {

    @ParameterizedTest
    @CsvSource({
            "'hello world', 2",
            "'  one  two  three  ', 3",
            "'', 0",
            "'   ', 0",
            "'single', 1"
    })
    void countWords_variousCases(String s, int expected) {
        assertEquals(expected, Task22.countWords(s));
    }

    @Test
    void countWords_emptyIsZero() {
        assertEquals(0, Task22.countWords(""));
    }

    @Test
    void countWords_onlySpacesIsZero() {
        assertEquals(0, Task22.countWords("   "));
    }

    @Test
    void countWords_multipleSpacesBetweenWords() {
        assertEquals(2, Task22.countWords("a       b"));
    }
}
