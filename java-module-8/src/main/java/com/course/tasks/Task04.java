package com.course.tasks;

import java.util.function.Predicate;

/**
 * Task04 — предикат «число чётное».
 */
public final class Task04 {

  private Task04() {}

  /**
   * Возвращает {@link Predicate}, возвращающий {@code true}, если число делится на 2 без остатка.
   *
   * <p>Пример: isEven().test(4) -&gt; true, isEven().test(5) -&gt; false.
   *
   * <p>Anonymous class version (переписать лямбдой/method reference):
   * <pre>
   * new Predicate&lt;Integer&gt;() {
   *     &#64;Override
   *     public boolean test(Integer n) {
   *         return n % 2 == 0;
   *     }
   * };
   * </pre>
   */
  public static Predicate<Integer> isEven() {
    // TODO: реализуй (только Stream API, без for/if/reduce/parallel)
    throw new UnsupportedOperationException("TODO: реализуй");
  }
}
