package com.course.tasks;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import com.course.model.Employee;
import java.util.List;
import java.util.Map;
import org.junit.jupiter.api.Test;

class Task40Test {

  private static Employee emp(String name, String dept, int salary) {
    return new Employee(name, dept, salary, 30, List.of());
  }

  @Test
  void namesByDept_groupsNamesByDepartment() {
    Employee alice = emp("Alice", "IT", 100);
    Employee bob = emp("Bob", "IT", 200);
    Employee carol = emp("Carol", "HR", 150);

    Map<String, List<String>> result = Task40.namesByDept(List.of(alice, bob, carol));

    assertEquals(2, result.size());
    assertEquals(List.of("Alice", "Bob"), result.get("IT"));
    assertEquals(List.of("Carol"), result.get("HR"));
  }

  @Test
  void namesByDept_returnsEmptyMapForEmptyInput() {
    assertEquals(Map.of(), Task40.namesByDept(List.of()));
  }

  @Test
  void namesByDept_singleEmployeeProducesSingletonNameList() {
    Map<String, List<String>> result = Task40.namesByDept(List.of(emp("Alice", "IT", 100)));

    assertEquals(1, result.size());
    assertEquals(List.of("Alice"), result.get("IT"));
  }

  @Test
  void namesByDept_allSameDepartmentCollectsAllNamesInEncounterOrder() {
    List<Employee> staff = List.of(
        emp("Bob", "IT", 200),
        emp("Alice", "IT", 100),
        emp("Dave", "IT", 300));

    Map<String, List<String>> result = Task40.namesByDept(staff);

    assertEquals(1, result.size());
    assertEquals(List.of("Bob", "Alice", "Dave"), result.get("IT"));
  }

  @Test
  void namesByDept_valueIsListOfStringsNotEmployees() {
    Employee alice = emp("Alice", "IT", 100);
    Employee carol = emp("Carol", "HR", 150);

    Map<String, List<String>> result = Task40.namesByDept(List.of(alice, carol));

    assertTrue(result.containsKey("IT"));
    assertTrue(result.containsKey("HR"));
    assertEquals("Alice", result.get("IT").get(0));
    assertEquals("Carol", result.get("HR").get(0));
  }
}
