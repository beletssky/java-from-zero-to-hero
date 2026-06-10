package com.course.task22;

/**
 * Абстрактное животное.
 * Описывает контракт получения звука и шаблонный метод describe().
 */
public abstract class Animal {
  protected String name;

  public Animal(String name) {
    // TODO: реализуй
    throw new UnsupportedOperationException("TODO: реализуй");
  }

  public String getName() {
    // TODO: реализуй
    throw new UnsupportedOperationException("TODO: реализуй");
  }

  public abstract String sound();

  public String describe() {
    // TODO: реализуй
    throw new UnsupportedOperationException("TODO: реализуй");
  }
}
