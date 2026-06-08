package com.course.task19;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Task19Test {

  @Test
  void parentAnimalReturnsGenericSound() {
    Animal a = new Animal();
    assertEquals("звук", a.sound());
  }

  @Test
  void dogAndCatReturnOwnSounds() {
    assertEquals("гав", new Dog().sound());
    assertEquals("мяу", new Cat().sound());
  }

  @Test
  void processorReturnsDogPrefixForDog() {
    AnimalProcessor p = new AnimalProcessor();
    assertEquals("DOG: гав", p.process(new Dog()));
  }

  @Test
  void processorReturnsCatPrefixForCat() {
    AnimalProcessor p = new AnimalProcessor();
    assertEquals("CAT: мяу", p.process(new Cat()));
  }

  @Test
  void processorReturnsUnknownForPlainAnimal() {
    AnimalProcessor p = new AnimalProcessor();
    assertEquals("UNKNOWN", p.process(new Animal()));
  }
}
