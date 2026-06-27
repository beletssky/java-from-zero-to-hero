package com.course.task38;

/**
 * Самолёт с максимальной скоростью 900 км/ч.
 */
public class Plane extends Vehicle {

    public Plane(String brand) {
        super(brand);
    }

    @Override
    public double maxSpeed() {
        return 900.00;
    }
}
