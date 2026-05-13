package com.course.tasks;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class Task12Test {

    @Test
    void canVote_adultCitizen_canVote() {
        assertTrue(Task12.canVote(18, true));
    }

    @Test
    void canVote_minorCitizen_cannotVote() {
        assertFalse(Task12.canVote(17, true));
    }

    @Test
    void canVote_adultNonCitizen_cannotVote() {
        assertFalse(Task12.canVote(40, false));
    }

    @ParameterizedTest
    @CsvSource({
        "0, true, false",
        "17, false, false",
        "18, false, false",
        "100, true, true"
    })
    void canVote_variousCases(int age, boolean citizen, boolean expected) {
        assertEquals(expected, Task12.canVote(age, citizen));
    }
}
