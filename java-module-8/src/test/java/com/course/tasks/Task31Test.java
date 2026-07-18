package com.course.tasks;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import com.course.model.Employee;
import java.util.List;
import org.junit.jupiter.api.Test;

class Task31Test {

  @Test
  void allAdults_returnsTrue_whenAllAgesAreAtLeast18() {
    assertTrue(Task31.allAdults(List.of(
        new Employee("Alice", "IT", 5000, 25, List.of("java")),
        new Employee("Bob", "HR", 4000, 30, List.of("hr")),
        new Employee("Carol", "IT", 6000, 18, List.of("java")))));
  }

  @Test
  void allAdults_returnsTrue_forEmptyList() {
    assertTrue(Task31.allAdults(List.of()));
  }

  @Test
  void allAdults_returnsTrue_forSingleAdult() {
    assertTrue(Task31.allAdults(List.of(
        new Employee("Alice", "IT", 5000, 21, List.of("java")))));
  }

  @Test
  void allAdults_returnsFalse_forSingleMinor() {
    assertFalse(Task31.allAdults(List.of(
        new Employee("Kid", "IT", 1000, 17, List.of("java")))));
  }

  @Test
  void allAdults_returnsFalse_whenOneMinorAmongAdults() {
    assertFalse(Task31.allAdults(List.of(
        new Employee("Alice", "IT", 5000, 25, List.of("java")),
        new Employee("Kid", "IT", 1000, 15, List.of("java")),
        new Employee("Bob", "HR", 4000, 30, List.of("hr")))));
  }

  @Test
  void allAdults_returnsTrue_forExactly18BoundaryCase() {
    assertTrue(Task31.allAdults(List.of(
        new Employee("A", "IT", 100, 18, List.of("s")),
        new Employee("B", "IT", 100, 18, List.of("s")))));
  }
}
