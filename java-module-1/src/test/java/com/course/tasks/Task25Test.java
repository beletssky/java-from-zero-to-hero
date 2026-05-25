package com.course.tasks;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class Task25Test {

    @ParameterizedTest
    @ValueSource(ints = {2, 3, 5, 7, 11, 13, 17, 19, 23, 97, 7919})
    void isPrime_returnsTrue_forPrimes(int n) {
        assertTrue(Task25.isPrime(n));
    }

    @ParameterizedTest
    @ValueSource(ints = {0, 1, 4, 6, 8, 9, 15, 100, 7917})
    void isPrime_returnsFalse_forComposites(int n) {
        assertFalse(Task25.isPrime(n));
    }

    @ParameterizedTest
    @ValueSource(ints = {-1, -2, -7, -100})
    void isPrime_returnsFalse_forNegatives(int n) {
        assertFalse(Task25.isPrime(n));
    }

    @Test
    void isPrime_largePrime() {
        assertTrue(Task25.isPrime(104729)); // 10000-е простое
    }
}
