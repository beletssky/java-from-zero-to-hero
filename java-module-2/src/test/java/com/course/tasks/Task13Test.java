package com.course.tasks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task13Test {

    @Test
    void reverse_basic() {
        assertArrayEquals(new int[]{3, 2, 1}, Task13.reverse(new int[]{1, 2, 3}));
    }

    @Test
    void reverse_empty() {
        assertArrayEquals(new int[]{}, Task13.reverse(new int[]{}));
    }

    @Test
    void reverse_singleElement() {
        assertArrayEquals(new int[]{5}, Task13.reverse(new int[]{5}));
    }

    @Test
    void reverse_doesNotMutateOriginal() {
        int[] original = {1, 2, 3, 4};
        int[] copy = original.clone();
        Task13.reverse(original);
        assertArrayEquals(copy, original);
    }

    @Test
    void reverse_evenLength() {
        assertArrayEquals(new int[]{4, 3, 2, 1}, Task13.reverse(new int[]{1, 2, 3, 4}));
    }
}
