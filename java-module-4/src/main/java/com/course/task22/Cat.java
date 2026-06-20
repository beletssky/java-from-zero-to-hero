package com.course.task22;

/**
 * Кот — мяукает.
 */
public class Cat extends Animal {

  public Cat(String name) {
    super(name);
  }

  @Override
  public String sound() {
    return "meow";
  }
}
