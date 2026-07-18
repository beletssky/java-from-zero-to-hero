package com.course.tasks;

/**
 * Task02 — {@link Runnable}, печатающий приветствие в System.out.
 */
public final class Task02 {

  private Task02() {}

  /**
   * Возвращает {@link Runnable}, который при вызове run() выводит в System.out строку
   * "Привет, {name}!".
   *
   * <p>Пример: greeter("Ivan").run() печатает "Привет, Ivan!".
   *
   * <p>Anonymous class version (переписать лямбдой/method reference):
   * <pre>
   * new Runnable() {
   *     &#64;Override
   *     public void run() {
   *         System.out.println("Привет, " + name + "!");
   *     }
   * };
   * </pre>
   */
  public static Runnable greeter(String name) {
    // TODO: реализуй (только Stream API, без for/if/reduce/parallel)
    throw new UnsupportedOperationException("TODO: реализуй");
  }
}
