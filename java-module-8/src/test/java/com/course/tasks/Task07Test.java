package com.course.tasks;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import com.course.model.Employee;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import org.junit.jupiter.api.Test;

class Task07Test {

  private static Employee alice() {
    return new Employee("Alice", "IT", 5000, 30, List.of("java"));
  }

  private static Employee bob() {
    return new Employee("Bob", "HR", 3000, 25, List.of("excel"));
  }

  private static Employee carol() {
    return new Employee("Carol", "IT", 7000, 40, List.of("python"));
  }

  @Test
  void sortsBySalaryAscending() {
    List<Employee> input = new ArrayList<>(List.of(alice(), bob(), carol()));
    input.sort(Task07.bySalary());
    assertEquals(List.of(bob(), alice(), carol()), input);
  }

  @Test
  void emptyListRemainsEmpty() {
    List<Employee> input = new ArrayList<>();
    input.sort(Task07.bySalary());
    assertTrue(input.isEmpty());
  }

  @Test
  void singleElementListUnchanged() {
    List<Employee> input = new ArrayList<>(List.of(alice()));
    input.sort(Task07.bySalary());
    assertEquals(List.of(alice()), input);
  }

  @Test
  void equalSalariesCompareToZero() {
    Comparator<Employee> cmp = Task07.bySalary();
    Employee a = new Employee("A", "IT", 5000, 20, List.of());
    Employee b = new Employee("B", "HR", 5000, 30, List.of());
    assertEquals(0, cmp.compare(a, b));
  }

  @Test
  void reverseSortedInputBecomesAscending() {
    List<Employee> input = new ArrayList<>(List.of(carol(), alice(), bob()));
    Collections.sort(input, Task07.bySalary());
    assertEquals(List.of(bob(), alice(), carol()), input);
  }

  @Test
  void factoryReturnsNonNullComparator() {
    assertNotNull(Task07.bySalary());
  }
}
