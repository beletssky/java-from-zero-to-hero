package com.course.tasks;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Task12Test {

    @Test
    void constructor_setsAllFields() {
        Task12 c = new Task12();
        assertEquals(0, c.getValue());
    }

    @Test
    void increment_increasesValue() {
        Task12 c = new Task12();
        c.increment();
        c.increment();
        assertEquals(2, c.getValue());
    }

    @Test
    void decrement_decreasesValue() {
        Task12 c = new Task12();
        c.increment();
        c.increment();
        c.decrement();
        assertEquals(1, c.getValue());
    }

    @Test
    void decrement_throwsBelowZero() {
        Task12 c = new Task12();
        assertThrows(IllegalArgumentException.class, c::decrement);
    }

    @Test
    void reset_setsValueToZero() {
        Task12 c = new Task12();
        c.increment();
        c.increment();
        c.reset();
        assertEquals(0, c.getValue());
    }

    @Test
    void equals_returnsTrue_forSameValues() {
        Task12 a = new Task12();
        Task12 b = new Task12();
        a.increment();
        b.increment();
        assertEquals(a, b);
        assertEquals(a.hashCode(), b.hashCode());
    }

    @Test
    void equals_returnsFalse_forDifferentValues() {
        Task12 a = new Task12();
        Task12 b = new Task12();
        a.increment();
        assertNotEquals(a, b);
    }

    @Test
    void toString_containsNameAndFields() {
        Task12 c = new Task12();
        String s = c.toString();
        assertTrue(s.contains("Counter"));
        assertTrue(s.contains("0"));
    }
}
