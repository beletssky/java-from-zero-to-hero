package com.course.tasks;

import com.course.model.Employee;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public final class Task43 {

  private Task43() {}

  /**
   * Считает среднюю зарплату по каждому отделу.
   * Реализация основана на {@link Collectors#groupingBy(java.util.function.Function,
   * java.util.stream.Collector)} с нисходящим коллектором
   * {@link Collectors#averagingInt(java.util.function.ToIntFunction)}.
   *
   * <p>Примеры:
   * <ul>
   *   <li>{@code avgSalaryByDept([Alice/IT/100, Bob/IT/200, Carol/HR/150])
   *       -> {"IT"=150.0, "HR"=150.0}}</li>
   *   <li>{@code avgSalaryByDept([]) -> {}}</li>
   * </ul>
   */
  public static Map<String, Double> avgSalaryByDept(List<Employee> staff) {
    // TODO: реализуй (только Stream API, без for/if/reduce/parallel)
    throw new UnsupportedOperationException("TODO: реализуй");
  }
}
