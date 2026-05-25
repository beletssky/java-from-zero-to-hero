package com.course.tasks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task24Test {

    @Test
    void isAnagram_basicTrue() {
        assertTrue(Task24.isAnagram("listen", "silent"));
    }

    @Test
    void isAnagram_basicFalse() {
        assertFalse(Task24.isAnagram("hello", "world"));
    }

    @Test
    void isAnagram_caseInsensitive() {
        assertTrue(Task24.isAnagram("Listen", "SILENT"));
    }

    @Test
    void isAnagram_ignoresSpaces() {
        assertTrue(Task24.isAnagram("a gentleman", "elegant man"));
    }

    @Test
    void isAnagram_throws_forFirstNull() {
        assertThrows(IllegalArgumentException.class, () -> Task24.isAnagram(null, "x"));
    }

    @Test
    void isAnagram_throws_forSecondNull() {
        assertThrows(IllegalArgumentException.class, () -> Task24.isAnagram("x", null));
    }

    @Test
    void isAnagram_emptyStringsAreAnagrams() {
        assertTrue(Task24.isAnagram("", ""));
    }
}
