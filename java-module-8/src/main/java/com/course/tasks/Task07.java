package com.course.tasks;

import com.course.model.Employee;
import java.util.Comparator;

/**
 * Task07 — компаратор сотрудников по зарплате (по возрастанию).
 */
public final class Task07 {

  private Task07() {}

  /**
   * Возвращает {@link Comparator} сотрудников, сортирующий по полю {@code salary}
   * по возрастанию. Решение: {@code Comparator.comparingInt(Employee::getSalary)}.
   *
   * <p>Пример: сортировка [Alice(5000), Bob(3000)] -&gt; [Bob(3000), Alice(5000)].
   *
   * <p>Anonymous class version (переписать лямбдой/method reference):
   * <pre>
   * new Comparator&lt;Employee&gt;() {
   *     &#64;Override
   *     public int compare(Employee a, Employee b) {
   *         return Integer.compare(a.getSalary(), b.getSalary());
   *     }
   * };
   * </pre>
   */
  public static Comparator<Employee> bySalary() {
    // TODO: реализуй (только Stream API, без for/if/reduce/parallel)
    throw new UnsupportedOperationException("TODO: реализуй");
  }
}
