package com.course.tasks;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Task33Test {

    @Test
    void constructorSetsFields() {
        Task33 p = new Task33(1, 2, Task33.Direction.NORTH);
        assertEquals(1, p.getX());
        assertEquals(2, p.getY());
        assertEquals(Task33.Direction.NORTH, p.getFacing());
    }

    @Test
    void settersChangeFields() {
        Task33 p = new Task33(0, 0, Task33.Direction.NORTH);
        p.setX(5);
        p.setY(7);
        p.setFacing(Task33.Direction.WEST);
        assertEquals(5, p.getX());
        assertEquals(7, p.getY());
        assertEquals(Task33.Direction.WEST, p.getFacing());
    }

    @Test
    void moveNorthIncreasesY() {
        Task33 p = new Task33(0, 0, Task33.Direction.NORTH);
        p.move(3);
        assertEquals(0, p.getX());
        assertEquals(3, p.getY());
    }

    @Test
    void moveSouthDecreasesY() {
        Task33 p = new Task33(0, 0, Task33.Direction.SOUTH);
        p.move(4);
        assertEquals(0, p.getX());
        assertEquals(-4, p.getY());
    }

    @Test
    void moveEastIncreasesXAndWestDecreasesX() {
        Task33 east = new Task33(0, 0, Task33.Direction.EAST);
        east.move(2);
        assertEquals(2, east.getX());
        assertEquals(0, east.getY());

        Task33 west = new Task33(0, 0, Task33.Direction.WEST);
        west.move(2);
        assertEquals(-2, west.getX());
        assertEquals(0, west.getY());
    }

    @Test
    void equalsAndNotEquals() {
        Task33 a = new Task33(1, 1, Task33.Direction.EAST);
        Task33 b = new Task33(1, 1, Task33.Direction.EAST);
        Task33 c = new Task33(1, 2, Task33.Direction.EAST);
        assertEquals(a, b);
        assertNotEquals(a, c);
    }

    @Test
    void toStringContainsPrefixAndValues() {
        String s = new Task33(3, 4, Task33.Direction.EAST).toString();
        assertTrue(s.contains("Player"));
        assertTrue(s.contains("EAST"));
    }
}
