package com.course.tasks;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.course.model.Employee;
import java.util.List;
import java.util.Map;
import org.junit.jupiter.api.Test;

class Task43Test {

  private static final double DELTA = 1e-9;

  private static Employee emp(String name, String dept, int salary) {
    return new Employee(name, dept, salary, 30, List.of());
  }

  @Test
  void avgSalaryByDept_computesAveragePerDepartment() {
    Employee alice = emp("Alice", "IT", 100);
    Employee bob = emp("Bob", "IT", 200);
    Employee carol = emp("Carol", "HR", 150);

    Map<String, Double> result = Task43.avgSalaryByDept(List.of(alice, bob, carol));

    assertEquals(2, result.size());
    assertEquals(150.0, result.get("IT"), DELTA);
    assertEquals(150.0, result.get("HR"), DELTA);
  }

  @Test
  void avgSalaryByDept_returnsEmptyMapForEmptyInput() {
    assertEquals(Map.of(), Task43.avgSalaryByDept(List.of()));
  }

  @Test
  void avgSalaryByDept_singleEmployeeReturnsHisSalary() {
    Map<String, Double> result = Task43.avgSalaryByDept(List.of(emp("Alice", "IT", 100)));

    assertEquals(1, result.size());
    assertEquals(100.0, result.get("IT"), DELTA);
  }

  @Test
  void avgSalaryByDept_allSameDepartmentAveragesAllSalaries() {
    List<Employee> staff = List.of(
        emp("Alice", "IT", 100),
        emp("Bob", "IT", 200),
        emp("Dave", "IT", 300));

    Map<String, Double> result = Task43.avgSalaryByDept(staff);

    assertEquals(1, result.size());
    assertEquals(200.0, result.get("IT"), DELTA);
  }

  @Test
  void avgSalaryByDept_producesFractionalAverageWhenNotDivisible() {
    List<Employee> staff = List.of(
        emp("Alice", "IT", 100),
        emp("Bob", "IT", 101));

    Map<String, Double> result = Task43.avgSalaryByDept(staff);

    assertEquals(100.5, result.get("IT"), DELTA);
  }
}
