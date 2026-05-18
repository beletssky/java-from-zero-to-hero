package com.course.tasks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task34Test {

    @Test
    void rotateRight_basic() {
        assertArrayEquals(new int[]{4, 5, 1, 2, 3},
                Task34.rotateRight(new int[]{1, 2, 3, 4, 5}, 2));
    }

    @Test
    void rotateRight_kLargerThanLength() {
        // 5 % 3 = 2
        assertArrayEquals(new int[]{2, 3, 1}, Task34.rotateRight(new int[]{1, 2, 3}, 5));
    }

    @Test
    void rotateRight_emptyArray() {
        assertArrayEquals(new int[]{}, Task34.rotateRight(new int[]{}, 3));
    }

    @Test
    void rotateRight_zeroShift() {
        assertArrayEquals(new int[]{1, 2, 3}, Task34.rotateRight(new int[]{1, 2, 3}, 0));
    }

    @Test
    void rotateRight_negativeShift_isLeftShift() {
        // -1 means rotate left by 1
        assertArrayEquals(new int[]{2, 3, 4, 5, 1},
                Task34.rotateRight(new int[]{1, 2, 3, 4, 5}, -1));
    }

    @Test
    void rotateRight_doesNotMutateOriginal() {
        int[] original = {1, 2, 3, 4};
        int[] copy = original.clone();
        Task34.rotateRight(original, 2);
        assertArrayEquals(copy, original);
    }
}
