package com.course.tasks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task31Test {

    @Test
    void sortAsc_basic() {
        assertArrayEquals(new int[]{1, 1, 3, 4, 5}, Task31.sortAsc(new int[]{3, 1, 4, 1, 5}));
    }

    @Test
    void sortAsc_empty() {
        assertArrayEquals(new int[]{}, Task31.sortAsc(new int[]{}));
    }

    @Test
    void sortAsc_singleElement() {
        assertArrayEquals(new int[]{7}, Task31.sortAsc(new int[]{7}));
    }

    @Test
    void sortAsc_alreadySorted() {
        assertArrayEquals(new int[]{1, 2, 3, 4}, Task31.sortAsc(new int[]{1, 2, 3, 4}));
    }

    @Test
    void sortAsc_reverseSorted() {
        assertArrayEquals(new int[]{-3, -1, 0, 5, 8},
                Task31.sortAsc(new int[]{8, 5, 0, -1, -3}));
    }

    @Test
    void sortAsc_doesNotMutateOriginal() {
        int[] original = {3, 1, 2};
        int[] copy = original.clone();
        Task31.sortAsc(original);
        assertArrayEquals(copy, original);
    }
}
