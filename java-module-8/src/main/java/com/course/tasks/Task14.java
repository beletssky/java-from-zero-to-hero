package com.course.tasks;

import java.util.function.Predicate;

public class Task14 {

  private Task14() {}

  /**
   * Возвращает составной предикат: число одновременно положительное и чётное.
   * Комбинация делается через Predicate.and (см. также Predicate.or и Predicate.negate).
   * Пример: positiveAndEven().test(4) -> true; positiveAndEven().test(3) -> false;
   * positiveAndEven().test(-2) -> false.
   */
  public static Predicate<Integer> positiveAndEven() {
    // TODO: реализуй (только Stream API, без for/if/reduce/parallel)
    throw new UnsupportedOperationException("TODO: реализуй");
  }
}
