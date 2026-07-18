package com.course.tasks;

import java.util.Optional;

public final class Task18 {

  private Task18() {}

  /**
   * Оставляет возраст только если он больше либо равен 18, иначе возвращает пустой {@link Optional}.
   * Реализация должна быть основана на {@link Optional#filter(java.util.function.Predicate)}.
   *
   * <p>Примеры:
   * <ul>
   *   <li>{@code onlyAdult(Optional.of(20)) -> Optional.of(20)}</li>
   *   <li>{@code onlyAdult(Optional.of(17)) -> Optional.empty()}</li>
   *   <li>{@code onlyAdult(Optional.empty()) -> Optional.empty()}</li>
   * </ul>
   */
  public static Optional<Integer> onlyAdult(Optional<Integer> age) {
    // TODO: реализуй (только Stream API, без for/if/reduce/parallel)
    throw new UnsupportedOperationException("TODO: реализуй");
  }
}
