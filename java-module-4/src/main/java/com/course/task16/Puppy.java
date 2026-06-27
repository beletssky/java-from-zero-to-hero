package com.course.task16;

/**
 * Щенок — собака с породой.
 * Расширяет Dog полем breed.
 */
public class Puppy extends Dog {

  private String breed;

  public Puppy(String name, int age, String breed) {
    super(name, age);
    this.breed = breed;
  }

  public String getBreed() {
    return breed;
  }
}
