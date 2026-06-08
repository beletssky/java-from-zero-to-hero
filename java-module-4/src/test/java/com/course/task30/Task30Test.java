package com.course.task30;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Task30Test {

    @Test
    void boxReturnsItsSize() {
        Box b = new Box(5);
        assertEquals(5, b.getSize());
    }

    @Test
    void buildingReturnsFloorsTimesThree() {
        Building b = new Building(4);
        assertEquals(12, b.getSize());
    }

    @Test
    void polymorphicArrayOfSized() {
        Sized[] arr = { new Box(5), new Building(4) };
        assertEquals(5, arr[0].getSize());
        assertEquals(12, arr[1].getSize());
    }

    @Test
    void buildingWithSingleFloor() {
        Sized s = new Building(1);
        assertEquals(3, s.getSize());
    }

    @Test
    void findLargerBetweenBoxAndBuilding() {
        Sized a = new Box(5);
        Sized b = new Building(4);
        Sized larger = a.getSize() >= b.getSize() ? a : b;
        assertEquals(12, larger.getSize());
        assertSame(b, larger);
    }
}
