package com.course.tasks;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import com.course.model.Employee;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import org.junit.jupiter.api.Test;

class Task08Test {

  private static Employee mk(String name, String dept) {
    return new Employee(name, dept, 1000, 25, List.of());
  }

  @Test
  void sortsByDeptThenByName() {
    Employee zoeHr = mk("Zoe", "HR");
    Employee bobHr = mk("Bob", "HR");
    Employee aliceIt = mk("Alice", "IT");
    List<Employee> input = new ArrayList<>(List.of(zoeHr, aliceIt, bobHr));
    input.sort(Task08.byDeptThenName());
    assertEquals(List.of(bobHr, zoeHr, aliceIt), input);
  }

  @Test
  void nameOnlyTiebreakerWithinSameDept() {
    Employee bob = mk("Bob", "IT");
    Employee alice = mk("Alice", "IT");
    List<Employee> input = new ArrayList<>(List.of(bob, alice));
    input.sort(Task08.byDeptThenName());
    assertEquals(List.of(alice, bob), input);
  }

  @Test
  void deptOnlyOrderingWhenNamesEqual() {
    Employee itX = mk("X", "IT");
    Employee hrX = mk("X", "HR");
    List<Employee> input = new ArrayList<>(List.of(itX, hrX));
    input.sort(Task08.byDeptThenName());
    assertEquals(List.of(hrX, itX), input);
  }

  @Test
  void emptyListRemainsEmpty() {
    List<Employee> input = new ArrayList<>();
    input.sort(Task08.byDeptThenName());
    assertTrue(input.isEmpty());
  }

  @Test
  void singleElementListUnchanged() {
    Employee single = mk("Solo", "IT");
    List<Employee> input = new ArrayList<>(List.of(single));
    input.sort(Task08.byDeptThenName());
    assertEquals(List.of(single), input);
  }

  @Test
  void equalDeptAndNameCompareToZero() {
    Comparator<Employee> cmp = Task08.byDeptThenName();
    Employee a = mk("Same", "IT");
    Employee b = mk("Same", "IT");
    assertEquals(0, cmp.compare(a, b));
  }

  @Test
  void factoryReturnsNonNullComparator() {
    assertNotNull(Task08.byDeptThenName());
  }
}
