package com.course.tasks;

import java.util.List;
import java.util.stream.Collectors;

public final class Task42 {

  private Task42() {}

  /**
   * Собирает список строк в одну строку вида {@code "[a, b, c]"}.
   * Реализация основана на {@link Collectors#joining(CharSequence, CharSequence, CharSequence)}
   * с разделителем {@code ", "}, префиксом {@code "["} и суффиксом {@code "]"}.
   *
   * <p>Примеры:
   * <ul>
   *   <li>{@code prettyList(["a","b","c"]) -> "[a, b, c]"}</li>
   *   <li>{@code prettyList(["x"]) -> "[x]"}</li>
   *   <li>{@code prettyList([]) -> "[]"} — Collectors.joining возвращает префикс+суффикс для пустого потока.</li>
   * </ul>
   */
  public static String prettyList(List<String> names) {
    // TODO: реализуй (только Stream API, без for/if/reduce/parallel)
    throw new UnsupportedOperationException("TODO: реализуй");
  }
}
