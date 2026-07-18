package com.course.tasks;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import com.course.model.Employee;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.junit.jupiter.api.Test;

class Task49Test {

  @Test
  void skillsByDept_groupsAndUnionsSkillsPerDept() {
    Employee e1 = new Employee("Alice", "IT", 1000, 30, List.of("Java", "SQL"));
    Employee e2 = new Employee("Bob", "IT", 1200, 32, List.of("Java", "Python"));
    Employee e3 = new Employee("Cara", "HR", 900, 28, List.of("Recruiting"));
    Map<String, Set<String>> result = Task49.skillsByDept(List.of(e1, e2, e3));
    assertEquals(Set.of("IT", "HR"), result.keySet());
    assertEquals(Set.of("Java", "SQL", "Python"), result.get("IT"));
    assertEquals(Set.of("Recruiting"), result.get("HR"));
  }

  @Test
  void skillsByDept_returnsEmptyMapForEmptyStaff() {
    assertEquals(Map.of(), Task49.skillsByDept(List.of()));
  }

  @Test
  void skillsByDept_handlesSingleEmployee() {
    Employee e = new Employee("Alice", "IT", 1000, 30, List.of("Java"));
    Map<String, Set<String>> result = Task49.skillsByDept(List.of(e));
    assertEquals(Set.of("IT"), result.keySet());
    assertEquals(Set.of("Java"), result.get("IT"));
  }

  @Test
  void skillsByDept_deduplicatesSkillsWithinDept() {
    Employee e1 = new Employee("Alice", "IT", 1000, 30, List.of("Java", "Java"));
    Employee e2 = new Employee("Bob", "IT", 1200, 32, List.of("Java"));
    Map<String, Set<String>> result = Task49.skillsByDept(List.of(e1, e2));
    assertEquals(Set.of("Java"), result.get("IT"));
  }

  @Test
  void skillsByDept_producesEmptySetForEmployeesWithNoSkills() {
    Employee e = new Employee("Alice", "IT", 1000, 30, List.of());
    Map<String, Set<String>> result = Task49.skillsByDept(List.of(e));
    assertEquals(Set.of("IT"), result.keySet());
    assertEquals(Set.of(), result.get("IT"));
  }

  @Test
  void skillsByDept_keepsThreeDepartmentsIndependent() {
    Employee e1 = new Employee("A", "IT", 1000, 30, List.of("Java"));
    Employee e2 = new Employee("B", "HR", 900, 28, List.of("Recruiting"));
    Employee e3 = new Employee("C", "Sales", 1100, 31, List.of("Negotiation"));
    Map<String, Set<String>> result = Task49.skillsByDept(List.of(e1, e2, e3));
    assertEquals(3, result.size());
    assertTrue(result.keySet().containsAll(Set.of("IT", "HR", "Sales")));
    assertEquals(Set.of("Java"), result.get("IT"));
    assertEquals(Set.of("Recruiting"), result.get("HR"));
    assertEquals(Set.of("Negotiation"), result.get("Sales"));
  }
}
