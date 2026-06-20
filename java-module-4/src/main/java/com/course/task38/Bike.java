package com.course.task38;

/**
 * Велосипед с максимальной скоростью 30 км/ч.
 */
public class Bike extends Vehicle {

    public Bike(String brand) {
        super(brand);
    }

    @Override
    public double maxSpeed() {
        return 30.0;
    }
}
