package com.course.task35;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Task35Test {

    @Test
    void newStackHasSizeZero() {
        IntStack s = new IntStack();
        assertEquals(0, s.size());
    }

    @Test
    void pushIncreasesSize() {
        IntStack s = new IntStack();
        s.push(1);
        s.push(2);
        s.push(3);
        assertEquals(3, s.size());
    }

    @Test
    void peekReturnsTopWithoutRemoving() {
        IntStack s = new IntStack();
        s.push(1);
        s.push(2);
        s.push(3);
        assertEquals(3, s.peek());
        assertEquals(3, s.size());
    }

    @Test
    void popReturnsLifoOrder() {
        IntStack s = new IntStack();
        s.push(1);
        s.push(2);
        s.push(3);
        assertEquals(3, s.pop());
        assertEquals(2, s.size());
        assertEquals(2, s.pop());
        assertEquals(1, s.size());
    }

    @Test
    void polymorphicSimpleStackReference() {
        SimpleStack s = new IntStack();
        s.push(42);
        assertEquals(1, s.size());
        assertEquals(42, s.peek());
        assertEquals(42, s.pop());
        assertEquals(0, s.size());
    }
}
