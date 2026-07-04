package com.course.task36;

import java.util.Objects;

/**
 * Сотрудник с именем, отделом и зарплатой.
 * Используется для многоуровневой сортировки в Task36.
 */
public class Employee {

    private String name;
    private String department;
    private long salary;

    public Employee(String name, String department, long salary) {
        // TODO: реализуй
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public String getName() {
        // TODO: реализуй
        return name;
    }

    public String getDepartment() {
        // TODO: реализуй
        return department;
    }

    public long getSalary() {
        // TODO: реализуй
        return salary;
    }

    @Override
    public boolean equals(Object o) {
        // TODO: реализуй
        if (this == o) return true;
        if (!(o instanceof Employee employee)) return false;
        return this.name.equals(employee.name)
                && this.department.equals(employee.department)
                && this.salary == employee.salary;
    }

    @Override
    public int hashCode() {
        // TODO: реализуй
        return Objects.hash(name, department, salary);
    }

    @Override
    public String toString() {
        // TODO: реализуй
        return "Employee name: " + name + ", department: " + department + ", salary: " + salary;
    }
}
