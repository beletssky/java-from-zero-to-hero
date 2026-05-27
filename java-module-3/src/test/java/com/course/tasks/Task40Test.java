package com.course.tasks;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Task40Test {

    private static Task40.Suit[] flushHand() {
        return new Task40.Suit[]{
                Task40.Suit.HEARTS, Task40.Suit.HEARTS, Task40.Suit.HEARTS,
                Task40.Suit.HEARTS, Task40.Suit.HEARTS
        };
    }

    private static Task40.Suit[] mixedHand() {
        return new Task40.Suit[]{
                Task40.Suit.HEARTS, Task40.Suit.HEARTS, Task40.Suit.SPADES,
                Task40.Suit.HEARTS, Task40.Suit.HEARTS
        };
    }

    @Test
    void constructorSetsCards() {
        Task40 h = new Task40(flushHand());
        assertEquals(5, h.getCards().length);
        assertEquals(Task40.Suit.HEARTS, h.getCards()[0]);
    }

    @Test
    void isFlushTrueForSameSuit() {
        assertTrue(new Task40(flushHand()).isFlush());
    }

    @Test
    void isFlushFalseForMixedSuits() {
        assertFalse(new Task40(mixedHand()).isFlush());
    }

    @Test
    void constructorWrongLengthThrows() {
        Task40.Suit[] four = new Task40.Suit[]{
                Task40.Suit.CLUBS, Task40.Suit.CLUBS, Task40.Suit.CLUBS, Task40.Suit.CLUBS
        };
        assertThrows(IllegalArgumentException.class, () -> new Task40(four));
    }

    @Test
    void constructorNullElementThrows() {
        Task40.Suit[] withNull = new Task40.Suit[]{
                Task40.Suit.CLUBS, null, Task40.Suit.CLUBS, Task40.Suit.CLUBS, Task40.Suit.CLUBS
        };
        assertThrows(IllegalArgumentException.class, () -> new Task40(withNull));
    }

    @Test
    void getCardsReturnsCopy() {
        Task40 h = new Task40(flushHand());
        Task40.Suit[] got = h.getCards();
        got[0] = Task40.Suit.SPADES;
        assertEquals(Task40.Suit.HEARTS, h.getCards()[0]);
    }

    @Test
    void equalsByContentAndToString() {
        Task40 a = new Task40(flushHand());
        Task40 b = new Task40(flushHand());
        Task40 c = new Task40(mixedHand());
        assertEquals(a, b);
        assertEquals(a.hashCode(), b.hashCode());
        assertNotEquals(a, c);
        assertTrue(a.toString().contains("Hand"));
    }
}
