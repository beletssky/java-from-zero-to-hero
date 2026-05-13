package com.course.tasks;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class Task14Test {

    @ParameterizedTest
    @CsvSource({
        "1, Пн",
        "2, Вт",
        "3, Ср",
        "4, Чт",
        "5, Пт",
        "6, Сб",
        "7, Вс"
    })
    void dayName_validDays(int n, String expected) {
        assertEquals(expected, Task14.dayName(n));
    }

    @ParameterizedTest
    @ValueSource(ints = {0, 8, -1, 100})
    void dayName_invalidReturnsQuestion(int n) {
        assertEquals("?", Task14.dayName(n));
    }
}
