package com.course.tasks;

import com.course.model.Employee;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public final class Task41 {

  private Task41() {}

  /**
   * Разделяет сотрудников на «богатых» ({@code salary >= threshold}) и «бедных».
   * Реализация основана на {@link Collectors#partitioningBy(java.util.function.Predicate)}.
   *
   * <p>ВАЖНО: {@link Collectors#partitioningBy} всегда возвращает Map с ОБОИМИ ключами
   * {@code true} и {@code false}, даже если один из списков пуст. Это отличается от
   * {@link Collectors#groupingBy}, где отсутствующие ключи просто не попадают в результат.
   *
   * <p>Примеры:
   * <ul>
   *   <li>{@code richAndPoor([Alice/100, Bob/200, Carol/150], 150)
   *       -> {true=[Bob, Carol], false=[Alice]}}
   *       — Carol с зарплатой ровно на границе попадает в {@code true}, потому что условие {@code >=}.</li>
   *   <li>{@code richAndPoor([Alice/50], 1000) -> {true=[], false=[Alice]}}
   *       — оба ключа присутствуют, «богатый» список пуст.</li>
   *   <li>{@code richAndPoor([], 100) -> {true=[], false=[]}}
   *       — на пустом входе оба ключа тоже есть.</li>
   * </ul>
   */
  public static Map<Boolean, List<Employee>> richAndPoor(List<Employee> staff, int threshold) {
    // TODO: реализуй (только Stream API, без for/if/reduce/parallel)
    throw new UnsupportedOperationException("TODO: реализуй");
  }
}
