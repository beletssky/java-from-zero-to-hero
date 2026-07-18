package com.course.tasks;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.course.model.Employee;
import java.util.List;
import org.junit.jupiter.api.Test;

class Task37Test {

  @Test
  void topEarners_returnsTopNNamesInDescendingSalaryOrder() {
    List<Employee> staff = List.of(
        new Employee("Alice", "IT", 100, 25, List.of("s")),
        new Employee("Bob", "IT", 300, 30, List.of("s")),
        new Employee("Carol", "IT", 200, 35, List.of("s")));
    assertEquals(List.of("Bob", "Carol"), Task37.topEarners(staff, 2));
  }

  @Test
  void topEarners_returnsEmptyListForEmptyStaff() {
    assertEquals(List.of(), Task37.topEarners(List.of(), 5));
  }

  @Test
  void topEarners_returnsSingleNameWhenSingleEmployee() {
    List<Employee> staff = List.of(
        new Employee("Alice", "IT", 100, 25, List.of("s")));
    assertEquals(List.of("Alice"), Task37.topEarners(staff, 1));
  }

  @Test
  void topEarners_returnsEmptyWhenNIsZero() {
    List<Employee> staff = List.of(
        new Employee("Alice", "IT", 100, 25, List.of("s")),
        new Employee("Bob", "IT", 300, 30, List.of("s")));
    assertEquals(List.of(), Task37.topEarners(staff, 0));
  }

  @Test
  void topEarners_returnsAllWhenNExceedsStaffSize() {
    List<Employee> staff = List.of(
        new Employee("Alice", "IT", 100, 25, List.of("s")),
        new Employee("Bob", "IT", 300, 30, List.of("s")));
    assertEquals(List.of("Bob", "Alice"), Task37.topEarners(staff, 10));
  }

  @Test
  void topEarners_returnsTopOneAsHighestPaid() {
    List<Employee> staff = List.of(
        new Employee("Alice", "IT", 100, 25, List.of("s")),
        new Employee("Bob", "IT", 300, 30, List.of("s")),
        new Employee("Carol", "IT", 200, 35, List.of("s")));
    assertEquals(List.of("Bob"), Task37.topEarners(staff, 1));
  }

  @Test
  void topEarners_returnsAllSortedDescendingWhenNMatchesSize() {
    List<Employee> staff = List.of(
        new Employee("Alice", "IT", 100, 25, List.of("s")),
        new Employee("Bob", "IT", 300, 30, List.of("s")),
        new Employee("Carol", "IT", 200, 35, List.of("s")));
    assertEquals(List.of("Bob", "Carol", "Alice"), Task37.topEarners(staff, 3));
  }
}
