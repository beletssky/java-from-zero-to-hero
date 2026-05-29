package com.course.tasks;

import java.util.Objects;

/**
 * UA: Моделює людину.
 *     Поля: name (String, незмінне, без сеттера), age (int, ИЗМЕНЯЕМОЕ → має сеттер setAge).
 *     Валідація віку: 0 <= age <= 150, інакше IllegalArgumentException (у конструкторі та у setAge).
 *     Методи: getName(), getAge(), setAge(int).
 *     Формат toString містить префікс "Person" та значення полів.
 *
 * RU: Моделирует человека.
 *     Поля: name (String, неизменяемое, без сеттера), age (int, ИЗМЕНЯЕМОЕ → имеет сеттер setAge).
 *     Валидация возраста: 0 <= age <= 150, иначе IllegalArgumentException (в конструкторе и в setAge).
 *     Методы: getName(), getAge(), setAge(int).
 *     Формат toString содержит префикс "Person" и значения полей.
 */
public class Task06 {

    private final String name;
    private int age;

    public Task06(String name, int age) {
        // TODO: реализуй
        throw new UnsupportedOperationException("TODO: реализуй");
    }

    public String getName() {
        // TODO: реализуй
        throw new UnsupportedOperationException("TODO: реализуй");
    }

    public int getAge() {
        // TODO: реализуй
        throw new UnsupportedOperationException("TODO: реализуй");
    }

    public void setAge(int age) {
        // TODO: реализуй
        throw new UnsupportedOperationException("TODO: реализуй");
    }

    @Override
    public boolean equals(Object o) {
        // TODO: реализуй
        throw new UnsupportedOperationException("TODO: реализуй");
    }

    @Override
    public int hashCode() {
        // TODO: реализуй
        throw new UnsupportedOperationException("TODO: реализуй");
    }

    @Override
    public String toString() {
        // TODO: реализуй
        throw new UnsupportedOperationException("TODO: реализуй");
    }
}
