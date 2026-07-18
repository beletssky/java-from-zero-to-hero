package com.course.task11;

/**
 * Громкое приветствие.
 * Переводит результат родительского приветствия в верхний регистр.
 */
public class LoudGreeting extends Greeting {

  @Override
  public String say(String name) {
    return super.say(name).toUpperCase();
  }
}
