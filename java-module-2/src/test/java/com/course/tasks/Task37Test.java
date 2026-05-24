package com.course.tasks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task37Test {

    @Test
    void describeNumber_positiveEven() {
        assertEquals("n=42, sign=positive, parity=even, digits=2", Task37.describeNumber(42));
    }

    @Test
    void describeNumber_negativeOdd() {
        assertEquals("n=-105, sign=negative, parity=odd, digits=3", Task37.describeNumber(-105));
    }

    @Test
    void describeNumber_zero() {
        assertEquals("n=0, sign=zero, parity=even, digits=1", Task37.describeNumber(0));
    }

    @Test
    void describeNumber_singleDigitOdd() {
        assertEquals("n=7, sign=positive, parity=odd, digits=1", Task37.describeNumber(7));
    }

    @Test
    void describeNumber_negativeEven() {
        assertEquals("n=-8, sign=negative, parity=even, digits=1", Task37.describeNumber(-8));
    }
}
