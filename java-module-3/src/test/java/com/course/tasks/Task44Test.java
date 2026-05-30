package com.course.tasks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task44Test {

    private static final double DELTA = 1e-9;

    @Test
    void evaluateAtZeroReturnsConstant() {
        Task44 p = new Task44(new double[]{3.0, 2.0, 1.0});
        assertEquals(3.0, p.evaluate(0.0), DELTA);
    }

    @Test
    void evaluateAtKnownPoint() {
        // 3 + 2x + x^2 at x=2 -> 3 + 4 + 4 = 11
        Task44 p = new Task44(new double[]{3.0, 2.0, 1.0});
        assertEquals(11.0, p.evaluate(2.0), DELTA);
    }

    @Test
    void evaluateAtOne() {
        // sum of coefficients
        Task44 p = new Task44(new double[]{3.0, 2.0, 1.0});
        assertEquals(6.0, p.evaluate(1.0), DELTA);
    }

    @Test
    void evaluateLinear() {
        // 5 + 4x at x=3 -> 17
        Task44 p = new Task44(new double[]{5.0, 4.0});
        assertEquals(17.0, p.evaluate(3.0), DELTA);
    }

    @Test
    void evaluateNegativeX() {
        // 3 + 2x + x^2 at x=-1 -> 3 - 2 + 1 = 2
        Task44 p = new Task44(new double[]{3.0, 2.0, 1.0});
        assertEquals(2.0, p.evaluate(-1.0), DELTA);
    }

    @Test
    void toStringFormat() {
        Task44 p = new Task44(new double[]{3.0, 2.0, 1.0});
        assertEquals("3.0 + 2.0x + 1.0x^2", p.toString());
    }

    @Test
    void toStringLinearFormat() {
        Task44 p = new Task44(new double[]{5.0, 4.0});
        assertEquals("5.0 + 4.0x", p.toString());
    }

    @Test
    void equalsByCoefficients() {
        Task44 a = new Task44(new double[]{3.0, 2.0, 1.0});
        Task44 b = new Task44(new double[]{3.0, 2.0, 1.0});
        assertEquals(a, b);
        assertEquals(a.hashCode(), b.hashCode());
    }

    @Test
    void notEqualsDifferentCoefficients() {
        Task44 a = new Task44(new double[]{3.0, 2.0, 1.0});
        Task44 b = new Task44(new double[]{3.0, 2.0, 2.0});
        assertNotEquals(a, b);
    }

    @Test
    void constructorStoresCopy() {
        double[] coeffs = {3.0, 2.0, 1.0};
        Task44 p = new Task44(coeffs);
        coeffs[0] = 99.0;
        assertEquals(3.0, p.evaluate(0.0), DELTA);
    }
}
