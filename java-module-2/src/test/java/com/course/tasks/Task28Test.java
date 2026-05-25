package com.course.tasks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task28Test {

    @Test
    void isDigitOnly_allDigits() {
        assertTrue(Task28.isDigitOnly("12345"));
    }

    @Test
    void isDigitOnly_containsLetter() {
        assertFalse(Task28.isDigitOnly("12a4"));
    }

    @Test
    void isDigitOnly_emptyIsFalse() {
        assertFalse(Task28.isDigitOnly(""));
    }

    @Test
    void isDigitOnly_nullIsFalse() {
        assertFalse(Task28.isDigitOnly(null));
    }

    @Test
    void isDigitOnly_singleDigit() {
        assertTrue(Task28.isDigitOnly("7"));
    }

    @Test
    void isDigitOnly_withSpaces() {
        assertFalse(Task28.isDigitOnly("12 34"));
    }
}
