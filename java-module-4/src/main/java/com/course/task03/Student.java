package com.course.task03;

/**
 * Студент — подкласс Person.
 * Добавляет название университета.
 */
public class Student extends Person {

    private String university;

    public Student(String name, int age, String university) {
        super(name, age);
        // TODO: реализуй
        this.university = university;
    }

    public String getUniversity() {
        // TODO: реализуй
        return this.university;
    }

    @Override
    public String greet() {
        // TODO: реализуй
        return "Hello, I'm " + name + ", student at " + university;
    }
}
