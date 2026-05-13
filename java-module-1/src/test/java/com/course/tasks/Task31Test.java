package com.course.tasks;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class Task31Test {

    @ParameterizedTest
    @CsvSource({
        "0, true",
        "1, true",
        "9, true",
        "121, true",
        "12321, true",
        "10, false",
        "123, false",
        "-121, false",
        "-1, false"
    })
    void isPalindrome_basic(int n, boolean expected) {
        assertEquals(expected, Task31.isPalindrome(n));
    }

    @Test
    void isPalindrome_largePalindrome() {
        assertTrue(Task31.isPalindrome(1234554321));
    }

    @Test
    void isPalindrome_largeNonPalindrome() {
        assertFalse(Task31.isPalindrome(1234567890));
    }
}
