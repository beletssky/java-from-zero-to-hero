package com.course.task01;

/**
 * Собака — подкласс Animal.
 * Переопределяет звук на "гав".
 */
public class Dog extends Animal {

    public Dog(String name) {
        super(name);
        // TODO: реализуй
    }

    @Override
    public String sound() {
        // TODO: реализуй
        return "гав";
    }
}
