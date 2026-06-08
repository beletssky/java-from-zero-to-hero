package com.course.task26;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Task26Test {

  @Test
  void cardAcceptsAmountAtOrBelowLimit() {
    Card c = new Card();
    assertTrue(c.process(100000L));
    assertTrue(c.process(50L));
  }

  @Test
  void cardRejectsAmountAboveLimit() {
    Card c = new Card();
    assertFalse(c.process(100001L));
  }

  @Test
  void cashAlwaysAcceptsAnyAmount() {
    Cash c = new Cash();
    assertTrue(c.process(0L));
    assertTrue(c.process(1L));
    assertTrue(c.process(999_999_999L));
  }

  @Test
  void cryptoAcceptsAmountAtOrAboveMinimum() {
    Crypto c = new Crypto();
    assertTrue(c.process(1000L));
    assertTrue(c.process(10_000L));
  }

  @Test
  void cryptoRejectsAmountBelowMinimum() {
    Crypto c = new Crypto();
    assertFalse(c.process(999L));
  }

  @Test
  void logReturnsProcessingMessageForAnyProcessor() {
    PaymentProcessor p = new Card();
    assertEquals("Processing 500", p.log(500L));
    p = new Cash();
    assertEquals("Processing 50", p.log(50L));
    p = new Crypto();
    assertEquals("Processing 2000", p.log(2000L));
  }
}
