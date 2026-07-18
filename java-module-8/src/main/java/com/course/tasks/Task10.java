package com.course.tasks;

import java.util.List;
import java.util.function.Predicate;

public class Task10 {

  private Task10() {}

  /**
   * Оставляет только те элементы списка, которые удовлетворяют предикату.
   * Пример: keep(List.of("a","bb","ccc"), s -> s.length() > 1) -> ["bb","ccc"].
   */
  public static List<String> keep(List<String> items, Predicate<String> p) {
    // TODO: реализуй (только Stream API, без for/if/reduce/parallel)
    throw new UnsupportedOperationException("TODO: реализуй");
  }
}
