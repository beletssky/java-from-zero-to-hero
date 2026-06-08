package com.course.task16;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Task16Test {

  @Test
  void animalStoresName() {
    Animal a = new Animal("Rex");
    assertEquals("Rex", a.getName());
  }

  @Test
  void dogStoresNameAndAge() {
    Dog d = new Dog("Buddy", 5);
    assertEquals("Buddy", d.getName());
    assertEquals(5, d.getAge());
  }

  @Test
  void puppyStoresAllThreeFields() {
    Puppy p = new Puppy("Spot", 1, "Labrador");
    assertEquals("Spot", p.getName());
    assertEquals(1, p.getAge());
    assertEquals("Labrador", p.getBreed());
  }

  @Test
  void superConstructorChainReachesAnimal() {
    Puppy p = new Puppy("Max", 2, "Husky");
    Animal a = p;
    assertEquals("Max", a.getName());
  }

  @Test
  void polymorphismViaParentReference() {
    Animal a = new Puppy("Bella", 1, "Poodle");
    assertEquals("Bella", a.getName());
    assertTrue(a instanceof Dog);
    assertTrue(a instanceof Puppy);
  }
}
