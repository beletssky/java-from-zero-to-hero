package com.course.tasks;

import java.util.function.Function;

/**
 * Task05 — функция, переводящая строку в верхний регистр.
 */
public final class Task05 {

  private Task05() {}

  /**
   * Возвращает {@link Function}, приводящую строку к верхнему регистру.
   * Решение — одна ссылка на метод, без стрелки: {@code String::toUpperCase}.
   *
   * <p>Пример: toUpper().apply("hello") -&gt; "HELLO".
   *
   * <p>Anonymous class version (переписать лямбдой/method reference):
   * <pre>
   * new Function&lt;String, String&gt;() {
   *     &#64;Override
   *     public String apply(String s) {
   *         return s.toUpperCase();
   *     }
   * };
   * </pre>
   */
  public static Function<String, String> toUpper() {
    // TODO: реализуй (только Stream API, без for/if/reduce/parallel)
    throw new UnsupportedOperationException("TODO: реализуй");
  }
}
