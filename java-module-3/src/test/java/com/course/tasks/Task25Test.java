package com.course.tasks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task25Test {

    @Test
    void constructorSetsAllFields() {
        Task25 a = new Task25("Kyiv", "Main", "10");
        assertEquals("Kyiv", a.getCity());
        assertEquals("Main", a.getStreet());
        assertEquals("10", a.getBuilding());
    }

    @Test
    void gettersReturnValues() {
        Task25 a = new Task25("Lviv", "Svobody", "1A");
        assertEquals("Lviv", a.getCity());
        assertEquals("Svobody", a.getStreet());
        assertEquals("1A", a.getBuilding());
    }

    @Test
    void constructorThrowsOnNull() {
        assertThrows(IllegalArgumentException.class, () -> new Task25(null, "Main", "10"));
        assertThrows(IllegalArgumentException.class, () -> new Task25("Kyiv", null, "10"));
        assertThrows(IllegalArgumentException.class, () -> new Task25("Kyiv", "Main", null));
    }

    @Test
    void constructorThrowsOnBlank() {
        assertThrows(IllegalArgumentException.class, () -> new Task25("   ", "Main", "10"));
        assertThrows(IllegalArgumentException.class, () -> new Task25("Kyiv", "", "10"));
        assertThrows(IllegalArgumentException.class, () -> new Task25("Kyiv", "Main", "  "));
    }

    @Test
    void equalsAndHashCodeEqualForSameFields() {
        Task25 a = new Task25("Kyiv", "Main", "10");
        Task25 b = new Task25("Kyiv", "Main", "10");
        assertEquals(a, b);
        assertEquals(a.hashCode(), b.hashCode());
    }

    @Test
    void equalsFalseForDifferentFields() {
        Task25 a = new Task25("Kyiv", "Main", "10");
        Task25 b = new Task25("Kyiv", "Main", "11");
        assertNotEquals(a, b);
    }

    @Test
    void toStringContainsNameAndValues() {
        Task25 a = new Task25("Kyiv", "Main", "10");
        String s = a.toString();
        assertTrue(s.contains("Address"));
        assertTrue(s.contains("Kyiv"));
        assertTrue(s.contains("Main"));
        assertTrue(s.contains("10"));
    }
}
