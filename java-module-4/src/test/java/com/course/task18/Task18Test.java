package com.course.task18;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Task18Test {

  @Test
  void parentAnimalReturnsGenericSound() {
    Animal a = new Animal();
    assertEquals("звук", a.sound());
  }

  @Test
  void eachSubclassReturnsOwnSound() {
    assertEquals("гав", new Dog().sound());
    assertEquals("мяу", new Cat().sound());
    assertEquals("му", new Cow().sound());
  }

  @Test
  void polymorphismViaParentReference() {
    Animal a = new Dog();
    assertEquals("гав", a.sound());
    Animal b = new Cat();
    assertEquals("мяу", b.sound());
  }

  @Test
  void zooMakeAllSoundsPreservesOrder() {
    Zoo zoo = new Zoo();
    Animal[] animals = { new Dog(), new Cat(), new Cow() };
    String[] result = zoo.makeAllSounds(animals);
    assertArrayEquals(new String[] { "гав", "мяу", "му" }, result);
  }

  @Test
  void zooMakeAllSoundsLengthMatchesInput() {
    Zoo zoo = new Zoo();
    Animal[] animals = { new Cat(), new Dog() };
    String[] result = zoo.makeAllSounds(animals);
    assertEquals(2, result.length);
    assertEquals("мяу", result[0]);
    assertEquals("гав", result[1]);
  }
}
