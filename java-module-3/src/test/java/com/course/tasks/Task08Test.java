package com.course.tasks;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Task08Test {

    @Test
    void constructor_setsAllFields() {
        Task08 p = new Task08("0501234567");
        assertEquals("0501234567", p.getNumber());
    }

    @Test
    void getter_returnsValue() {
        Task08 p = new Task08("0987654321");
        assertEquals("0987654321", p.getNumber());
    }

    @Test
    void format_returnsFormattedNumber() {
        Task08 p = new Task08("0501234567");
        assertEquals("(050) 123-45-67", p.format());
    }

    @Test
    void constructor_throwsForWrongLength() {
        assertThrows(IllegalArgumentException.class, () -> new Task08("12345"));
        assertThrows(IllegalArgumentException.class, () -> new Task08("01234567890"));
    }

    @Test
    void constructor_throwsForNonDigits() {
        assertThrows(IllegalArgumentException.class, () -> new Task08("05012E4567"));
    }

    @Test
    void equals_returnsTrue_forSameValues() {
        Task08 a = new Task08("0501234567");
        Task08 b = new Task08("0501234567");
        assertEquals(a, b);
        assertEquals(a.hashCode(), b.hashCode());
    }

    @Test
    void equals_returnsFalse_forDifferent() {
        Task08 a = new Task08("0501234567");
        Task08 b = new Task08("0987654321");
        assertNotEquals(a, b);
    }

    @Test
    void toString_containsNameAndFields() {
        String s = new Task08("0501234567").toString();
        assertTrue(s.contains("PhoneNumber"));
        assertTrue(s.contains("0501234567"));
    }
}
