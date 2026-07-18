package com.course.tasks;

import com.course.model.Employee;
import java.util.List;
import java.util.Optional;

public final class Task22 {

  private Task22() {}

  /**
   * Ищет первого сотрудника с указанным именем в списке. Если совпадения нет — возвращает {@link Optional#empty()}.
   *
   * <p>Примеры:
   * <ul>
   *   <li>{@code findByName([Anna, Bob], "Anna") -> Optional.of(Anna)}</li>
   *   <li>{@code findByName([Anna, Bob], "Kate") -> Optional.empty()}</li>
   *   <li>{@code findByName([], "Anna") -> Optional.empty()}</li>
   * </ul>
   */
  public static Optional<Employee> findByName(List<Employee> staff, String name) {
    // TODO: реализуй (только Stream API, без for/if/reduce/parallel)
    throw new UnsupportedOperationException("TODO: реализуй");
  }
}
