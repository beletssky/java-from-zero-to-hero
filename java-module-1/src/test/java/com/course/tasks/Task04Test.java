package com.course.tasks;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class Task04Test {

    @Test
    void concat_basicCase() {
        assertEquals("Hello World", Task04.concat("Hello", "World"));
    }

    @Test
    void concat_emptyStrings() {
        assertEquals(" ", Task04.concat("", ""));
    }

    @Test
    void concat_oneEmpty() {
        assertEquals("Hi ", Task04.concat("Hi", ""));
    }

    @Test
    void concat_singleSpaceBetween() {
        String r = Task04.concat("a", "b");
        assertEquals(3, r.length());
        assertEquals(' ', r.charAt(1));
    }
}
