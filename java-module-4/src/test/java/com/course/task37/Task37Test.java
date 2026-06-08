package com.course.task37;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Task37Test {

    @Test
    void areaShouldEqualPiTimesRadiusSquared() {
        Circle c = new Circle("red", 2.0);
        assertEquals(Math.PI * 4.0, c.area(), 1e-9);
    }

    @Test
    void drawShouldDescribeCircleWithRadius() {
        Circle c = new Circle("red", 2.5);
        assertEquals("drawing circle r=2.5", c.draw());
    }

    @Test
    void resizeShouldMultiplyRadiusAndChangeArea() {
        Circle c = new Circle("blue", 2.0);
        c.resize(3.0);
        assertEquals(6.0, c.getRadius(), 1e-9);
        assertEquals(Math.PI * 36.0, c.area(), 1e-9);
    }

    @Test
    void describeShouldIncludeColorAndRadius() {
        Circle c = new Circle("green", 1.5);
        assertEquals("Circle color=green r=1.5", c.describe());
    }

    @Test
    void polymorphismThroughShapeReference() {
        Shape s = new Circle("red", 1.0);
        assertEquals(Math.PI, s.area(), 1e-9);
        assertEquals("red", s.getColor());
    }

    @Test
    void polymorphismThroughDrawableReference() {
        Drawable d = new Circle("red", 4.0);
        assertEquals("drawing circle r=4.0", d.draw());
    }

    @Test
    void polymorphismThroughResizableReference() {
        Resizable r = new Circle("red", 2.0);
        r.resize(2.0);
        assertEquals("Circle color=red r=4.0", r.describe());
    }
}
