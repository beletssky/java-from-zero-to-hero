package com.course.task11;

import java.util.Locale;

/**
 * Громкое приветствие.
 * Переводит результат родительского приветствия в верхний регистр.
 */
public class LoudGreeting extends Greeting {

  @Override
  public String say(String name) {
    // TODO: реализуй
      return super.say(name).toUpperCase(Locale.ROOT);
  }
}
