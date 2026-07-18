package com.course.tasks;

import com.course.model.Employee;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public final class Task38 {

  private Task38() {}

  /**
   * Группирует сотрудников по отделу.
   * Реализация основана на {@link Collectors#groupingBy(java.util.function.Function)}
   * с классификатором {@link Employee#getDept()}.
   *
   * <p>Примеры:
   * <ul>
   *   <li>{@code byDept([Alice/IT, Bob/IT, Carol/HR]) -> {"IT"=[Alice, Bob], "HR"=[Carol]}}</li>
   *   <li>{@code byDept([]) -> {}}</li>
   * </ul>
   */
  public static Map<String, List<Employee>> byDept(List<Employee> staff) {
    // TODO: реализуй (только Stream API, без for/if/reduce/parallel)
    throw new UnsupportedOperationException("TODO: реализуй");
  }
}
