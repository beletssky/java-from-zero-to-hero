package com.course.task45;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Task45Test {

    @Test
    void lightEnumExposesCorrectSeconds() {
        assertEquals(30, Light.RED.getSeconds());
        assertEquals(3, Light.YELLOW.getSeconds());
        assertEquals(27, Light.GREEN.getSeconds());
    }

    @Test
    void constructorAndGetterStoreStart() {
        Intersection intersection = new Intersection(Light.RED);
        assertEquals(Light.RED, intersection.getCurrent());
    }

    @Test
    void nextCyclesThroughLightsFromRed() {
        Intersection intersection = new Intersection(Light.RED);
        intersection.next();
        assertEquals(Light.GREEN, intersection.getCurrent());
        intersection.next();
        assertEquals(Light.YELLOW, intersection.getCurrent());
        intersection.next();
        assertEquals(Light.RED, intersection.getCurrent());
    }

    @Test
    void getCurrentSecondsMatchesCurrentLight() {
        Intersection intersection = new Intersection(Light.RED);
        assertEquals(30, intersection.getCurrentSeconds());
        intersection.next();
        assertEquals(27, intersection.getCurrentSeconds());
        intersection.next();
        assertEquals(3, intersection.getCurrentSeconds());
    }

    @Test
    void nextFromGreenGoesToYellow() {
        Intersection intersection = new Intersection(Light.GREEN);
        intersection.next();
        assertEquals(Light.YELLOW, intersection.getCurrent());
        assertEquals(3, intersection.getCurrentSeconds());
    }

    @Test
    void nextFromYellowGoesToRed() {
        Intersection intersection = new Intersection(Light.YELLOW);
        intersection.next();
        assertEquals(Light.RED, intersection.getCurrent());
        assertEquals(30, intersection.getCurrentSeconds());
    }
}
