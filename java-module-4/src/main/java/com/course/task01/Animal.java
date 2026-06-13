package com.course.task01;

/**
 * Базовый класс животного.
 * Хранит имя и описывает издаваемый звук.
 */
public class Animal {

    protected String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String sound() {
        return "звук";
    }
}
