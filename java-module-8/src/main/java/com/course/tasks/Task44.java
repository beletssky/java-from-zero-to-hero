package com.course.tasks;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public final class Task44 {

  private Task44() {}

  /**
   * Группирует слова по их длине.
   * Реализация основана на {@link Collectors#groupingBy(java.util.function.Function)}
   * с классификатором {@link String#length()}.
   *
   * <p>Примеры:
   * <ul>
   *   <li>{@code byWordLength(["a","bb","cc","ddd"]) -> {1=["a"], 2=["bb","cc"], 3=["ddd"]}}</li>
   *   <li>{@code byWordLength([]) -> {}}</li>
   * </ul>
   */
  public static Map<Integer, List<String>> byWordLength(List<String> words) {
    // TODO: реализуй (только Stream API, без for/if/reduce/parallel)
    throw new UnsupportedOperationException("TODO: реализуй");
  }
}
