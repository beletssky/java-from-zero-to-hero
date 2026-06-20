package com.course.task38;

/**
 * Автомобиль с максимальной скоростью 200 км/ч.
 */
public class Car extends Vehicle {

    public Car(String brand) {
        super(brand);
    }

    @Override
    public double maxSpeed() {
        return 200.0;
    }
}
