package com.course.tasks;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Task06Test {

    @Test
    void constructor_setsAllFields() {
        Task06 p = new Task06("Alice", 30);
        assertEquals("Alice", p.getName());
        assertEquals(30, p.getAge());
    }

    @Test
    void getters_returnValues() {
        Task06 p = new Task06("Bob", 0);
        assertEquals("Bob", p.getName());
        assertEquals(0, p.getAge());
    }

    @Test
    void setAge_updatesValue() {
        Task06 p = new Task06("Alice", 30);
        p.setAge(45);
        assertEquals(45, p.getAge());
    }

    @Test
    void setAge_throwsForInvalid() {
        Task06 p = new Task06("Alice", 30);
        assertThrows(IllegalArgumentException.class, () -> p.setAge(-1));
        assertThrows(IllegalArgumentException.class, () -> p.setAge(151));
    }

    @Test
    void constructor_throwsForInvalidAge() {
        assertThrows(IllegalArgumentException.class, () -> new Task06("Alice", -5));
        assertThrows(IllegalArgumentException.class, () -> new Task06("Alice", 200));
    }

    @Test
    void equals_returnsTrue_forSameValues() {
        Task06 a = new Task06("Alice", 30);
        Task06 b = new Task06("Alice", 30);
        assertEquals(a, b);
        assertEquals(a.hashCode(), b.hashCode());
    }

    @Test
    void equals_returnsFalse_forDifferent() {
        Task06 a = new Task06("Alice", 30);
        Task06 b = new Task06("Alice", 31);
        assertNotEquals(a, b);
    }

    @Test
    void toString_containsNameAndFields() {
        String s = new Task06("Alice", 30).toString();
        assertTrue(s.contains("Person"));
        assertTrue(s.contains("Alice"));
        assertTrue(s.contains("30"));
    }
}
