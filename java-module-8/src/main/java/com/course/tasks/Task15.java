package com.course.tasks;

import java.util.Optional;

public final class Task15 {

  private Task15() {}

  /**
   * Оборачивает потенциально {@code null} строку в {@link Optional} через {@link Optional#ofNullable(Object)}.
   *
   * <p>Примеры:
   * <ul>
   *   <li>{@code wrap(null).isEmpty() == true}</li>
   *   <li>{@code wrap("hi").get() == "hi"}</li>
   * </ul>
   */
  public static Optional<String> wrap(String s) {
    // TODO: реализуй (только Stream API, без for/if/reduce/parallel)
    throw new UnsupportedOperationException("TODO: реализуй");
  }
}
