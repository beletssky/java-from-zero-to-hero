package com.course.tasks;

import com.course.model.Employee;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public final class Task49 {

  private Task49() {}

  /**
   * Группирует сотрудников по отделу и собирает уникальные навыки всех сотрудников каждого отдела.
   * Реализация: {@code Collectors.groupingBy(..., Collectors.flatMapping(..., Collectors.toSet()))}.
   *
   * <p>Пример:
   * <ul>
   *   <li>В отделе "IT" два сотрудника с навыками [Java, SQL] и [Java, Python] →
   *       ключ "IT" даёт значение {@code {"Java","SQL","Python"}}.</li>
   *   <li>{@code skillsByDept(List.of())} → {@code {}} (пустая карта).</li>
   * </ul>
   */
  public static Map<String, Set<String>> skillsByDept(List<Employee> staff) {
    // TODO: реализуй (только Stream API, без for/if/reduce/parallel)
    throw new UnsupportedOperationException("TODO: реализуй");
  }
}
