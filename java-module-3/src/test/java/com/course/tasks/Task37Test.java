package com.course.tasks;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Task37Test {

    private static final double DELTA = 1e-9;

    @Test
    void addition() {
        assertEquals(5.0, new Task37().calculate(2, 3, Task37.Operation.ADD), DELTA);
    }

    @Test
    void subtraction() {
        assertEquals(-1.0, new Task37().calculate(2, 3, Task37.Operation.SUB), DELTA);
    }

    @Test
    void multiplication() {
        assertEquals(6.0, new Task37().calculate(2, 3, Task37.Operation.MUL), DELTA);
    }

    @Test
    void division() {
        assertEquals(2.0, new Task37().calculate(6, 3, Task37.Operation.DIV), DELTA);
    }

    @Test
    void divisionByZeroThrows() {
        assertThrows(ArithmeticException.class,
                () -> new Task37().calculate(1, 0, Task37.Operation.DIV));
    }

    @Test
    void twoInstancesAreEqual() {
        assertEquals(new Task37(), new Task37());
    }

    @Test
    void toStringContainsPrefix() {
        assertTrue(new Task37().toString().contains("Task37"));
    }
}
