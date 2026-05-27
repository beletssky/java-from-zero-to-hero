package com.course.tasks;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Task14Test {

    @Test
    void constructor_setsAllFields() {
        Task14 u = new Task14("ivan42", "a@b.com", 30);
        assertEquals("ivan42", u.getUsername());
        assertEquals("a@b.com", u.getEmail());
        assertEquals(30, u.getAge());
    }

    @Test
    void setEmail_updatesValue() {
        Task14 u = new Task14("ivan42", "a@b.com", 30);
        u.setEmail("new@mail.com");
        assertEquals("new@mail.com", u.getEmail());
    }

    @Test
    void setAge_updatesValue() {
        Task14 u = new Task14("ivan42", "a@b.com", 30);
        u.setAge(40);
        assertEquals(40, u.getAge());
    }

    @Test
    void constructor_throwsForShortUsername() {
        assertThrows(IllegalArgumentException.class, () -> new Task14("ab", "a@b.com", 30));
    }

    @Test
    void constructor_throwsForBadEmail() {
        assertThrows(IllegalArgumentException.class, () -> new Task14("ivan42", "bademail", 30));
    }

    @Test
    void setAge_throwsForNegative() {
        Task14 u = new Task14("ivan42", "a@b.com", 30);
        assertThrows(IllegalArgumentException.class, () -> u.setAge(-1));
    }

    @Test
    void setEmail_throwsForMissingAt() {
        Task14 u = new Task14("ivan42", "a@b.com", 30);
        assertThrows(IllegalArgumentException.class, () -> u.setEmail("bad"));
    }

    @Test
    void equals_returnsTrue_forSameValues() {
        Task14 a = new Task14("ivan42", "a@b.com", 30);
        Task14 b = new Task14("ivan42", "a@b.com", 30);
        assertEquals(a, b);
        assertEquals(a.hashCode(), b.hashCode());
    }

    @Test
    void equals_returnsFalse_forDifferentValues() {
        Task14 a = new Task14("ivan42", "a@b.com", 30);
        Task14 b = new Task14("petro1", "a@b.com", 30);
        assertNotEquals(a, b);
    }

    @Test
    void toString_containsNameAndFields() {
        Task14 u = new Task14("ivan42", "a@b.com", 30);
        String s = u.toString();
        assertTrue(s.contains("User"));
        assertTrue(s.contains("ivan42"));
        assertTrue(s.contains("a@b.com"));
        assertTrue(s.contains("30"));
    }
}
