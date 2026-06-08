package com.course.task08;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Task08Test {

    @Test
    void pointConstructorSetsCoordinates() {
        Point p = new Point(3, 4);
        assertEquals(3, p.getX());
        assertEquals(4, p.getY());
    }

    @Test
    void pointMoveUpdatesCoordinates() {
        Point p = new Point(1, 1);
        p.move(2, 3);
        assertEquals(3, p.getX());
        assertEquals(4, p.getY());
    }

    @Test
    void pointToStringFormatsCorrectly() {
        Point p = new Point(5, 7);
        assertEquals("(5,7)", p.toString());
    }

    @Test
    void coloredPointConstructorSetsAllFields() {
        ColoredPoint cp = new ColoredPoint(1, 2, "red");
        assertEquals(1, cp.getX());
        assertEquals(2, cp.getY());
        assertEquals("red", cp.getColor());
    }

    @Test
    void coloredPointToStringOverridesParent() {
        ColoredPoint cp = new ColoredPoint(1, 2, "red");
        assertEquals("(1,2,red)", cp.toString());
    }

    @Test
    void polymorphicReferenceCallsOverriddenToString() {
        Point p = new ColoredPoint(0, 0, "blue");
        assertEquals("(0,0,blue)", p.toString());
    }

    @Test
    void coloredPointInheritsMove() {
        ColoredPoint cp = new ColoredPoint(0, 0, "green");
        cp.move(5, -2);
        assertEquals(5, cp.getX());
        assertEquals(-2, cp.getY());
    }
}
