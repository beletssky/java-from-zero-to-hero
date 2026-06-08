package com.course.task03;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Task03Test {

    @Test
    void personConstructorSetsFields() {
        Person p = new Person("Anna", 30);
        assertEquals("Anna", p.getName());
        assertEquals(30, p.getAge());
    }

    @Test
    void personGreetReturnsBasicGreeting() {
        Person p = new Person("Anna", 30);
        assertEquals("Hello, I'm Anna", p.greet());
    }

    @Test
    void studentConstructorSetsAllFields() {
        Student s = new Student("Bob", 20, "MIT");
        assertEquals("Bob", s.getName());
        assertEquals(20, s.getAge());
        assertEquals("MIT", s.getUniversity());
    }

    @Test
    void studentGreetOverridesParent() {
        Student s = new Student("Bob", 20, "MIT");
        assertEquals("Hello, I'm Bob, student at MIT", s.greet());
    }

    @Test
    void polymorphicReferenceCallsOverriddenGreet() {
        Person p = new Student("Bob", 20, "MIT");
        assertEquals("Hello, I'm Bob, student at MIT", p.greet());
    }
}
