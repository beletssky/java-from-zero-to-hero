package com.course.tasks;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Task07Test {

    @Test
    void constructor_setsAllFields() {
        Task07 e = new Task07("user@example.com");
        assertEquals("user@example.com", e.getAddress());
    }

    @Test
    void getter_returnsValue() {
        Task07 e = new Task07("john.doe@mail.org");
        assertEquals("john.doe@mail.org", e.getAddress());
    }

    @Test
    void getDomain_returnsPartAfterAt() {
        Task07 e = new Task07("user@example.com");
        assertEquals("example.com", e.getDomain());
    }

    @Test
    void constructor_throwsForNull() {
        assertThrows(IllegalArgumentException.class, () -> new Task07(null));
    }

    @Test
    void constructor_throwsForMissingAtOrDot() {
        assertThrows(IllegalArgumentException.class, () -> new Task07("userexample.com"));
        assertThrows(IllegalArgumentException.class, () -> new Task07("user@examplecom"));
    }

    @Test
    void equals_returnsTrue_forSameValues() {
        Task07 a = new Task07("user@example.com");
        Task07 b = new Task07("user@example.com");
        assertEquals(a, b);
        assertEquals(a.hashCode(), b.hashCode());
    }

    @Test
    void equals_returnsFalse_forDifferent() {
        Task07 a = new Task07("user@example.com");
        Task07 b = new Task07("other@example.com");
        assertNotEquals(a, b);
    }

    @Test
    void toString_containsNameAndFields() {
        String s = new Task07("user@example.com").toString();
        assertTrue(s.contains("Email"));
        assertTrue(s.contains("user@example.com"));
    }
}
