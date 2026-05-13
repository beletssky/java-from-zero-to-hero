package com.course.tasks;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class Task18Test {

    @ParameterizedTest
    @CsvSource({
        "red, stop",
        "yellow, slow",
        "green, go",
        "RED, stop",
        "Yellow, slow",
        "GREEN, go"
    })
    void trafficLight_returnsExpected(String color, String expected) {
        assertEquals(expected, Task18.trafficLightAction(color));
    }

    @Test
    void trafficLight_unknownReturnsWait() {
        assertEquals("wait", Task18.trafficLightAction("blue"));
    }

    @Test
    void trafficLight_emptyReturnsWait() {
        assertEquals("wait", Task18.trafficLightAction(""));
    }
}
