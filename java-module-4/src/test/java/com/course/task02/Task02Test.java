package com.course.task02;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Task02Test {

    @Test
    void vehicleConstructorSetsFields() {
        Vehicle v = new Vehicle("Toyota", 2020);
        assertEquals("Toyota", v.getBrand());
        assertEquals(2020, v.getYear());
    }

    @Test
    void vehicleDescribeReturnsBrandAndYear() {
        Vehicle v = new Vehicle("Toyota", 2020);
        assertEquals("Toyota 2020", v.describe());
    }

    @Test
    void carConstructorSetsAllFields() {
        Car car = new Car("BMW", 2023, 5);
        assertEquals("BMW", car.getBrand());
        assertEquals(2023, car.getYear());
        assertEquals(5, car.getSeats());
    }

    @Test
    void carDescribeOverridesParent() {
        Car car = new Car("BMW", 2023, 5);
        assertEquals("BMW 2023, 5 seats", car.describe());
    }

    @Test
    void polymorphicReferenceCallsOverriddenDescribe() {
        Vehicle v = new Car("Audi", 2024, 4);
        assertEquals("Audi 2024, 4 seats", v.describe());
    }
}
