package com.course.tasks;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.course.model.Employee;
import java.util.List;
import java.util.Set;
import org.junit.jupiter.api.Test;

class Task35Test {

  @Test
  void departments_returnsUniqueDepartments() {
    Set<String> result = Task35.departments(List.of(
        new Employee("A", "IT", 100, 25, List.of("s")),
        new Employee("B", "HR", 100, 25, List.of("s")),
        new Employee("C", "IT", 100, 25, List.of("s"))));
    assertEquals(Set.of("IT", "HR"), result);
  }

  @Test
  void departments_returnsEmptySetForEmptyInput() {
    assertEquals(Set.of(), Task35.departments(List.of()));
  }

  @Test
  void departments_returnsSingleDepartmentForSingleEmployee() {
    Set<String> result = Task35.departments(List.of(
        new Employee("A", "IT", 100, 25, List.of("s"))));
    assertEquals(Set.of("IT"), result);
  }

  @Test
  void departments_returnsSingleDepartmentWhenAllEmployeesSame() {
    Set<String> result = Task35.departments(List.of(
        new Employee("A", "IT", 100, 25, List.of("s")),
        new Employee("B", "IT", 200, 26, List.of("s")),
        new Employee("C", "IT", 300, 27, List.of("s"))));
    assertEquals(Set.of("IT"), result);
  }

  @Test
  void departments_returnsAllDepartmentsWhenAllDifferent() {
    Set<String> result = Task35.departments(List.of(
        new Employee("A", "IT", 100, 25, List.of("s")),
        new Employee("B", "HR", 100, 25, List.of("s")),
        new Employee("C", "SALES", 100, 25, List.of("s"))));
    assertEquals(Set.of("IT", "HR", "SALES"), result);
  }
}
