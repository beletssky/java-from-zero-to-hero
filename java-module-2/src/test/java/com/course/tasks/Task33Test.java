package com.course.tasks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task33Test {

    @Test
    void mostFrequentWord_basic() {
        assertEquals("the", Task33.mostFrequentWord("the cat and the dog"));
    }

    @Test
    void mostFrequentWord_caseInsensitive() {
        assertEquals("the", Task33.mostFrequentWord("The cat THE dog the"));
    }

    @Test
    void mostFrequentWord_ties_returnsFirst() {
        assertEquals("a", Task33.mostFrequentWord("a b a b"));
    }

    @Test
    void mostFrequentWord_throws_forNull() {
        assertThrows(IllegalArgumentException.class, () -> Task33.mostFrequentWord(null));
    }

    @Test
    void mostFrequentWord_throws_forEmpty() {
        assertThrows(IllegalArgumentException.class, () -> Task33.mostFrequentWord(""));
    }

    @Test
    void mostFrequentWord_throws_forSpacesOnly() {
        assertThrows(IllegalArgumentException.class, () -> Task33.mostFrequentWord("   "));
    }

    @Test
    void mostFrequentWord_singleWord() {
        assertEquals("hello", Task33.mostFrequentWord("hello"));
    }
}
