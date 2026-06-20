package com.course.task16;

/**
 * Базовый класс животного.
 * Хранит имя животного.
 */
public class Animal {

  protected String name;

  public Animal(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }
}
