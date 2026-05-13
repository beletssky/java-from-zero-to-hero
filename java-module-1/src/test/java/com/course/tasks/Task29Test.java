package com.course.tasks;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class Task29Test {

    @Test
    void multiplicationTable_forTwo_correctFullText() {
        String expected =
            "2 x 1 = 2\n" +
            "2 x 2 = 4\n" +
            "2 x 3 = 6\n" +
            "2 x 4 = 8\n" +
            "2 x 5 = 10\n" +
            "2 x 6 = 12\n" +
            "2 x 7 = 14\n" +
            "2 x 8 = 16\n" +
            "2 x 9 = 18\n" +
            "2 x 10 = 20";
        assertEquals(expected, Task29.multiplicationTable(2));
    }

    @Test
    void multiplicationTable_lastLineHasNoTrailingNewline() {
        String r = Task29.multiplicationTable(5);
        assertFalse(r.endsWith("\n"));
        assertTrue(r.endsWith("5 x 10 = 50"));
    }

    @Test
    void multiplicationTable_hasExactlyTenLines() {
        String r = Task29.multiplicationTable(7);
        assertEquals(10, r.split("\n", -1).length);
    }

    @Test
    void multiplicationTable_zero() {
        String r = Task29.multiplicationTable(0);
        assertTrue(r.startsWith("0 x 1 = 0"));
        assertTrue(r.endsWith("0 x 10 = 0"));
    }
}
