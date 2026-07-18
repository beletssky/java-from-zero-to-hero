package com.course.tasks;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import com.course.model.Employee;
import java.util.List;
import java.util.OptionalDouble;
import org.junit.jupiter.api.Test;

class Task34Test {

  @Test
  void averageSalary_returnsAverageOfSalaries() {
    OptionalDouble result = Task34.averageSalary(List.of(
        new Employee("A", "IT", 100, 25, List.of("s")),
        new Employee("B", "IT", 200, 26, List.of("s")),
        new Employee("C", "IT", 300, 27, List.of("s"))));
    assertTrue(result.isPresent());
    assertEquals(200.0, result.getAsDouble(), 1e-9);
  }

  @Test
  void averageSalary_returnsEmptyForEmptyList() {
    assertFalse(Task34.averageSalary(List.of()).isPresent());
    assertEquals(OptionalDouble.empty(), Task34.averageSalary(List.of()));
  }

  @Test
  void averageSalary_returnsSalaryForSingleEmployee() {
    OptionalDouble result = Task34.averageSalary(List.of(
        new Employee("A", "IT", 5000, 30, List.of("s"))));
    assertTrue(result.isPresent());
    assertEquals(5000.0, result.getAsDouble(), 1e-9);
  }

  @Test
  void averageSalary_computesFractionalAverage() {
    OptionalDouble result = Task34.averageSalary(List.of(
        new Employee("A", "IT", 100, 25, List.of("s")),
        new Employee("B", "IT", 200, 26, List.of("s"))));
    assertTrue(result.isPresent());
    assertEquals(150.0, result.getAsDouble(), 1e-9);
  }

  @Test
  void averageSalary_handlesEqualSalaries() {
    OptionalDouble result = Task34.averageSalary(List.of(
        new Employee("A", "IT", 1000, 25, List.of("s")),
        new Employee("B", "IT", 1000, 26, List.of("s")),
        new Employee("C", "IT", 1000, 27, List.of("s"))));
    assertTrue(result.isPresent());
    assertEquals(1000.0, result.getAsDouble(), 1e-9);
  }

  @Test
  void averageSalary_handlesZeroSalaries() {
    OptionalDouble result = Task34.averageSalary(List.of(
        new Employee("A", "IT", 0, 25, List.of("s")),
        new Employee("B", "IT", 0, 26, List.of("s"))));
    assertTrue(result.isPresent());
    assertEquals(0.0, result.getAsDouble(), 1e-9);
  }
}
