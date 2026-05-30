package com.course.tasks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task26Test {

    @Test
    void constructorSetsAllFields() {
        Task26 c = new Task26(10, "hearts");
        assertEquals(10, c.getRank());
        assertEquals("hearts", c.getSuit());
    }

    @Test
    void gettersReturnValues() {
        Task26 c = new Task26(14, "spades");
        assertEquals(14, c.getRank());
        assertEquals("spades", c.getSuit());
    }

    @Test
    void constructorThrowsOnInvalidRank() {
        assertThrows(IllegalArgumentException.class, () -> new Task26(1, "hearts"));
        assertThrows(IllegalArgumentException.class, () -> new Task26(15, "hearts"));
    }

    @Test
    void constructorThrowsOnInvalidSuit() {
        assertThrows(IllegalArgumentException.class, () -> new Task26(10, "stars"));
    }

    @Test
    void equalsAndHashCodeEqualForSameRankAndSuit() {
        Task26 a = new Task26(10, "hearts");
        Task26 b = new Task26(10, "hearts");
        assertEquals(a, b);
        assertEquals(a.hashCode(), b.hashCode());
    }

    @Test
    void equalsFalseForDifferentCard() {
        assertNotEquals(new Task26(10, "hearts"), new Task26(10, "spades"));
        assertNotEquals(new Task26(10, "hearts"), new Task26(11, "hearts"));
    }

    @Test
    void toStringUsesNumericRankAndSuit() {
        assertEquals("10 of hearts", new Task26(10, "hearts").toString());
        assertEquals("14 of spades", new Task26(14, "spades").toString());
    }
}
