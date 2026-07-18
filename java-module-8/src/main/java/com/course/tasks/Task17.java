package com.course.tasks;

import java.util.Optional;

public final class Task17 {

  private Task17() {}

  /**
   * Возвращает длину имени, если оно присутствует, без использования {@code isPresent}/{@code get}.
   * Реализация должна быть основана на {@link Optional#map(java.util.function.Function)}.
   *
   * <p>Примеры:
   * <ul>
   *   <li>{@code nameLength(Optional.of("Anna")) -> Optional.of(4)}</li>
   *   <li>{@code nameLength(Optional.empty()) -> Optional.empty()}</li>
   * </ul>
   */
  public static Optional<Integer> nameLength(Optional<String> name) {
    // TODO: реализуй (только Stream API, без for/if/reduce/parallel)
    throw new UnsupportedOperationException("TODO: реализуй");
  }
}
