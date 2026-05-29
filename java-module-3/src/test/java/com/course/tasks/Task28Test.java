package com.course.tasks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task28Test {

    private static final double DELTA = 1e-9;

    @Test
    void constructorSetsAllFields() {
        Task28 v = new Task28(3.0, 4.0);
        assertEquals(3.0, v.getX(), DELTA);
        assertEquals(4.0, v.getY(), DELTA);
    }

    @Test
    void gettersReturnValues() {
        Task28 v = new Task28(-1.5, 2.5);
        assertEquals(-1.5, v.getX(), DELTA);
        assertEquals(2.5, v.getY(), DELTA);
    }

    @Test
    void addReturnsNewVectorWithComponentSum() {
        Task28 a = new Task28(1.0, 2.0);
        Task28 b = new Task28(3.0, 4.0);
        Task28 sum = a.add(b);
        assertEquals(4.0, sum.getX(), DELTA);
        assertEquals(6.0, sum.getY(), DELTA);
        assertNotSame(a, sum);
        assertNotSame(b, sum);
    }

    @Test
    void lengthComputesEuclideanNorm() {
        assertEquals(5.0, new Task28(3.0, 4.0).length(), DELTA);
    }

    @Test
    void equalsAndHashCodeEqualForSameComponents() {
        Task28 a = new Task28(3.0, 4.0);
        Task28 b = new Task28(3.0, 4.0);
        assertEquals(a, b);
        assertEquals(a.hashCode(), b.hashCode());
    }

    @Test
    void equalsFalseForDifferentComponents() {
        assertNotEquals(new Task28(3.0, 4.0), new Task28(3.0, 5.0));
    }

    @Test
    void toStringContainsNameAndValues() {
        Task28 v = new Task28(3.0, 4.0);
        String s = v.toString();
        assertTrue(s.contains("Vector2D"));
        assertTrue(s.contains("3.0"));
        assertTrue(s.contains("4.0"));
    }
}
