package com.course.tasks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task45Test {

    @Test
    void capitalizeAfterDots_basic() {
        assertEquals("Hello. How are you. Fine.",
                Task45.capitalizeAfterDots("hello. how are you. fine."));
    }

    @Test
    void capitalizeAfterDots_empty() {
        assertEquals("", Task45.capitalizeAfterDots(""));
    }

    @Test
    void capitalizeAfterDots_capitalizesStart() {
        assertEquals("Abc", Task45.capitalizeAfterDots("abc"));
    }

    @Test
    void capitalizeAfterDots_multipleSpacesAfterDot() {
        assertEquals("One.   Two", Task45.capitalizeAfterDots("one.   two"));
    }

    @Test
    void capitalizeAfterDots_consecutiveDots() {
        assertEquals("Wait...What", Task45.capitalizeAfterDots("wait...what"));
    }

    @Test
    void capitalizeAfterDots_alreadyCapitalized() {
        assertEquals("Hi. There.", Task45.capitalizeAfterDots("Hi. There."));
    }
}
