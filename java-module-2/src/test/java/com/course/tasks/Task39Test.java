package com.course.tasks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task39Test {

    @Test
    void formatPhoneNumber_basic() {
        assertEquals("(050) 123-45-67", Task39.formatPhoneNumber("0501234567"));
    }

    @Test
    void formatPhoneNumber_anotherNumber() {
        assertEquals("(987) 654-32-10", Task39.formatPhoneNumber("9876543210"));
    }

    @Test
    void formatPhoneNumber_throws_forWrongLength() {
        assertThrows(IllegalArgumentException.class, () -> Task39.formatPhoneNumber("12345"));
    }

    @Test
    void formatPhoneNumber_throws_forNonDigits() {
        assertThrows(IllegalArgumentException.class, () -> Task39.formatPhoneNumber("05012345ab"));
    }

    @Test
    void formatPhoneNumber_throws_forNull() {
        assertThrows(IllegalArgumentException.class, () -> Task39.formatPhoneNumber(null));
    }
}
