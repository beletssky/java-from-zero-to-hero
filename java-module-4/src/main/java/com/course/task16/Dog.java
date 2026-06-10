package com.course.task16;

/**
 * Собака — животное с возрастом.
 * Расширяет Animal полем age.
 */
public class Dog extends Animal {

    private int age;

    public Dog(String name, int age) {
        super(name);
        // TODO: реализуй
        this.age = age;
    }

    public int getAge() {
        // TODO: реализуй
        return age;
    }
}
