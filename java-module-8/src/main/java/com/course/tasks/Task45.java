package com.course.tasks;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public final class Task45 {

  private Task45() {}

  /**
   * Считает частоту каждого слова во входном списке.
   *
   * <p>Основная реализация — через {@link Collectors#groupingBy(java.util.function.Function,
   * java.util.stream.Collector)} с нисходящим {@link Collectors#counting()}:
   * <pre>{@code
   * words.stream().collect(Collectors.groupingBy(w -> w, Collectors.counting()));
   * }</pre>
   *
   * <p>Альтернативная реализация — через {@link Collectors#toMap(java.util.function.Function,
   * java.util.function.Function, java.util.function.BinaryOperator)} с merge-функцией
   * {@link Long#sum(long, long)}:
   * <pre>{@code
   * words.stream().collect(Collectors.toMap(w -> w, w -> 1L, Long::sum));
   * }</pre>
   * Оба варианта дают одинаковый Map слово -> количество вхождений.
   *
   * <p>Примеры:
   * <ul>
   *   <li>{@code wordFrequency(["a","b","a","c","a"]) -> {"a"=3, "b"=1, "c"=1}}</li>
   *   <li>{@code wordFrequency(["only"]) -> {"only"=1}}</li>
   *   <li>{@code wordFrequency([]) -> {}}</li>
   * </ul>
   */
  public static Map<String, Long> wordFrequency(List<String> words) {
    // TODO: реализуй (только Stream API, без for/if/reduce/parallel)
    throw new UnsupportedOperationException("TODO: реализуй");
  }
}
