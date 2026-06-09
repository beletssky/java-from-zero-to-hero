package com.course.task03;

/**
 * Человек с именем и возрастом.
 * Базовый класс для людей в системе.
 */
public class Person {

    protected String name;
    protected int age;

    public Person(String name, int age) {
        // TODO: реализуй
        this.name = name;
        this.age = age;
    }

    public String getName() {
        // TODO: реализуй
        return this.name;
    }

    public int getAge() {
        // TODO: реализуй
        return this.age;
    }

    public String greet() {
        // TODO: реализуй
        return "Hello, I'm " + name;
    }
}
