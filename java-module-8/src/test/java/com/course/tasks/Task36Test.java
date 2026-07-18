package com.course.tasks;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.course.model.Employee;
import java.util.List;
import java.util.Map;
import org.junit.jupiter.api.Test;

class Task36Test {

  @Test
  void salaryByName_mapsUniqueNamesToSalaries() {
    Map<String, Integer> result = Task36.salaryByName(List.of(
        new Employee("Alice", "IT", 100, 25, List.of("s")),
        new Employee("Bob", "HR", 200, 30, List.of("s")),
        new Employee("Carol", "IT", 300, 35, List.of("s"))));
    assertEquals(Map.of("Alice", 100, "Bob", 200, "Carol", 300), result);
  }

  @Test
  void salaryByName_returnsEmptyMapForEmptyInput() {
    assertEquals(Map.of(), Task36.salaryByName(List.of()));
  }

  @Test
  void salaryByName_returnsSingleEntryForSingleEmployee() {
    Map<String, Integer> result = Task36.salaryByName(List.of(
        new Employee("Alice", "IT", 5000, 30, List.of("s"))));
    assertEquals(Map.of("Alice", 5000), result);
  }

  @Test
  void salaryByName_handlesZeroSalary() {
    Map<String, Integer> result = Task36.salaryByName(List.of(
        new Employee("Intern", "IT", 0, 22, List.of("s"))));
    assertEquals(Map.of("Intern", 0), result);
  }

  @Test
  void salaryByName_preservesAllKeyValuePairs() {
    Map<String, Integer> result = Task36.salaryByName(List.of(
        new Employee("A", "IT", 1, 25, List.of("s")),
        new Employee("B", "IT", 2, 25, List.of("s")),
        new Employee("C", "IT", 3, 25, List.of("s")),
        new Employee("D", "IT", 4, 25, List.of("s"))));
    assertEquals(4, result.size());
    assertEquals(1, result.get("A"));
    assertEquals(2, result.get("B"));
    assertEquals(3, result.get("C"));
    assertEquals(4, result.get("D"));
  }
}
