package com.course.tasks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task27Test {

    @Test
    void constructorSetsAllFields() {
        Task27 o = new Task27(1L, "Ivan", 12300L, false);
        assertEquals(1L, o.getId());
        assertEquals("Ivan", o.getCustomer());
        assertEquals(12300L, o.getTotalKopecks());
        assertFalse(o.isPaid());
    }

    @Test
    void gettersReturnValues() {
        Task27 o = new Task27(42L, "Petro", 5000L, true);
        assertEquals(42L, o.getId());
        assertEquals("Petro", o.getCustomer());
        assertEquals(5000L, o.getTotalKopecks());
        assertTrue(o.isPaid());
    }

    @Test
    void markAsPaidSetsPaidTrue() {
        Task27 o = new Task27(1L, "Ivan", 12300L, false);
        o.markAsPaid();
        assertTrue(o.isPaid());
    }

    @Test
    void equalsAndHashCodeBasedOnIdOnly() {
        Task27 a = new Task27(1L, "Ivan", 12300L, false);
        Task27 b = new Task27(1L, "Petro", 99999L, true);
        assertEquals(a, b);
        assertEquals(a.hashCode(), b.hashCode());
    }

    @Test
    void equalsFalseForDifferentId() {
        Task27 a = new Task27(1L, "Ivan", 12300L, false);
        Task27 b = new Task27(2L, "Ivan", 12300L, false);
        assertNotEquals(a, b);
    }

    @Test
    void toStringContainsNameAndValues() {
        Task27 o = new Task27(1L, "Ivan", 12300L, false);
        String s = o.toString();
        assertTrue(s.contains("Order"));
        assertTrue(s.contains("1"));
        assertTrue(s.contains("Ivan"));
        assertTrue(s.contains("12300"));
        assertTrue(s.contains("false"));
    }
}
