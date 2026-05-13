package com.course.tasks;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class Task19Test {

    @ParameterizedTest
    @CsvSource({
        "1, 1",
        "5, 15",
        "10, 55",
        "100, 5050"
    })
    void sumFromOneTo_basic(int n, long expected) {
        assertEquals(expected, Task19.sumFromOneTo(n));
    }

    @ParameterizedTest
    @ValueSource(ints = {0, -1, -100})
    void sumFromOneTo_nonPositiveReturnsZero(int n) {
        assertEquals(0L, Task19.sumFromOneTo(n));
    }

    @Test
    void sumFromOneTo_largeN_doesNotOverflow() {
        assertEquals(50_000_005_000_000L, Task19.sumFromOneTo(10_000_000));
    }
}
