package com.course.task01;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Task01Test {

    @Test
    void animalConstructorSetsName() {
        Animal animal = new Animal("Generic");
        assertEquals("Generic", animal.getName());
    }

    @Test
    void animalSoundReturnsDefault() {
        Animal animal = new Animal("Generic");
        assertEquals("звук", animal.sound());
    }

    @Test
    void dogConstructorSetsNameViaSuper() {
        Dog dog = new Dog("Rex");
        assertEquals("Rex", dog.getName());
    }

    @Test
    void dogSoundOverridesParent() {
        Dog dog = new Dog("Rex");
        assertEquals("гав", dog.sound());
    }

    @Test
    void polymorphicReferenceCallsOverriddenSound() {
        Animal a = new Dog("Rex");
        assertEquals("гав", a.sound());
        assertEquals("Rex", a.getName());
    }
}
