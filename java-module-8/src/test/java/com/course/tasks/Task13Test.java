package com.course.tasks;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Task13Test {

  @Test
  void plusOneThenDouble_appliesInOrder() {
    assertEquals(8, Task13.plusOneThenDouble().apply(3));
  }

  @Test
  void plusOneThenDouble_zeroInput() {
    assertEquals(2, Task13.plusOneThenDouble().apply(0));
  }

  @Test
  void plusOneThenDouble_minusOneCollapsesToZero() {
    assertEquals(0, Task13.plusOneThenDouble().apply(-1));
  }

  @Test
  void plusOneThenDouble_negativeInput() {
    assertEquals(-8, Task13.plusOneThenDouble().apply(-5));
  }

  @Test
  void plusOneThenDouble_largeInput() {
    assertEquals(202, Task13.plusOneThenDouble().apply(100));
  }
}
