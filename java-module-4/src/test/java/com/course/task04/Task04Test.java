package com.course.task04;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Task04Test {

    @Test
    void shapeConstructorSetsColor() {
        Shape s = new Shape("red");
        assertEquals("red", s.getColor());
    }

    @Test
    void shapeAreaReturnsZero() {
        Shape s = new Shape("red");
        assertEquals(0.0, s.area(), 1e-9);
    }

    @Test
    void rectangleConstructorSetsAllFields() {
        Rectangle r = new Rectangle("blue", 4.0, 5.0);
        assertEquals("blue", r.getColor());
        assertEquals(4.0, r.getWidth(), 1e-9);
        assertEquals(5.0, r.getHeight(), 1e-9);
    }

    @Test
    void rectangleAreaOverridesParent() {
        Rectangle r = new Rectangle("blue", 4.0, 5.0);
        assertEquals(20.0, r.area(), 1e-9);
    }

    @Test
    void polymorphicReferenceCallsOverriddenArea() {
        Shape s = new Rectangle("green", 2.5, 3.0);
        assertEquals(7.5, s.area(), 1e-9);
        assertEquals("green", s.getColor());
    }
}
