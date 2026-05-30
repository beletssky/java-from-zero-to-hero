package com.course.tasks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task22Test {

    @Test
    void constructorSetsAllFields() {
        Task22 p = new Task22("hello", "world");
        assertEquals("hello", p.getFirst());
        assertEquals("world", p.getSecond());
    }

    @Test
    void gettersReturnValues() {
        Task22 p = new Task22("key", "value");
        assertEquals("key", p.getFirst());
        assertEquals("value", p.getSecond());
    }

    @Test
    void constructorThrowsWhenFirstNull() {
        assertThrows(IllegalArgumentException.class, () -> new Task22(null, "b"));
    }

    @Test
    void constructorThrowsWhenSecondNull() {
        assertThrows(IllegalArgumentException.class, () -> new Task22("a", null));
    }

    @Test
    void equalsAndHashCodeEqualForSameFields() {
        Task22 a = new Task22("a", "b");
        Task22 b = new Task22("a", "b");
        assertEquals(a, b);
        assertEquals(a.hashCode(), b.hashCode());
    }

    @Test
    void equalsFalseForDifferentFields() {
        Task22 a = new Task22("a", "b");
        Task22 b = new Task22("a", "c");
        assertNotEquals(a, b);
    }

    @Test
    void toStringContainsNameAndValues() {
        Task22 p = new Task22("a", "b");
        String s = p.toString();
        assertTrue(s.contains("Pair"));
        assertTrue(s.contains("a"));
        assertTrue(s.contains("b"));
    }
}
