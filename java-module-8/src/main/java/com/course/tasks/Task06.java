package com.course.tasks;

import java.util.List;
import java.util.function.Supplier;

/**
 * Task06 — фабрика пустых списков.
 */
public final class Task06 {

  private Task06() {}

  /**
   * Возвращает {@link Supplier}, создающий новый пустой {@link java.util.ArrayList}.
   * Решение — строго ссылка на конструктор: {@code ArrayList::new}.
   *
   * <p>Пример: listFactory().get() -&gt; new ArrayList&lt;&gt;() (пустой).
   *
   * <p>Anonymous class version (переписать лямбдой/method reference):
   * <pre>
   * new Supplier&lt;List&lt;String&gt;&gt;() {
   *     &#64;Override
   *     public List&lt;String&gt; get() {
   *         return new ArrayList&lt;&gt;();
   *     }
   * };
   * </pre>
   */
  public static Supplier<List<String>> listFactory() {
    // TODO: реализуй (только Stream API, без for/if/reduce/parallel)
    throw new UnsupportedOperationException("TODO: реализуй");
  }
}
