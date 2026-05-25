package com.course.tasks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task43Test {

    @Test
    void alignText_padsRight() {
        assertEquals("hi...", Task43.alignText("hi", 5, '.'));
    }

    @Test
    void alignText_truncatesWhenLonger() {
        assertEquals("hello", Task43.alignText("hello world", 5, '.'));
    }

    @Test
    void alignText_exactLengthUnchanged() {
        assertEquals("hello", Task43.alignText("hello", 5, '.'));
    }

    @Test
    void alignText_emptyStringFullyFilled() {
        assertEquals("xxx", Task43.alignText("", 3, 'x'));
    }

    @Test
    void alignText_zeroWidthGivesEmpty() {
        assertEquals("", Task43.alignText("hi", 0, '.'));
    }

    @Test
    void alignText_throws_forNegativeWidth() {
        assertThrows(IllegalArgumentException.class, () -> Task43.alignText("hi", -1, '.'));
    }
}
