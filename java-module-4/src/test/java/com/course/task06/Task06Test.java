package com.course.task06;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Task06Test {

    @Test
    void employeeConstructorSetsFields() {
        Employee e = new Employee("Alice", 50_000L);
        assertEquals("Alice", e.getName());
        assertEquals(50_000L, e.getSalary());
    }

    @Test
    void managerConstructorSetsAllFields() {
        Manager m = new Manager("Bob", 80_000L, 5);
        assertEquals("Bob", m.getName());
        assertEquals(80_000L, m.getSalary());
        assertEquals(5, m.getTeamSize());
    }

    @Test
    void managerTotalCostCalculatesCorrectly() {
        Manager m = new Manager("Bob", 80_000L, 5);
        assertEquals(80_000L + 5 * 1_000L, m.getTotalCost());
    }

    @Test
    void managerWithZeroTeamHasOnlySalary() {
        Manager m = new Manager("Carol", 60_000L, 0);
        assertEquals(60_000L, m.getTotalCost());
    }

    @Test
    void polymorphicReferenceReadsInheritedFields() {
        Employee e = new Manager("Dan", 70_000L, 3);
        assertEquals("Dan", e.getName());
        assertEquals(70_000L, e.getSalary());
    }
}
