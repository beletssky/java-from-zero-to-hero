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
        if (age < 0 || age > 150) {
            throw new IllegalArgumentException("150 + 150 сколько?");
        }
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0 || age > 150) {
            throw new IllegalArgumentException("");
        }
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null) {
            return false;
        }
        Task06 that = (Task06) o;
        return this.name.equals(that.name) && this.age == that.age;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return "Person{name=" + name + ", age=" + age + "}";
    }
}