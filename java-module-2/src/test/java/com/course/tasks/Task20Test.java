package com.course.tasks;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class Task20Test {

    @ParameterizedTest
    @CsvSource({
            "level, true",
            "hello, false",
            "'', true",
            "a, true",
            "abba, true",
            "ab, false"
    })
    void isPalindromeString_variousCases(String s, boolean expected) {
        assertEquals(expected, Task20.isPalindromeString(s));
    }

    @Test
    void isPalindromeString_empty_isPalindrome() {
        assertTrue(Task20.isPalindromeString(""));
    }

    @Test
    void isPalindromeString_singleChar_isPalindrome() {
        assertTrue(Task20.isPalindromeString("a"));
    }

    @Test
    void isPalindromeString_caseMatters() {
        assertFalse(Task20.isPalindromeString("Aa"));
    }
}
