package com.course.task34;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Task34Test {

    @Test
    void piConstantIsAccessibleViaInterface() {
        assertEquals(3.14159, MathConstants.PI, 1e-9);
    }

    @Test
    void eConstantIsAccessibleViaInterface() {
        assertEquals(2.71828, MathConstants.E, 1e-9);
    }

    @Test
    void circleAreaForRadiusTwo() {
        Calculator c = new Calculator();
        assertEquals(3.14159 * 4.0, c.circleArea(2.0), 1e-9);
    }

    @Test
    void circleAreaForRadiusOne() {
        Calculator c = new Calculator();
        assertEquals(3.14159, c.circleArea(1.0), 1e-9);
    }

    @Test
    void expReturnsEConstant() {
        Calculator c = new Calculator();
        assertEquals(2.71828, c.exp(), 1e-9);
    }
}
