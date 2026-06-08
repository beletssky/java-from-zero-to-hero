package com.course.task17;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Task17Test {

  @Test
  void vehicleToStringHasExpectedFormat() {
    Vehicle v = new Vehicle("Toyota", 2020);
    assertEquals("Vehicle{brand=Toyota, year=2020}", v.toString());
  }

  @Test
  void carToStringContainsVehiclePart() {
    Car c = new Car("BMW", 2021, 5);
    assertTrue(c.toString().contains("Vehicle{brand="));
  }

  @Test
  void carToStringContainsSeats() {
    Car c = new Car("Mini", 2019, 2);
    assertTrue(c.toString().contains("seats=2"));
  }

  @Test
  void carToStringHasFullFormat() {
    Car c = new Car("Audi", 2022, 4);
    assertEquals("Vehicle{brand=Audi, year=2022}, seats=4", c.toString());
  }

  @Test
  void polymorphismViaParentReference() {
    Vehicle v = new Car("Ford", 2018, 5);
    assertTrue(v.toString().contains("seats=5"));
    assertTrue(v.toString().contains("brand=Ford"));
  }
}
