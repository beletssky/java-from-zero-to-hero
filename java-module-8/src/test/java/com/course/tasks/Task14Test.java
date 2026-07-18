package com.course.tasks;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class Task14Test {

  @Test
  void positiveAndEven_trueForPositiveEven() {
    assertTrue(Task14.positiveAndEven().test(4));
  }

  @Test
  void positiveAndEven_falseForNegativeEven() {
    assertFalse(Task14.positiveAndEven().test(-4));
  }

  @Test
  void positiveAndEven_falseForPositiveOdd() {
    assertFalse(Task14.positiveAndEven().test(3));
  }

  @Test
  void positiveAndEven_falseForZeroBecauseNotPositive() {
    assertFalse(Task14.positiveAndEven().test(0));
  }

  @Test
  void positiveAndEven_trueForTwo() {
    assertTrue(Task14.positiveAndEven().test(2));
  }
}
