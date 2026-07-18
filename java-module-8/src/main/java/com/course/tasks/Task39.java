package com.course.tasks;

import com.course.model.Employee;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public final class Task39 {

  private Task39() {}

  /**
   * Считает количество сотрудников в каждом отделе.
   * Реализация основана на {@link Collectors#groupingBy(java.util.function.Function,
   * java.util.stream.Collector)} с нисходящим коллектором {@link Collectors#counting()}.
   *
   * <p>Примеры:
   * <ul>
   *   <li>{@code countByDept([Alice/IT, Bob/IT, Carol/HR]) -> {"IT"=2, "HR"=1}}</li>
   *   <li>{@code countByDept([]) -> {}}</li>
   * </ul>
   */
  public static Map<String, Long> countByDept(List<Employee> staff) {
    // TODO: реализуй (только Stream API, без for/if/reduce/parallel)
    throw new UnsupportedOperationException("TODO: реализуй");
  }
}
