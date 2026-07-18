package com.course.tasks;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

import com.course.model.Employee;
import java.util.List;
import java.util.Map;
import org.junit.jupiter.api.Test;

class Task39Test {

  private static Employee emp(String name, String dept, int salary) {
    return new Employee(name, dept, salary, 30, List.of());
  }

  @Test
  void countByDept_returnsCountPerDepartment() {
    Employee alice = emp("Alice", "IT", 100);
    Employee bob = emp("Bob", "IT", 200);
    Employee carol = emp("Carol", "HR", 150);

    Map<String, Long> result = Task39.countByDept(List.of(alice, bob, carol));

    assertEquals(2, result.size());
    assertEquals(2L, result.get("IT"));
    assertEquals(1L, result.get("HR"));
  }

  @Test
  void countByDept_returnsEmptyMapForEmptyInput() {
    assertEquals(Map.of(), Task39.countByDept(List.of()));
  }

  @Test
  void countByDept_singleEmployeeProducesCountOne() {
    Map<String, Long> result = Task39.countByDept(List.of(emp("Alice", "IT", 100)));

    assertEquals(1, result.size());
    assertEquals(1L, result.get("IT"));
  }

  @Test
  void countByDept_allSameDepartmentProducesSingleKeyWithFullCount() {
    List<Employee> staff = List.of(
        emp("Alice", "IT", 100),
        emp("Bob", "IT", 200),
        emp("Dave", "IT", 300),
        emp("Eve", "IT", 400));

    Map<String, Long> result = Task39.countByDept(staff);

    assertEquals(1, result.size());
    assertEquals(4L, result.get("IT"));
  }

  @Test
  void countByDept_missingDepartmentIsAbsentFromMap() {
    Employee alice = emp("Alice", "IT", 100);
    Employee bob = emp("Bob", "HR", 150);

    Map<String, Long> result = Task39.countByDept(List.of(alice, bob));

    assertEquals(1L, result.get("IT"));
    assertEquals(1L, result.get("HR"));
    assertFalse(result.containsKey("Finance"));
  }
}
