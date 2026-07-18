package com.course.tasks;

import java.util.NoSuchElementException;
import java.util.Optional;

public final class Task20 {

  private Task20() {}

  /**
   * Возвращает значение из {@link Optional} или бросает {@link NoSuchElementException}
   * с сообщением {@code "значение отсутствует"}.
   *
   * <p>Примеры:
   * <ul>
   *   <li>{@code getOrThrow(Optional.of("ok")) -> "ok"}</li>
   *   <li>{@code getOrThrow(Optional.empty()) -> NoSuchElementException("значение отсутствует")}</li>
   * </ul>
   */
  public static String getOrThrow(Optional<String> value) {
    // TODO: реализуй (только Stream API, без for/if/reduce/parallel)
    throw new UnsupportedOperationException("TODO: реализуй");
  }
}
