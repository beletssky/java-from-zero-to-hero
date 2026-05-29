package com.course.tasks;

import java.util.Objects;

/**
 * UA: Моделює людину.
 * Поля: name (String, незмінне, без сеттера), age (int, ИЗМЕНЯЕМОЕ → має сеттер setAge).
 * Валідація віку: 0 <= age <= 150, інакше IllegalArgumentException (у конструкторі та у setAge).
 * Методи: getName(), getAge(), setAge(int).
 * Формат toString містить префікс "Person" та значення полів.
 * <p>
 * RU: Моделирует человека.
 * Поля: name (String, неизменяемое, без сеттера), age (int, ИЗМЕНЯЕМОЕ → имеет сеттер setAge).
 * Валидация возраста: 0 <= age <= 150, иначе IllegalArgumentException (в конструкторе и в setAge).
 * Методы: getName(), getAge(), setAge(int).
 * Формат toString содержит префикс "Person" и значения полей.
 */
public class Task06 {

    private final String name;
    private int age;

    public Task06(String name, int age) {
        // TODO: реализуй
        validateAge(age);
        this.name = name;
        this.age = age;
    }

    private void validateAge(int a) {
        if (a < 0 || a > 150) {
            throw new IllegalArgumentException();
        }
    }

    public String getName() {
        // TODO: реализуй
        return name;
    }

    public int getAge() {
        // TODO: реализуй
        return age;
    }

    public void setAge(int age) {
        // TODO: реализуй
        validateAge(age);
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        // TODO: реализуй
        if (!(o instanceof Task06 task06)) return false;
        return Objects.equals(this.name, task06.name) && this.age == task06.age;
    }

    @Override
    public int hashCode() {
        // TODO: реализуй
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        // TODO: реализуй
        return "Person " + name + " " + age;
    }
}
