package com.course.task06;
/**
 * Сотрудник компании.
 * Хранит имя и зарплату в копейках.
 */
public class Employee {

    protected String name;
    protected long salary;

    public Employee(String name, long salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public long getSalary() {
        return salary;
    }
}