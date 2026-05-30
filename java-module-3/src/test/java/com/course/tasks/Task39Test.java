package com.course.tasks;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Task39Test {

    @Test
    void constructorSetsFields() {
        Task39 w = new Task39(Task39.Currency.USD, 100);
        assertEquals(Task39.Currency.USD, w.getCurrency());
        assertEquals(100L, w.getAmount());
    }

    @Test
    void constructorNegativeAmountThrows() {
        assertThrows(IllegalArgumentException.class, () -> new Task39(Task39.Currency.EUR, -1));
    }

    @Test
    void addIncreasesAmount() {
        Task39 w = new Task39(Task39.Currency.UAH, 50);
        w.add(25);
        assertEquals(75L, w.getAmount());
    }

    @Test
    void addNonPositiveThrows() {
        Task39 w = new Task39(Task39.Currency.UAH, 50);
        assertThrows(IllegalArgumentException.class, () -> w.add(0));
        assertThrows(IllegalArgumentException.class, () -> w.add(-5));
    }

    @Test
    void withdrawDecreasesAmount() {
        Task39 w = new Task39(Task39.Currency.USD, 100);
        w.withdraw(40);
        assertEquals(60L, w.getAmount());
    }

    @Test
    void withdrawInvalidThrows() {
        Task39 w = new Task39(Task39.Currency.USD, 100);
        assertThrows(IllegalArgumentException.class, () -> w.withdraw(0));
        assertThrows(IllegalArgumentException.class, () -> w.withdraw(200));
    }

    @Test
    void equalsAndToString() {
        Task39 a = new Task39(Task39.Currency.USD, 100);
        Task39 b = new Task39(Task39.Currency.USD, 100);
        Task39 c = new Task39(Task39.Currency.EUR, 100);
        assertEquals(a, b);
        assertNotEquals(a, c);
        String s = a.toString();
        assertTrue(s.contains("Wallet"));
        assertTrue(s.contains("USD"));
        assertTrue(s.contains("100"));
    }
}
