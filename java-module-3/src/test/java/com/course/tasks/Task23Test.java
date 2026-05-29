package com.course.tasks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task23Test {

    @Test
    void constructorSetsValue() {
        Task23 isbn = new Task23("9781234567897");
        assertEquals("9781234567897", isbn.getValue());
    }

    @Test
    void getterReturnsValue() {
        Task23 isbn = new Task23("0000000000000");
        assertEquals("0000000000000", isbn.getValue());
    }

    @Test
    void constructorThrowsWhenLengthNot13() {
        assertThrows(IllegalArgumentException.class, () -> new Task23("123456789012"));
        assertThrows(IllegalArgumentException.class, () -> new Task23("12345678901234"));
    }

    @Test
    void constructorThrowsWhenContainsNonDigit() {
        assertThrows(IllegalArgumentException.class, () -> new Task23("97812345678X7"));
    }

    @Test
    void equalsAndHashCodeBasedOnValue() {
        Task23 a = new Task23("9781234567897");
        Task23 b = new Task23("9781234567897");
        assertEquals(a, b);
        assertEquals(a.hashCode(), b.hashCode());
    }

    @Test
    void equalsFalseForDifferentValue() {
        Task23 a = new Task23("9781234567897");
        Task23 b = new Task23("9789876543210");
        assertNotEquals(a, b);
    }

    @Test
    void toStringContainsNameAndValue() {
        Task23 isbn = new Task23("9781234567897");
        String s = isbn.toString();
        assertTrue(s.contains("ISBN"));
        assertTrue(s.contains("9781234567897"));
    }
}
