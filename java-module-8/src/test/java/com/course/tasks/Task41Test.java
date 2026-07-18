package com.course.tasks;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import com.course.model.Employee;
import java.util.List;
import java.util.Map;
import org.junit.jupiter.api.Test;

class Task41Test {

  private static Employee emp(String name, String dept, int salary) {
    return new Employee(name, dept, salary, 30, List.of());
  }

  @Test
  void richAndPoor_splitsAroundThreshold() {
    Employee alice = emp("Alice", "IT", 100);
    Employee bob = emp("Bob", "IT", 200);
    Employee carol = emp("Carol", "HR", 150);

    Map<Boolean, List<Employee>> result = Task41.richAndPoor(List.of(alice, bob, carol), 150);

    assertEquals(List.of(bob, carol), result.get(true));
    assertEquals(List.of(alice), result.get(false));
  }

  @Test
  void richAndPoor_thresholdBoundaryGoesToTrueBucket() {
    Employee onBoundary = emp("Boundary", "IT", 150);

    Map<Boolean, List<Employee>> result = Task41.richAndPoor(List.of(onBoundary), 150);

    assertEquals(List.of(onBoundary), result.get(true));
    assertEquals(List.of(), result.get(false));
  }

  @Test
  void richAndPoor_emptyInputStillHasBothKeys() {
    Map<Boolean, List<Employee>> result = Task41.richAndPoor(List.of(), 100);

    assertEquals(2, result.size());
    assertTrue(result.containsKey(true));
    assertTrue(result.containsKey(false));
    assertEquals(List.of(), result.get(true));
    assertEquals(List.of(), result.get(false));
  }

  @Test
  void richAndPoor_everyoneRichKeepsFalseKeyWithEmptyList() {
    Employee alice = emp("Alice", "IT", 1000);
    Employee bob = emp("Bob", "IT", 2000);

    Map<Boolean, List<Employee>> result = Task41.richAndPoor(List.of(alice, bob), 500);

    assertEquals(2, result.size());
    assertTrue(result.containsKey(true));
    assertTrue(result.containsKey(false));
    assertEquals(List.of(alice, bob), result.get(true));
    assertEquals(List.of(), result.get(false));
  }

  @Test
  void richAndPoor_everyonePoorKeepsTrueKeyWithEmptyList() {
    Employee alice = emp("Alice", "IT", 50);
    Employee bob = emp("Bob", "IT", 40);

    Map<Boolean, List<Employee>> result = Task41.richAndPoor(List.of(alice, bob), 1000);

    assertEquals(2, result.size());
    assertTrue(result.containsKey(true));
    assertTrue(result.containsKey(false));
    assertEquals(List.of(), result.get(true));
    assertEquals(List.of(alice, bob), result.get(false));
  }

  @Test
  void richAndPoor_singleEmployeeBelowThresholdGoesToFalseBucket() {
    Employee alice = emp("Alice", "IT", 99);

    Map<Boolean, List<Employee>> result = Task41.richAndPoor(List.of(alice), 100);

    assertEquals(List.of(), result.get(true));
    assertEquals(List.of(alice), result.get(false));
  }
}
