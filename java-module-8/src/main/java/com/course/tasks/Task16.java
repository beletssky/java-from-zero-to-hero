package com.course.tasks;

import java.util.Optional;

public final class Task16 {

  private Task16() {}

  /**
   * Возвращает содержимое {@link Optional} или строку {@code "unknown"}, если значение отсутствует.
   *
   * <p>Примеры:
   * <ul>
   *   <li>{@code orUnknown(Optional.of("Kyiv")) -> "Kyiv"}</li>
   *   <li>{@code orUnknown(Optional.empty()) -> "unknown"}</li>
   * </ul>
   */
  public static String orUnknown(Optional<String> value) {
    // TODO: реализуй (только Stream API, без for/if/reduce/parallel)
    throw new UnsupportedOperationException("TODO: реализуй");
  }
}
