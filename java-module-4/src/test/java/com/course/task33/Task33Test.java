package com.course.task33;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Task33Test {

    @Test
    void duckFlyReturnsFlying() {
        Duck d = new Duck();
        assertEquals("flying", d.fly());
    }

    @Test
    void duckSwimReturnsSwimming() {
        Duck d = new Duck();
        assertEquals("swimming", d.swim());
    }

    @Test
    void duckShowAllCombinesBoth() {
        Duck d = new Duck();
        assertEquals("flying, swimming", d.showAll());
    }

    @Test
    void duckAsFlyable() {
        Flyable f = new Duck();
        assertEquals("flying", f.fly());
    }

    @Test
    void duckAsSwimmable() {
        Swimmable s = new Duck();
        assertEquals("swimming", s.swim());
    }
}
