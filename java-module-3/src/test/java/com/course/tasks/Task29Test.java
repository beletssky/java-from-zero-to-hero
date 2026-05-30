package com.course.tasks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task29Test {

    @Test
    void constructorReducesAndSetsFields() {
        Task29 f = new Task29(2, 4);
        assertEquals(1, f.getNumerator());
        assertEquals(2, f.getDenominator());
    }

    @Test
    void gettersReturnReducedValues() {
        Task29 f = new Task29(6, 3);
        assertEquals(2, f.getNumerator());
        assertEquals(1, f.getDenominator());
    }

    @Test
    void constructorThrowsWhenDenominatorZero() {
        assertThrows(IllegalArgumentException.class, () -> new Task29(1, 0));
    }

    @Test
    void equalsTrueForEquivalentFractions() {
        Task29 a = new Task29(2, 4);
        Task29 b = new Task29(1, 2);
        assertEquals(a, b);
        assertEquals(a.hashCode(), b.hashCode());
    }

    @Test
    void equalsFalseForDifferentFractions() {
        assertNotEquals(new Task29(1, 2), new Task29(1, 3));
    }

    @Test
    void toStringFormatsFractionWithSlash() {
        assertEquals("3/4", new Task29(3, 4).toString());
    }

    @Test
    void toStringFormatsWholeNumberWhenDenominatorReducesToOne() {
        assertEquals("2", new Task29(6, 3).toString());
    }
}
