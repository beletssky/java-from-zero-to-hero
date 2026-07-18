package com.course.model;

import java.util.List;
import java.util.Objects;

/**
 * Неизменяемая модель сотрудника: имя, отдел, зарплата, возраст и список навыков.
 * Все поля устанавливаются в конструкторе, список навыков копируется через {@link List#copyOf}.
 */
public final class Employee {

  private final String name;
  private final String dept;
  private final int salary;
  private final int age;
  private final List<String> skills;

  public Employee(String name, String dept, int salary, int age, List<String> skills) {
    this.name = name;
    this.dept = dept;
    this.salary = salary;
    this.age = age;
    this.skills = List.copyOf(skills);
  }

  public String getName() {
    return name;
  }

  public String getDept() {
    return dept;
  }

  public int getSalary() {
    return salary;
  }

  public int getAge() {
    return age;
  }

  public List<String> getSkills() {
    return skills;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof Employee other)) return false;
    return salary == other.salary
        && age == other.age
        && Objects.equals(name, other.name)
        && Objects.equals(dept, other.dept)
        && Objects.equals(skills, other.skills);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, dept, salary, age, skills);
  }

  @Override
  public String toString() {
    return "Employee{name='" + name + "', dept='" + dept + "', salary=" + salary
        + ", age=" + age + ", skills=" + skills + '}';
  }
}
