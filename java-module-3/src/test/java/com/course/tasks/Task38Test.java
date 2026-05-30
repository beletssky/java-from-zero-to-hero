package com.course.tasks;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Task38Test {

    @Test
    void constructorSetsCurrent() {
        Task38 c = new Task38(Task38.TrafficLight.RED);
        assertEquals(Task38.TrafficLight.RED, c.getCurrent());
    }

    @Test
    void setterChangesCurrent() {
        Task38 c = new Task38(Task38.TrafficLight.RED);
        c.setCurrent(Task38.TrafficLight.GREEN);
        assertEquals(Task38.TrafficLight.GREEN, c.getCurrent());
    }

    @Test
    void nextFromRedGoesGreen() {
        Task38 c = new Task38(Task38.TrafficLight.RED);
        c.next();
        assertEquals(Task38.TrafficLight.GREEN, c.getCurrent());
    }

    @Test
    void nextFromGreenGoesYellow() {
        Task38 c = new Task38(Task38.TrafficLight.GREEN);
        c.next();
        assertEquals(Task38.TrafficLight.YELLOW, c.getCurrent());
    }

    @Test
    void nextFromYellowGoesRed() {
        Task38 c = new Task38(Task38.TrafficLight.YELLOW);
        c.next();
        assertEquals(Task38.TrafficLight.RED, c.getCurrent());
    }

    @Test
    void fullCycleReturnsToStart() {
        Task38 c = new Task38(Task38.TrafficLight.RED);
        c.next(); // GREEN
        c.next(); // YELLOW
        c.next(); // RED
        assertEquals(Task38.TrafficLight.RED, c.getCurrent());
    }

    @Test
    void equalsAndToString() {
        Task38 a = new Task38(Task38.TrafficLight.RED);
        Task38 b = new Task38(Task38.TrafficLight.RED);
        Task38 d = new Task38(Task38.TrafficLight.GREEN);
        assertEquals(a, b);
        assertNotEquals(a, d);
        String s = a.toString();
        assertTrue(s.contains("Task38"));
        assertTrue(s.contains("RED"));
    }
}
