package com.course.tasks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task12Test {

    @Test
    void countEvens_mixed() {
        assertEquals(3, Task12.countEvens(new int[]{1, 2, 3, 4, 5, 6}));
    }

    @Test
    void countEvens_allOdd() {
        assertEquals(0, Task12.countEvens(new int[]{1, 3, 5}));
    }

    @Test
    void countEvens_empty() {
        assertEquals(0, Task12.countEvens(new int[]{}));
    }

    @Test
    void countEvens_zeroIsEven() {
        assertEquals(1, Task12.countEvens(new int[]{0, 1, 3}));
    }

    @Test
    void countEvens_negativeEvens() {
        assertEquals(2, Task12.countEvens(new int[]{-2, -3, -4, -5}));
    }
}
