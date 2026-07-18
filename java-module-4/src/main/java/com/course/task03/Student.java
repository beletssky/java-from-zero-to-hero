package com.course.task03;

/**
 * Студент — подкласс Person.
 * Добавляет название университета.
 */
public class Student extends Person {

    private String university;

    public Student(String name, int age, String university) {
        super(name, age);
        this.university = university;
    }

    public String getUniversity() {
        return university;
    }

    @Override
    public String greet() {
        return "Hello, I'm " + name + ", student at " + university;
    }
}
