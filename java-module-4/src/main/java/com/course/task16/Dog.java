package com.course.task16;

/**
 * Собака — животное с возрастом.
 * Расширяет Animal полем age.
 */
public class Dog extends Animal {

  private int age;

  public Dog(String name, int age) {
    super(name);
    this.age = age;
  }

  public int getAge() {
    return age;
  }
}
