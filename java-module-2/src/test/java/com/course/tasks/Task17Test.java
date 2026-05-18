package com.course.tasks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task17Test {

    @Test
    void concat_basic() {
        assertArrayEquals(new int[]{1, 2, 3, 4, 5},
                Task17.concat(new int[]{1, 2}, new int[]{3, 4, 5}));
    }

    @Test
    void concat_firstEmpty() {
        assertArrayEquals(new int[]{1, 2}, Task17.concat(new int[]{}, new int[]{1, 2}));
    }

    @Test
    void concat_secondEmpty() {
        assertArrayEquals(new int[]{1, 2}, Task17.concat(new int[]{1, 2}, new int[]{}));
    }

    @Test
    void concat_bothEmpty() {
        assertArrayEquals(new int[]{}, Task17.concat(new int[]{}, new int[]{}));
    }

    @Test
    void concat_throws_whenFirstNull() {
        assertThrows(IllegalArgumentException.class,
                () -> Task17.concat(null, new int[]{1}));
    }

    @Test
    void concat_throws_whenSecondNull() {
        assertThrows(IllegalArgumentException.class,
                () -> Task17.concat(new int[]{1}, null));
    }
}
