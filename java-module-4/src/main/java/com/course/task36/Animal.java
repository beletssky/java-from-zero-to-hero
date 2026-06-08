package com.course.task36;

/**
 * Абстрактный базовый класс животного.
 * Хранит имя и определяет контракт звука.
 */
public abstract class Animal {
    protected String name;

    public Animal(String name) {
        // TODO: реализуй
        throw new UnsupportedOperationException("TODO: реализуй");
    }

    public String getName() {
        // TODO: реализуй
        throw new UnsupportedOperationException("TODO: реализуй");
    }

    public abstract String sound();
}
