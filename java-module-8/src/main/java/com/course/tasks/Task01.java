package com.course.tasks;

import java.util.Comparator;

/**
 * Task01 — компаратор строк по длине (по возрастанию).
 */
public final class Task01 {

  private Task01() {}

  /**
   * Возвращает {@link Comparator} строк, сравнивающий их по длине по возрастанию.
   *
   * <p>Пример: sort(["abc","a","ab"]) -&gt; ["a","ab","abc"].
   *
   * <p>Anonymous class version (переписать лямбдой/method reference):
   * <pre>
   * new Comparator&lt;String&gt;() {
   *     &#64;Override
   *     public int compare(String a, String b) {
   *         return Integer.compare(a.length(), b.length());
   *     }
   * };
   * </pre>
   */
  public static Comparator<String> byLength() {
    // TODO: реализуй (только Stream API, без for/if/reduce/parallel)
    throw new UnsupportedOperationException("TODO: реализуй");
  }
}
