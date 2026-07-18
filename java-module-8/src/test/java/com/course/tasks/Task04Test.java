package com.course.tasks;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.function.Predicate;
import org.junit.jupiter.api.Test;

class Task04Test {

  @Test
  void trueForPositiveEven() {
    assertTrue(Task04.isEven().test(4));
  }

  @Test
  void falseForPositiveOdd() {
    assertFalse(Task04.isEven().test(5));
  }

  @Test
  void trueForZero() {
    assertTrue(Task04.isEven().test(0));
  }

  @Test
  void trueForNegativeEven() {
    assertTrue(Task04.isEven().test(-8));
  }

  @Test
  void falseForNegativeOdd() {
    assertFalse(Task04.isEven().test(-3));
  }

  @Test
  void factoryReturnsNonNullPredicate() {
    Predicate<Integer> p = Task04.isEven();
    assertNotNull(p);
  }
}
