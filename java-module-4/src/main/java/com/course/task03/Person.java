package com.course.task03;

/**
 * Человек с именем и возрастом.
 * Базовый класс для людей в системе.
 */
public class Person {

    protected String name;
    protected int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String greet() {
        return "Hello, I'm " + name;
    }
}
