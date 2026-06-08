package com.course.task22;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Task22Test {

  @Test
  void animalNameGetterViaSubclass() {
    Animal a = new Dog("Rex");
    assertEquals("Rex", a.getName());
  }

  @Test
  void dogSoundReturnsWoof() {
    Dog d = new Dog("Buddy");
    assertEquals("woof", d.sound());
  }

  @Test
  void catSoundReturnsMeow() {
    Cat c = new Cat("Whiskers");
    assertEquals("meow", c.sound());
  }

  @Test
  void describeUsesSoundPolymorphicallyForDog() {
    Animal a = new Dog("Rex");
    assertEquals("Rex says: woof", a.describe());
  }

  @Test
  void describeUsesSoundPolymorphicallyForCat() {
    Animal a = new Cat("Tom");
    assertEquals("Tom says: meow", a.describe());
  }
}
