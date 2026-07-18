package com.course.tasks;

import com.course.model.Employee;
import java.util.Comparator;

/**
 * Task08 — компаратор сотрудников по отделу, затем по имени.
 */
public final class Task08 {

  private Task08() {}

  /**
   * Возвращает {@link Comparator} сотрудников, сортирующий сначала по {@code dept},
   * затем по {@code name}. Решение:
   * {@code Comparator.comparing(Employee::getDept).thenComparing(Employee::getName)}.
   *
   * <p>Пример: [Bob/HR, Alice/IT, Zoe/HR] -&gt; [Bob/HR, Zoe/HR, Alice/IT].
   *
   * <p>Anonymous class version (переписать лямбдой/method reference):
   * <pre>
   * new Comparator&lt;Employee&gt;() {
   *     &#64;Override
   *     public int compare(Employee a, Employee b) {
   *         int c = a.getDept().compareTo(b.getDept());
   *         if (c != 0) return c;
   *         return a.getName().compareTo(b.getName());
   *     }
   * };
   * </pre>
   */
  public static Comparator<Employee> byDeptThenName() {
    // TODO: реализуй (только Stream API, без for/if/reduce/parallel)
    throw new UnsupportedOperationException("TODO: реализуй");
  }
}
