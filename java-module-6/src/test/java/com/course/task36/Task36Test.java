package com.course.task36;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotSame;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;

class Task36Test {

  @Test
  void sort_groupsByDepartmentAscending() {
    List<Employee> input = new ArrayList<>(Arrays.asList(
        new Employee("Eve", "Sales", 5000L),
        new Employee("Alice", "Engineering", 7000L),
        new Employee("Bob", "Marketing", 6000L)));
    List<Employee> sorted = new Task36().sort(input);
    assertEquals("Engineering", sorted.get(0).getDepartment());
    assertEquals("Marketing", sorted.get(1).getDepartment());
    assertEquals("Sales", sorted.get(2).getDepartment());
  }

  @Test
  void sort_sortsBySalaryDescendingWithinDepartment() {
    List<Employee> input = new ArrayList<>(Arrays.asList(
        new Employee("Low", "Eng", 1000L),
        new Employee("High", "Eng", 9000L),
        new Employee("Mid", "Eng", 5000L)));
    List<Employee> sorted = new Task36().sort(input);
    assertEquals(9000L, sorted.get(0).getSalary());
    assertEquals(5000L, sorted.get(1).getSalary());
    assertEquals(1000L, sorted.get(2).getSalary());
  }

  @Test
  void sort_combinesDepartmentAndSalaryOrdering() {
    List<Employee> input = new ArrayList<>(Arrays.asList(
        new Employee("E1", "B", 3000L),
        new Employee("E2", "A", 2000L),
        new Employee("E3", "B", 5000L),
        new Employee("E4", "A", 8000L)));
    List<Employee> sorted = new Task36().sort(input);
    assertEquals("A", sorted.get(0).getDepartment());
    assertEquals(8000L, sorted.get(0).getSalary());
    assertEquals("A", sorted.get(1).getDepartment());
    assertEquals(2000L, sorted.get(1).getSalary());
    assertEquals("B", sorted.get(2).getDepartment());
    assertEquals(5000L, sorted.get(2).getSalary());
    assertEquals("B", sorted.get(3).getDepartment());
    assertEquals(3000L, sorted.get(3).getSalary());
  }

  @Test
  void sort_doesNotMutateInput() {
    List<Employee> input = new ArrayList<>(Arrays.asList(
        new Employee("E1", "B", 3000L),
        new Employee("E2", "A", 8000L)));
    List<Employee> snapshot = new ArrayList<>(input);
    new Task36().sort(input);
    assertEquals(snapshot.get(0).getName(), input.get(0).getName());
    assertEquals(snapshot.get(1).getName(), input.get(1).getName());
  }

  @Test
  void sort_returnsNewListInstance() {
    List<Employee> input = new ArrayList<>(List.of(
        new Employee("Solo", "A", 1000L)));
    List<Employee> sorted = new Task36().sort(input);
    assertNotSame(input, sorted);
  }

  @Test
  void sort_handlesEmptyInput() {
    List<Employee> sorted = new Task36().sort(new ArrayList<>());
    assertEquals(0, sorted.size());
  }
}
