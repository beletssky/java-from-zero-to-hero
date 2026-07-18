package com.course.tasks;

import java.util.List;

public final class Task46 {

  private Task46() {}

  /**
   * Разворачивает список списков в один плоский список, сохраняя порядок элементов.
   * Реализация должна использовать {@code flatMap(List::stream)}.
   *
   * <p>Примеры:
   * <ul>
   *   <li>{@code flatten(List.of(List.of(1,2), List.of(3), List.of(4,5,6)))} → {@code [1,2,3,4,5,6]}.</li>
   *   <li>{@code flatten(List.of())} → {@code []}.</li>
   *   <li>{@code flatten(List.of(List.of(), List.of()))} → {@code []}.</li>
   * </ul>
   */
  public static List<Integer> flatten(List<List<Integer>> nested) {
    // TODO: реализуй (только Stream API, без for/if/reduce/parallel)
    throw new UnsupportedOperationException("TODO: реализуй");
  }
}
