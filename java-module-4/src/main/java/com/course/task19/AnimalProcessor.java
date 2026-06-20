package com.course.task19;

/**
 * Процессор животных.
 * Различает тип через instanceof и формирует строковое описание.
 */

public class AnimalProcessor {

  public String process(Animal a) {
    if (a instanceof Cat) {
      return "CAT: " + a.sound();
    }
    if (a instanceof Dog) {
      return "DOG: " + a.sound();
    }
    return "UNKNOWN";
  }
}