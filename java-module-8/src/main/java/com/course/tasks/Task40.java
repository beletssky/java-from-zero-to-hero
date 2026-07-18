package com.course.tasks;

import com.course.model.Employee;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public final class Task40 {

  private Task40() {}

  /**
   * Группирует сотрудников по отделу и оставляет в значении только их имена.
   * Реализация основана на {@link Collectors#groupingBy(java.util.function.Function,
   * java.util.stream.Collector)} с нисходящим коллектором
   * {@link Collectors#mapping(java.util.function.Function, java.util.stream.Collector)}.
   *
   * <p>Примеры:
   * <ul>
   *   <li>{@code namesByDept([Alice/IT, Bob/IT, Carol/HR]) -> {"IT"=["Alice","Bob"], "HR"=["Carol"]}}</li>
   *   <li>{@code namesByDept([]) -> {}}</li>
   * </ul>
   */
  public static Map<String, List<String>> namesByDept(List<Employee> staff) {
    // TODO: реализуй (только Stream API, без for/if/reduce/parallel)
    throw new UnsupportedOperationException("TODO: реализуй");
  }
}
