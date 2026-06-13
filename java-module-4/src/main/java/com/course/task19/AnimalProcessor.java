package com.course.task19;

/**
 * Процессор животных.
 * Различает тип через instanceof и формирует строковое описание.
 */
public class AnimalProcessor {

  public String process(Animal a) {
    if (a instanceof Cat cat) {
      return "CAT: " + cat.sound();
    }
    if (a instanceof Dog dog) {
      return "DOG: " + dog.sound();
    }
    return "UNKNOWN";
  }
}
