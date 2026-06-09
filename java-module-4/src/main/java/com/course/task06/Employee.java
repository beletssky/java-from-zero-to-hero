package com.course.task06;

/**
 * Сотрудник компании.
 * Хранит имя и зарплату в копейках.
 */
public class Employee {

    protected String name;
    protected long salary;

    public Employee(String name, long salary) {
        // TODO: реализуй
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        // TODO: реализуй
        return this.name;
    }

    public long getSalary() {
        // TODO: реализуй
        return this.salary;
    }
}
