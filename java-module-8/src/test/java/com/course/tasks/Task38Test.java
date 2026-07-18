package com.course.tasks;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import com.course.model.Employee;
import java.util.List;
import java.util.Map;
import org.junit.jupiter.api.Test;

class Task38Test {

  private static Employee emp(String name, String dept, int salary) {
    return new Employee(name, dept, salary, 30, List.of());
  }

  @Test
  void byDept_groupsEmployeesAcrossMultipleDepartments() {
    Employee alice = emp("Alice", "IT", 100);
    Employee bob = emp("Bob", "IT", 200);
    Employee carol = emp("Carol", "HR", 150);

    Map<String, List<Employee>> result = Task38.byDept(List.of(alice, bob, carol));

    assertEquals(2, result.size());
    assertEquals(List.of(alice, bob), result.get("IT"));
    assertEquals(List.of(carol), result.get("HR"));
  }

  @Test
  void byDept_returnsEmptyMapForEmptyInput() {
    assertEquals(Map.of(), Task38.byDept(List.of()));
  }

  @Test
  void byDept_singleEmployeeProducesSingleGroup() {
    Employee alice = emp("Alice", "IT", 100);

    Map<String, List<Employee>> result = Task38.byDept(List.of(alice));

    assertEquals(1, result.size());
    assertEquals(List.of(alice), result.get("IT"));
  }

  @Test
  void byDept_allSameDepartmentProducesSingleKey() {
    Employee alice = emp("Alice", "IT", 100);
    Employee bob = emp("Bob", "IT", 200);
    Employee dave = emp("Dave", "IT", 300);

    Map<String, List<Employee>> result = Task38.byDept(List.of(alice, bob, dave));

    assertEquals(1, result.size());
    assertEquals(List.of(alice, bob, dave), result.get("IT"));
  }

  @Test
  void byDept_preservesEncounterOrderWithinGroup() {
    Employee bob = emp("Bob", "IT", 200);
    Employee alice = emp("Alice", "IT", 100);
    Employee carol = emp("Carol", "HR", 150);
    Employee dave = emp("Dave", "HR", 400);

    Map<String, List<Employee>> result = Task38.byDept(List.of(bob, alice, carol, dave));

    assertEquals(List.of(bob, alice), result.get("IT"));
    assertEquals(List.of(carol, dave), result.get("HR"));
    assertTrue(result.containsKey("IT"));
    assertTrue(result.containsKey("HR"));
  }
}
