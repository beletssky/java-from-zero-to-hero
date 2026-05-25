package com.course.tasks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task11Test {

    @Test
    void contains_true_whenPresent() {
        assertTrue(Task11.contains(new int[]{1, 2, 3}, 2));
    }

    @Test
    void contains_false_whenAbsent() {
        assertFalse(Task11.contains(new int[]{1, 2, 3}, 9));
    }

    @Test
    void contains_false_forEmptyArray() {
        assertFalse(Task11.contains(new int[]{}, 5));
    }

    @Test
    void contains_throws_forNull() {
        assertThrows(IllegalArgumentException.class, () -> Task11.contains(null, 1));
    }

    @Test
    void contains_findsDuplicateValue() {
        assertTrue(Task11.contains(new int[]{1, 1, 1, 1}, 1));
    }
}
