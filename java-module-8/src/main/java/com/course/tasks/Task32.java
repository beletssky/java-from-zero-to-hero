package com.course.tasks;

import java.util.List;
import java.util.Optional;

public final class Task32 {

  private Task32() {}

  /**
   * Возвращает первое число, строго большее заданного порога, или {@link Optional#empty()},
   * если такого числа нет.
   *
   * <p>Примеры:
   * <ul>
   *   <li>{@code firstGreaterThan(List.of(1, 5, 3, 8), 4) -> Optional[5]}</li>
   *   <li>{@code firstGreaterThan(List.of(1, 2, 3), 10) -> Optional.empty}</li>
   * </ul>
   */
  public static Optional<Integer> firstGreaterThan(List<Integer> numbers, int limit) {
    // TODO: реализуй (только Stream API, без for/if/reduce/parallel)
    throw new UnsupportedOperationException("TODO: реализуй");
  }
}
