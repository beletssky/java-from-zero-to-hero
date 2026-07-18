package com.course.tasks;

import java.util.List;

public final class Task33 {

  private Task33() {}

  /**
   * Возвращает суммарную длину всех строк в списке.
   *
   * <p><b>{@code reduce} запрещён — используем {@code sum()}</b> на {@code IntStream}
   * ({@code mapToInt(String::length).sum()}).
   *
   * <p>Пример: {@code totalLength(List.of("ab", "cde", "f")) -> 6}
   */
  public static int totalLength(List<String> words) {
    // TODO: реализуй (только Stream API, без for/if/reduce/parallel)
    throw new UnsupportedOperationException("TODO: реализуй");
  }
}
