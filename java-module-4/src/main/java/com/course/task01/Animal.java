package com.course.task01;

/**
 * Базовый класс животного.
 * Хранит имя и описывает издаваемый звук.
 */
public class Animal {

    protected String name;

    public Animal(String name) {
        // TODO: реализуй
        this.name = name;
    }

    public String getName() {
        // TODO: реализуй
        return this.name;
    }

    public String sound() {
        // TODO: реализуй
        return "звук";
    }
}
