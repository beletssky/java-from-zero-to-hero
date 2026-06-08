package com.course.task38;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Task38Test {

    @Test
    void carMaxSpeedShouldBe200() {
        Car c = new Car("Toyota");
        assertEquals(200.0, c.maxSpeed(), 1e-9);
    }

    @Test
    void bikeMaxSpeedShouldBe30() {
        Bike b = new Bike("Giant");
        assertEquals(30.0, b.maxSpeed(), 1e-9);
    }

    @Test
    void planeMaxSpeedShouldBe900() {
        Plane p = new Plane("Boeing");
        assertEquals(900.0, p.maxSpeed(), 1e-9);
    }

    @Test
    void brandShouldBeAccessibleThroughGetter() {
        Vehicle v = new Car("Honda");
        assertEquals("Honda", v.getBrand());
    }

    @Test
    void raceFastestShouldReturnPlaneInstance() {
        Car car = new Car("Toyota");
        Bike bike = new Bike("Giant");
        Plane plane = new Plane("Boeing");
        Vehicle[] vehicles = { car, bike, plane };
        Race race = new Race();
        Vehicle winner = race.fastest(vehicles);
        assertSame(plane, winner);
    }

    @Test
    void raceFastestShouldWorkPolymorphicallyWithSingleElement() {
        Vehicle[] vehicles = { new Bike("Trek") };
        Race race = new Race();
        Vehicle winner = race.fastest(vehicles);
        assertEquals(30.0, winner.maxSpeed(), 1e-9);
    }
}
