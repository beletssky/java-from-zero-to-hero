package com.course.tasks;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class Task11Test {

    @ParameterizedTest
    @CsvSource({
        "100, A",
        "90, A",
        "89, B",
        "75, B",
        "74, C",
        "60, C",
        "59, D",
        "50, D",
        "49, F",
        "0, F"
    })
    void gradeLetter_returnsCorrectLetter(int score, char expected) {
        assertEquals(expected, Task11.gradeLetter(score));
    }

    @Test
    void gradeLetter_throwsForNegative() {
        assertThrows(IllegalArgumentException.class, () -> Task11.gradeLetter(-1));
    }

    @Test
    void gradeLetter_throwsForOverHundred() {
        assertThrows(IllegalArgumentException.class, () -> Task11.gradeLetter(101));
    }
}
