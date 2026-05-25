package com.course.tasks;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class Task35Test {

    @ParameterizedTest
    @CsvSource({
            "'()', true",
            "'([])', true",
            "'([)]', false",
            "'(((', false",
            "'', true",
            "'abc(d)e', true",
            "'{[()]}', true",
            "')(' , false",
            "'((()))', true"
    })
    void isValidBrackets_variousCases(String s, boolean expected) {
        assertEquals(expected, Task35.isValidBrackets(s));
    }

    @Test
    void isValidBrackets_emptyIsValid() {
        assertTrue(Task35.isValidBrackets(""));
    }

    @Test
    void isValidBrackets_unmatchedCloser() {
        assertFalse(Task35.isValidBrackets(")"));
    }

    @Test
    void isValidBrackets_ignoresNonBracketChars() {
        assertTrue(Task35.isValidBrackets("hello (world) [now] {ok}"));
    }

    @Test
    void isValidBrackets_deeplyNested() {
        assertTrue(Task35.isValidBrackets("([{([{}])}])"));
    }
}
