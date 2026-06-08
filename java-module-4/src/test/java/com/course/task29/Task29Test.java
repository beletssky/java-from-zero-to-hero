package com.course.task29;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Task29Test {

    @Test
    void circleDrawReturnsDrawingCircle() {
        Circle c = new Circle();
        assertEquals("drawing circle", c.draw());
    }

    @Test
    void squareDrawReturnsDrawingSquare() {
        Square s = new Square();
        assertEquals("drawing square", s.draw());
    }

    @Test
    void polymorphismCircleAsDrawable() {
        Drawable d = new Circle();
        assertEquals("drawing circle", d.draw());
    }

    @Test
    void polymorphismSquareAsDrawable() {
        Drawable d = new Square();
        assertEquals("drawing square", d.draw());
    }

    @Test
    void arrayOfDrawablesIteratesCorrectly() {
        Drawable[] shapes = { new Circle(), new Square() };
        assertEquals("drawing circle", shapes[0].draw());
        assertEquals("drawing square", shapes[1].draw());
    }
}
