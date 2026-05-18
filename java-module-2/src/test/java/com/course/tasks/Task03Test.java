package com.course.tasks;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class Task03Test {

    private static final double EPS = 1e-9;

    @ParameterizedTest
    @CsvSource({
            "0.0, 32.0",
            "100.0, 212.0",
            "-40.0, -40.0",
            "37.0, 98.6"
    })
    void celsiusToFahrenheit_knownValues(double c, double expected) {
        assertEquals(expected, Task03.celsiusToFahrenheit(c), EPS);
    }

    @Test
    void celsiusToFahrenheit_zeroIsThirtyTwo() {
        assertEquals(32.0, Task03.celsiusToFahrenheit(0), EPS);
    }

    @Test
    void celsiusToFahrenheit_negativeBelowFreezing() {
        assertEquals(14.0, Task03.celsiusToFahrenheit(-10), EPS);
    }

    @Test
    void celsiusToFahrenheit_fractional() {
        assertEquals(99.5, Task03.celsiusToFahrenheit(37.5), EPS);
    }
}
