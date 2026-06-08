package com.course.task36;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Task36Test {

    @Test
    void dogSoundShouldBeWoof() {
        Dog dog = new Dog("Rex");
        assertEquals("woof", dog.sound());
    }

    @Test
    void dogShouldHaveFourLegs() {
        Dog dog = new Dog("Rex");
        assertEquals(4, dog.getLegs());
    }

    @Test
    void dogDescribeShouldCombineLegsAndSound() {
        Dog dog = new Dog("Rex");
        assertEquals("Mammal with 4 legs, says woof", dog.describe());
    }

    @Test
    void dogShouldKeepNameViaAnimalGetter() {
        Dog dog = new Dog("Buddy");
        assertEquals("Buddy", dog.getName());
    }

    @Test
    void polymorphismThroughAnimalReference() {
        Animal animal = new Dog("Rex");
        assertEquals("woof", animal.sound());
        assertEquals("Rex", animal.getName());
    }

    @Test
    void polymorphismThroughMammalReference() {
        // Compile-time check: `class X extends Dog` would fail because Dog is final
        Mammal mammal = new Dog("Rex");
        assertEquals(4, mammal.getLegs());
        assertEquals("Mammal with 4 legs, says woof", mammal.describe());
    }
}
