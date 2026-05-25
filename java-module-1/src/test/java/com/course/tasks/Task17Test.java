package com.course.tasks;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class Task17Test {

    @ParameterizedTest
    @CsvSource({
        "12, winter",
        "1, winter",
        "2, winter",
        "3, spring",
        "4, spring",
        "5, spring",
        "6, summer",
        "7, summer",
        "8, summer",
        "9, autumn",
        "10, autumn",
        "11, autumn"
    })
    void seasonByMonth_returnsCorrectSeason(int month, String expected) {
        assertEquals(expected, Task17.seasonByMonth(month));
    }

    @ParameterizedTest
    @ValueSource(ints = {0, 13, -1, 100})
    void seasonByMonth_invalidThrows(int month) {
        assertThrows(IllegalArgumentException.class, () -> Task17.seasonByMonth(month));
    }
}
