package com.course.task22;

/**
 * Абстрактное животное.
 * Описывает контракт получения звука и шаблонный метод describe().
 */
public abstract class Animal {
  protected String name;

  public Animal(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public abstract String sound();

  public String describe() {
    return name + " says: " + sound();
  }
}
