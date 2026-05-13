package com.course.tasks;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class Task33Test {

    @Test
    void sortThreeAsc_basic() {
        assertArrayEquals(new int[]{1, 2, 3}, Task33.sortThreeAsc(3, 1, 2));
    }

    @Test
    void sortThreeAsc_withDuplicates() {
        assertArrayEquals(new int[]{1, 5, 5}, Task33.sortThreeAsc(5, 5, 1));
    }

    @Test
    void sortThreeAsc_alreadySorted() {
        assertArrayEquals(new int[]{1, 2, 3}, Task33.sortThreeAsc(1, 2, 3));
    }

    @Test
    void sortThreeAsc_allEqual() {
        assertArrayEquals(new int[]{7, 7, 7}, Task33.sortThreeAsc(7, 7, 7));
    }

    @Test
    void sortThreeAsc_negativesMixed() {
        assertArrayEquals(new int[]{-5, 0, 3}, Task33.sortThreeAsc(0, -5, 3));
    }

    @Test
    void sortThreeAsc_returnsNewArrayOfLengthThree() {
        int[] r = Task33.sortThreeAsc(1, 2, 3);
        assertEquals(3, r.length);
    }
}
