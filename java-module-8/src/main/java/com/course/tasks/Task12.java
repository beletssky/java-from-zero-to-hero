package com.course.tasks;

import java.util.function.Supplier;

public class Task12 {

  private Task12() {}

  /**
   * Возвращает value, если оно не null; иначе — результат вызова defaultSupplier.get().
   * Реализовать можно двумя способами: тернарным оператором
   * (value != null ? value : defaultSupplier.get()) либо через
   * java.util.Objects.requireNonNullElseGet(value, defaultSupplier).
   * Пример: orDefault(null, () -> "def") -> "def"; orDefault("x", () -> "def") -> "x".
   */
  public static String orDefault(String value, Supplier<String> defaultSupplier) {
    // TODO: реализуй (только Stream API, без for/if/reduce/parallel)
    throw new UnsupportedOperationException("TODO: реализуй");
  }
}
