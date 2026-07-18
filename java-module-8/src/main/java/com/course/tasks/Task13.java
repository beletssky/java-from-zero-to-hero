package com.course.tasks;

import java.util.function.Function;

public class Task13 {

  private Task13() {}

  /**
   * Возвращает функцию-композицию: сначала прибавить 1, затем умножить на 2.
   * Композицию нужно построить строго через Function.andThen.
   * Пример: plusOneThenDouble().apply(3) -> (3 + 1) * 2 = 8.
   */
  public static Function<Integer, Integer> plusOneThenDouble() {
    // TODO: реализуй (только Stream API, без for/if/reduce/parallel)
    throw new UnsupportedOperationException("TODO: реализуй");
  }
}
