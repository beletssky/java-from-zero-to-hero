package com.course.task17;

/**
 * Транспортное средство.
 * Хранит марку и год выпуска.
 */
public class Vehicle {

    protected String brand;
    protected int year;

    public Vehicle(String brand, int year) {
        // TODO: реализуй
        this.brand = brand;
        this.year = year;
    }

    @Override
    public String toString() {
        // TODO: реализуй
        return "Vehicle{brand=" + brand + ", year=" + year + "}";
    }
}
