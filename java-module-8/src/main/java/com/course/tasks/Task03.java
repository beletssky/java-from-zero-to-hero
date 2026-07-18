package com.course.tasks;

import java.util.Comparator;

/**
 * Task03 — компаратор целых чисел по убыванию.
 */
public final class Task03 {

  private Task03() {}

  /**
   * Возвращает {@link Comparator} целых чисел, сортирующий по убыванию.
   * Подсказка: {@link Comparator#reverseOrder()}.
   *
   * <p>Пример: sort([1,3,2]) -&gt; [3,2,1].
   *
   * <p>Anonymous class version (переписать лямбдой/method reference):
   * <pre>
   * new Comparator&lt;Integer&gt;() {
   *     &#64;Override
   *     public int compare(Integer a, Integer b) {
   *         return Integer.compare(b, a);
   *     }
   * };
   * </pre>
   */
  public static Comparator<Integer> descending() {
    // TODO: реализуй (только Stream API, без for/if/reduce/parallel)
    throw new UnsupportedOperationException("TODO: реализуй");
  }
}
