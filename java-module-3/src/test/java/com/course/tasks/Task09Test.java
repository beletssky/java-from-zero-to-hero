package com.course.tasks;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Task09Test {

    @Test
    void constructor_setsAllFields() {
        Task09 m = new Task09(12345L, "USD");
        assertEquals(12345L, m.getAmount());
        assertEquals("USD", m.getCurrency());
    }

    @Test
    void getters_returnValues() {
        Task09 m = new Task09(500L, "EUR");
        assertEquals(500L, m.getAmount());
        assertEquals("EUR", m.getCurrency());
    }

    @Test
    void toMajor_returnsAmountDividedBy100() {
        Task09 m = new Task09(12345L, "UAH");
        assertEquals(123.45, m.toMajor(), 1e-9);
    }

    @Test
    void constructor_throwsForInvalidCurrency() {
        assertThrows(IllegalArgumentException.class, () -> new Task09(100L, "usd"));
        assertThrows(IllegalArgumentException.class, () -> new Task09(100L, "US"));
        assertThrows(IllegalArgumentException.class, () -> new Task09(100L, "USDD"));
        assertThrows(IllegalArgumentException.class, () -> new Task09(100L, "U1D"));
    }

    @Test
    void equals_returnsTrue_forSameValues() {
        Task09 a = new Task09(12345L, "USD");
        Task09 b = new Task09(12345L, "USD");
        assertEquals(a, b);
        assertEquals(a.hashCode(), b.hashCode());
    }

    @Test
    void equals_returnsFalse_forDifferent() {
        Task09 a = new Task09(12345L, "USD");
        Task09 b = new Task09(12345L, "EUR");
        assertNotEquals(a, b);
    }

    @Test
    void toString_containsNameAndFields() {
        String s = new Task09(12345L, "USD").toString();
        assertTrue(s.contains("Money"));
        assertTrue(s.contains("12345"));
        assertTrue(s.contains("USD"));
    }
}
