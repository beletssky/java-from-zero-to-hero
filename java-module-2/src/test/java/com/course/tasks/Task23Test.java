package com.course.tasks;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class Task23Test {

    @ParameterizedTest
    @CsvSource({
            "'Hello World', 'Hll Wrld'",
            "'AEIOU', ''",
            "'aeiou', ''",
            "'xyz', 'xyz'"
    })
    void removeVowels_variousCases(String input, String expected) {
        assertEquals(expected, Task23.removeVowels(input));
    }

    @Test
    void removeVowels_empty() {
        assertEquals("", Task23.removeVowels(""));
    }

    @Test
    void removeVowels_preservesSpacesAndPunctuation() {
        assertEquals(" , !", Task23.removeVowels("a, e!"));
    }

    @Test
    void removeVowels_mixedCase() {
        assertEquals("Hll Wrld", Task23.removeVowels("HEllO WOrld"));
    }
}
