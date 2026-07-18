package com.course.tasks;

import java.util.Optional;
import java.util.function.Consumer;

public final class Task19 {

  private Task19() {}

  /**
   * Если значение присутствует, передаёт его в {@link Consumer}; иначе ничего не делает.
   * Реализация должна быть основана на {@link Optional#ifPresent(Consumer)}.
   *
   * <p>Примеры:
   * <ul>
   *   <li>{@code ifPresentPrint(Optional.of("hi"), System.out::println)} — печатает {@code "hi"}.</li>
   *   <li>{@code ifPresentPrint(Optional.empty(), System.out::println)} — ничего не печатает.</li>
   * </ul>
   */
  public static void ifPresentPrint(Optional<String> value, Consumer<String> out) {
    // TODO: реализуй (только Stream API, без for/if/reduce/parallel)
    throw new UnsupportedOperationException("TODO: реализуй");
  }
}
