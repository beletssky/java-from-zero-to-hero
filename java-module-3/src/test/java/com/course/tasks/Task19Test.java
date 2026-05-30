package com.course.tasks;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Task19Test {

    @Test
    void constructor_storesRawAsHash() {
        Task19 p = new Task19("Secret12");
        assertEquals("Secret12", p.getHash());
    }

    @Test
    void matches_returnsTrueForSameRaw() {
        Task19 p = new Task19("Secret12");
        assertTrue(p.matches("Secret12"));
    }

    @Test
    void matches_returnsFalseForDifferentRaw() {
        Task19 p = new Task19("Secret12");
        assertFalse(p.matches("Wrong123"));
    }

    @Test
    void constructor_throwsForTooShort() {
        assertThrows(IllegalArgumentException.class, () -> new Task19("Ab1"));
    }

    @Test
    void constructor_throwsForNoDigit() {
        assertThrows(IllegalArgumentException.class, () -> new Task19("Password"));
    }

    @Test
    void constructor_throwsForNoUppercase() {
        assertThrows(IllegalArgumentException.class, () -> new Task19("secret12"));
    }

    @Test
    void equals_returnsTrue_forSameValues() {
        Task19 a = new Task19("Secret12");
        Task19 b = new Task19("Secret12");
        assertEquals(a, b);
        assertEquals(a.hashCode(), b.hashCode());
    }

    @Test
    void equals_returnsFalse_forDifferentValues() {
        Task19 a = new Task19("Secret12");
        Task19 b = new Task19("Another9");
        assertNotEquals(a, b);
    }

    @Test
    void toString_hidesRawAndContainsMask() {
        Task19 p = new Task19("Secret12");
        String s = p.toString();
        assertFalse(s.contains("Secret12"));
        assertTrue(s.contains("***"));
        assertTrue(s.contains("Password"));
    }
}
