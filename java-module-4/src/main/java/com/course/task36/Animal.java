package com.course.task36;

/**
 * Абстрактный базовый класс животного.
 * Хранит имя и определяет контракт звука.
 */
public abstract class Animal {
    protected String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract String sound();
}
