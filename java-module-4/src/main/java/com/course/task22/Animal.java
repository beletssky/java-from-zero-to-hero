package com.course.task22;

/**
 * Абстрактное животное.
 * Описывает контракт получения звука и шаблонный метод describe().
 */
public abstract class Animal {
    protected String name;

    public Animal(String name) {
        // TODO: реализуй
        this.name = name;
    }

    public String getName() {
        // TODO: реализуй
        return name;
    }

    public abstract String sound();

    public String describe() {
        // TODO: реализуй
        return name + " says: " + sound();
    }
}
