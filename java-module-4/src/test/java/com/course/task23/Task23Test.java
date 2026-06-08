package com.course.task23;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Task23Test {

  @Test
  void employeeGettersViaSubclass() {
    Employee e = new FullTimeEmployee("Alice", 5000L);
    assertEquals("Alice", e.getName());
    assertEquals(5000L, e.getBaseSalary());
  }

  @Test
  void fullTimeEmployeeMonthlyPayEqualsBaseSalary() {
    FullTimeEmployee f = new FullTimeEmployee("Bob", 7000L);
    assertEquals(7000L, f.getMonthlyPay());
  }

  @Test
  void partTimeEmployeeGetters() {
    PartTimeEmployee p = new PartTimeEmployee("Carol", 0L, 40, 25L);
    assertEquals(40, p.getHoursWorked());
    assertEquals(25L, p.getHourlyRate());
  }

  @Test
  void partTimeEmployeeMonthlyPayIsHoursTimesRate() {
    PartTimeEmployee p = new PartTimeEmployee("Dan", 0L, 100, 30L);
    assertEquals(3000L, p.getMonthlyPay());
  }

  @Test
  void polymorphicEmployeeArrayComputesPay() {
    Employee[] team = {
        new FullTimeEmployee("Eve", 4000L),
        new PartTimeEmployee("Frank", 0L, 20, 50L)
    };
    assertEquals(4000L, team[0].getMonthlyPay());
    assertEquals(1000L, team[1].getMonthlyPay());
  }
}
