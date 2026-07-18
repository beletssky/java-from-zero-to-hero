package com.course.tasks;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import com.course.model.Employee;
import java.util.List;
import java.util.Optional;
import org.junit.jupiter.api.Test;

class Task22Test {

  private static Employee anna() {
    return new Employee("Anna", "IT", 4000, 30, List.of("java"));
  }

  private static Employee bob() {
    return new Employee("Bob", "HR", 3000, 40, List.of("communication"));
  }

  private static Employee kate() {
    return new Employee("Kate", "IT", 5000, 28, List.of("kotlin"));
  }

  @Test
  void findsEmployeeByExactName() {
    Employee target = anna();
    Optional<Employee> result = Task22.findByName(List.of(target, bob()), "Anna");
    assertEquals(Optional.of(target), result);
  }

  @Test
  void returnsEmptyWhenNoMatch() {
    Optional<Employee> result = Task22.findByName(List.of(anna(), bob()), "Mike");
    assertTrue(result.isEmpty());
  }

  @Test
  void returnsEmptyForEmptyList() {
    Optional<Employee> result = Task22.findByName(List.of(), "Anna");
    assertTrue(result.isEmpty());
  }

  @Test
  void returnsFirstMatchWhenMultipleWithSameName() {
    Employee first = new Employee("Anna", "IT", 4000, 30, List.of("java"));
    Employee second = new Employee("Anna", "HR", 5000, 35, List.of("hr"));
    Optional<Employee> result = Task22.findByName(List.of(first, second), "Anna");
    assertEquals(Optional.of(first), result);
  }

  @Test
  void isCaseSensitiveOnName() {
    Optional<Employee> result = Task22.findByName(List.of(anna(), bob()), "anna");
    assertTrue(result.isEmpty());
  }

  @Test
  void findsMiddleEmployeeInList() {
    Employee target = bob();
    Optional<Employee> result = Task22.findByName(List.of(anna(), target, kate()), "Bob");
    assertEquals(Optional.of(target), result);
  }
}
